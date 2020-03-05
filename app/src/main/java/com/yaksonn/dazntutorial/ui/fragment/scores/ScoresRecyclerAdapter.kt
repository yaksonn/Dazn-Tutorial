package com.yaksonn.dazntutorial.ui.fragment.scores

import android.graphics.Color
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.row_scores_recycler.view.*
import com.yaksonn.dazntutorial.R

class ScoresRecyclerAdapter(val teamMatchViewModel: List<TeamMatchViewModel>) :
    RecyclerView.Adapter<ScoresRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_scores_recycler, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return teamMatchViewModel.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val matchViewModel = teamMatchViewModel.get(position)
        viewHolder.teamATextView.text = matchViewModel.teamAName
        viewHolder.teamBTextView.text = matchViewModel.teamBName
        viewHolder.scoreTextView.text =
            matchViewModel.teamAScore + " - " + matchViewModel.teamBScore

        var backgroundColor: Int
        if (position % 2 == 0) {
            backgroundColor = Color.parseColor("#FFFFFF")
        } else {
            backgroundColor = Color.parseColor("#cfcfcf")
        }
        viewHolder.rlRoot.setBackgroundColor(backgroundColor)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val teamATextView: TextView = itemView.teamATextView
        val teamBTextView: TextView = itemView.teamBTextView
        val scoreTextView: TextView = itemView.scoreTextView
        val rlRoot: ConstraintLayout = itemView.container
    }
}