package pl.jakubokrasa.scientistlivedata

class InsertScientistUseCase(private val sciRepository: SciRepository): UseCase<Unit, Scientist>() {
    override suspend fun action(params: Scientist) {
        sciRepository.insertScientist(params)
    }


}