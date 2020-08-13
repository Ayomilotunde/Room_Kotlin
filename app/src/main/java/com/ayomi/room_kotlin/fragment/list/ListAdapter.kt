package com.ayomi.room_kotlin.fragment.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayomi.room_kotlin.R
import com.ayomi.room_kotlin.data.User
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.txt_id.text = currentItem.id.toString()
        holder.itemView.txt_firstname.text = currentItem.firstname
        holder.itemView.txt_lastname.text = currentItem.lastname
        holder.itemView.txt_age.text = currentItem.age.toString()
    }

    fun setData(user: List<User>) {
        this.userList = user
        notifyDataSetChanged()
    }
}