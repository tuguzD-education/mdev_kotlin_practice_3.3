package io.github.tuguzd.recyclerviewexample.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import io.github.tuguzd.recyclerviewexample.databinding.ItemPersonBinding
import io.github.tuguzd.recyclerviewexample.model.Person

class PersonListAdapter : ListAdapter<Person, PersonViewHolder>(PersonDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemPersonBinding.inflate(layoutInflater, parent, false)
        return PersonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}
