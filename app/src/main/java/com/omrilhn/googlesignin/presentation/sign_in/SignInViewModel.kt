package com.omrilhn.googlesignin.presentation.sign_in

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class SignInViewModel:ViewModel(){
    private val _state = MutableStateFlow(SignInState())
    val state = _state.asStateFlow()

    fun onSignInResult(result :SignInResult){
        _state.update { it.copy(
            isSignInSuccesful = result.data !=null,
            signInError = result.errorMessage
        ) }
    }
    fun resetState(){
        _state.update { SignInState() }

    }
}