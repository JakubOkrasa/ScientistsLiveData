package pl.jakubokrasa.scientistlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

class SciViewModel(
    private val getScientistsUseCase: GetScientistsUseCase,
    private val insertScientistUseCase: InsertScientistUseCase,
): ViewModel() {

    fun getScientists(): LiveData<List<Scientist>> {
        return getScientistsUseCase(params = Unit)
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