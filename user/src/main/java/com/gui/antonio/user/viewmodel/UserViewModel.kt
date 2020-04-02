package com.gui.antonio.user.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.gui.antonio.user.repository.IUserRepository
import com.gui.antonio.user.repository.UserRepository
import kotlinx.coroutines.Dispatchers

class UserViewModel : ViewModel() {

    private var iUserRepository: IUserRepository = UserRepository()
    val userLiveData = liveData(Dispatchers.IO) { emit(iUserRepository.users())}

}
