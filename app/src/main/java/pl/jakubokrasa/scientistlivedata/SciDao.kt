package pl.jakubokrasa.scientistlivedata

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SciDao {

    @Query("SELECT * FROM Scientist")
    fun getScientists(): LiveData<List<Scientist>>

    @Insert
    suspend fun  insertScientist()
}