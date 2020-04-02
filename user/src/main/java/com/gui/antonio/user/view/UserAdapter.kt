package com.gui.antonio.user.view

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.gui.antonio.retrofitcoroutineexample.database.entity.UserEntity
import com.gui.antonio.user.R
import com.gui.antonio.user.databinding.ItemUserBinding

class UserAdapter(val listUser: List<UserEntity>) :
    RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemUserBinding?.user = listUser[position]
        holder.itemUserBinding?.handlerClick = HandlerClick()
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemUserBinding: ItemUserBinding? = DataBindingUtil.bind(itemView)
    }

    class HandlerClick {
        fun onClickItem(view: View) {
            Log.v("TAG", "here")
        }
    }
}