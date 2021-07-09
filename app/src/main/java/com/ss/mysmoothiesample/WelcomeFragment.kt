package com.ss.mysmoothiesample

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.ss.mysmoothiesample.databinding.FragmentWelcomeBinding

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>() {

    override var layout = R.layout.fragment_welcome

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.clickHandler = this
    }

    fun onClickSignUp(){
        findNavController().navigate(R.id.action_welcomeFragment_to_signUpFragment)
    }

    fun onClickLogin(){
        findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
    }
    
}