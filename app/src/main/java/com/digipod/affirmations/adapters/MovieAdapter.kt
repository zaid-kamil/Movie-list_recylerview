package com.digipod.affirmations.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digipod.affirmations.R
import com.digipod.affirmations.models.Movie

/*
step 1: create a holder inside adapter
step 2: create a Constructor for adapter
step 3: implement onCreateViewHolder
step 4: implement getItemCount
step 5: implement onBindViewHolder
 */
class MovieAdapter(
    private val context: Context,
    private val movies: List<Movie>,
    private val layoutResId: Int
) : RecyclerView.Adapter<MovieAdapter.MovieHolder>() {

    class MovieHolder(
        private val itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val textMovie: TextView = itemView.findViewById(R.id.textMovie)

        fun bind(movie: Movie) {
            textMovie.setText(movie.movieResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(context).inflate(layoutResId, parent, false)
        return MovieHolder(view)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount() = movies.size
}