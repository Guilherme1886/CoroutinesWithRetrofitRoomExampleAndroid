package com.gui.antonio.user.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.gui.antonio.retrofitcoroutineexample.database.entity.UserEntity
import com.gui.antonio.user.R
import com.gui.antonio.user.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.fragment_user.*

class UserFragment : Fragment() {

    private lateinit var userViewModel: UserViewModel
    private var listUser = ArrayList<UserEntity>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModelAndObservers()
    }

    private fun initViewModelAndObservers() {
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        userViewModel.userLiveData.observe(
            this,
            Observer { it?.forEach { result -> listUser.add(result) }
                rv.layoutManager = LinearLayoutManager(activity)
                rv.adapter = UserAdapter(listUser)
            })
    }
}
