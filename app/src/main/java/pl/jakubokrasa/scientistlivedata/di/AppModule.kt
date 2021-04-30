package pl.jakubokrasa.scientistlivedata.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import pl.jakubokrasa.scientistlivedata.*

val appModule = module {
    factory<SciRepository> { SciRepositoryImpl(get()) }
    factory { InsertScientistUseCase(get()) }
    factory { GetScientistsUseCase(get()) }

    factory { RvAdapter() }
    viewModel { SciViewModel(get(), get()) }
}