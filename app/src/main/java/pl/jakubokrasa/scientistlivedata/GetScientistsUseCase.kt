package pl.jakubokrasa.scientistlivedata

import androidx.lifecycle.LiveData

class GetScientistsUseCase(private val sciRepository: SciRepository): UseCaseLiveData<LiveData<List<Scientist>>, Unit>() {
    override fun action(params: Unit): LiveData<List<Scientist>> {
        return sciRepository.getScientists()
    }

}