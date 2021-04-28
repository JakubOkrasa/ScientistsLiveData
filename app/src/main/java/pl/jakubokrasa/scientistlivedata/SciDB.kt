package pl.jakubokrasa.scientistlivedata

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Scientist::class], version = 1, exportSchema = false)
abstract class SciDB : RoomDatabase() {
    abstract fun sciDao(): SciDao
}