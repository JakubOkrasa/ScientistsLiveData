package pl.jakubokrasa.scientistlivedata

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

abstract class UseCaseLiveData<out Type, in Params> {
    abstract fun action(params: Params): Type

    operator fun invoke(
            params: Params,
    ): Type { return action(params) }
}