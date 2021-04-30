package pl.jakubokrasa.scientistlivedata

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val sciViewModel: SciViewModel by inject()
    private val rvAdapter: RvAdapter by inject()

            private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)

        initRecycler()
        observeScientists()
    }

    private fun observeScientists() {
        sciViewModel.scientists.observe(this, {
                rvAdapter.setItems(it)
        })
    }

    private fun initRecycler() {
        with(recyclerView) {
            setHasFixedSize(true)
            adapter = rvAdapter
        }
    }

    //onClick Insert
    fun insertScientist(view: View) {
        val name = randomString(7)
        sciViewModel.insertScientist(Scientist(0, name))
    }

    private fun randomString(len: Int): String {
        val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        return (1..len)
            .map { i -> kotlin.random.Random.nextInt(0, charPool.size) }
            .map(charPool::get)
            .joinToString("");
    }
}