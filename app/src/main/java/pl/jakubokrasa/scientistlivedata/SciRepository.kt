package pl.jakubokrasa.scientistlivedata

import androidx.lifecycle.LiveData

interface SciRepository {
    suspend fun insertScientist(scientist: Scientist)

    fun getScientists(): LiveData<List<Scientist>>
}