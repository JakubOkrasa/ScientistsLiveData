package pl.jakubokrasa.scientistlivedata.di

import android.content.Context
import androidx.room.Room
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import pl.jakubokrasa.scientistlivedata.SciDB
import pl.jakubokrasa.scientistlivedata.SciRepositoryImpl


val dataModule = module {single { createDatabase(androidContext()) }
    single { get<SciDB>().sciDao() }

    single {SciRepositoryImpl(get()) }
}

private fun createDatabase(context: Context) =
    Room.databaseBuilder(
        context,
        SciDB::class.java,
        "sci_db"
    )
        .fallbackToDestructiveMigration()
        .build()