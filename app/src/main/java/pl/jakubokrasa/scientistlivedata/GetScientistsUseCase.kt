package pl.jakubokrasa.scientistlivedata

import androidx.lifecycle.LiveData

class GetScientistsUseCase(private val sciRepository: SciRepository): UseCase<LiveData<List<Scientist>>, Unit>() {
    override suspend fun action(params: Unit): LiveData<List<Scientist>> {
        return sciRepository.getScientists()
    }

}