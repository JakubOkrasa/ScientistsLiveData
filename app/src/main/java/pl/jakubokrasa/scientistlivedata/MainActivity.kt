package pl.jakubokrasa.scientistlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val sciViewModel: SciViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sciViewModel.scientists.observe(this, {
            updateList()
        })

    }

    private fun updateList() {
        TODO("Not yet implemented")
    }
}