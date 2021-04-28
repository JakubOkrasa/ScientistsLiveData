package pl.jakubokrasa.scientistlivedata

import androidx.lifecycle.LiveData

class SciRepositoryImpl(private val sciDao: SciDao): SciRepository {
    override suspend fun insertScientist(scientist: Scientist) {
        sciDao.insertScientist()
    }

    override fun getScientists(): LiveData<List<Scientist>> {
        return sciDao.getScientists()
    }

}