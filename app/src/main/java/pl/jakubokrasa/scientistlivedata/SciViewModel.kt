package pl.jakubokrasa.scientistlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

class SciViewModel(
    private val getScientistsUseCase: GetScientistsUseCase,
    private val insertScientistUseCase: InsertScientistUseCase,
): ViewModel() {

    val scientists by lazy {
        MutableLiveData<List<Scientist>>()
            .also { getScientists(it) }
    }

    private fun getScientists(sciLiveData: MutableLiveData<List<Scientist>>) {
        getScientistsUseCase(
            params = Unit,
            scope = viewModelScope
        ) {
            result ->
                result.onSuccess{ sciLiveData.value = it.value  }
                result.onFailure {  }
        }
    }

    fun insertScientist(scientist: Scientist) {
        insertScientistUseCase(
            params = scientist,
            scope = viewModelScope
        ) {
                result ->
            result.onSuccess {  }
            result.onFailure {  }
        }
    }
}