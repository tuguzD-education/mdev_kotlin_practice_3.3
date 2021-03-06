package io.github.tuguzd.recyclerviewexample.view

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import io.github.tuguzd.recyclerviewexample.R
import io.github.tuguzd.recyclerviewexample.databinding.ItemPersonBinding
import io.github.tuguzd.recyclerviewexample.model.Person
import io.github.tuguzd.recyclerviewexample.model.Sex

class PersonViewHolder(private val binding: ItemPersonBinding) : ViewHolder(binding.root) {
    fun bind(person: Person): Unit = binding.run {
        name.text = person.name
        phoneNumber.text = person.phoneNumber.toString()
        val image = when (person.sex) {
            Sex.Male -> R.drawable.ic_round_man_24
            Sex.Female -> R.drawable.ic_round_woman_24
            Sex.Unknown -> R.drawable.ic_round_question_mark_24
        }
        sexImage.setImageResource(image)
    }
}
