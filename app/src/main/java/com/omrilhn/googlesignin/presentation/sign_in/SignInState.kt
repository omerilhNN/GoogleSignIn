package com.omrilhn.googlesignin.presentation.sign_in

data class SignInState(
    val isSignInSuccesful:Boolean= false,
    val signInError : String? = null
)
