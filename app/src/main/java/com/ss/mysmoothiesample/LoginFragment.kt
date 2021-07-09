package com.ss.mysmoothiesample

import android.text.Editable
import androidx.navigation.fragment.findNavController
import com.ss.mysmoothiesample.databinding.FragmentLoginBinding
import com.ss.mysmoothiesample.databinding.FragmentSignupBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override var layout = R.layout.fragment_login

    fun validateEmailAddress(s : Editable){
        // If needed
    }

    fun onClickLogin(){
        findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
    }

}