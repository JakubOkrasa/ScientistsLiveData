package pl.jakubokrasa.scientistlivedata.di

import org.koin.core.module.Module

val koinInjector: List<Module> = listOf(
    dataModule,
)