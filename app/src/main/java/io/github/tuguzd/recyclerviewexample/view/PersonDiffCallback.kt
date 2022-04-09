package io.github.tuguzd.recyclerviewexample.view

import androidx.recyclerview.widget.DiffUtil
import io.github.tuguzd.recyclerviewexample.model.Person

object PersonDiffCallback : DiffUtil.ItemCallback<Person>() {
    override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean = oldItem == newItem

    override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean = oldItem == newItem
}
