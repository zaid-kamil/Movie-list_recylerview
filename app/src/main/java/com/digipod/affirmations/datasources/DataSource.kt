package com.digipod.affirmations.datasources

import com.digipod.affirmations.R
import com.digipod.affirmations.models.Movie

class DataSource {
    fun loadMovies(): List<Movie>{
        return listOf(
            Movie(R.string.movie1),
            Movie(R.string.movie2),
            Movie(R.string.movie3),
            Movie(R.string.movie4),
            Movie(R.string.movie5),
            Movie(R.string.movie6),
            Movie(R.string.movie7),
            Movie(R.string.movie8),
            Movie(R.string.movie9),
            Movie(R.string.movie10),
            Movie(R.string.movie11),
            Movie(R.string.movie12),
            Movie(R.string.movie13),
            Movie(R.string.movie14),
            Movie(R.string.movie15),
            Movie(R.string.movie16),
            Movie(R.string.movie17),
            Movie(R.string.movie18),
            Movie(R.string.movie19),
            Movie(R.string.movie20)
        )
    }
}