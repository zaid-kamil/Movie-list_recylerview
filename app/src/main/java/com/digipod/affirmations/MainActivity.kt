package com.digipod.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.digipod.affirmations.adapters.MovieAdapter
import com.digipod.affirmations.databinding.ActivityMainBinding
import com.digipod.affirmations.datasources.DataSource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movies = DataSource().loadMovies()
        val adapter = MovieAdapter(
            this,                                  // context
            movies,                                // list of movies
            R.layout.simple_row_layout             // layout for each row
        )
        binding.movieList.layoutManager = LinearLayoutManager(this)
        binding.movieList.adapter = adapter
    }
}