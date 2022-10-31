package com.digipod.affirmations.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
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
        // todo: bind data to view
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(context).inflate(layoutResId, parent, false)
        return MovieHolder(view)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = movies.size
}