package pl.jakubokrasa.scientistlivedata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Scientist(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
)
