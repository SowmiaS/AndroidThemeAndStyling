package com.ss.mysmoothiesample

import android.os.Bundle
import android.text.Editable
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.ss.mysmoothiesample.databinding.FragmentLoginBinding
import com.ss.mysmoothiesample.databinding.FragmentSignupBinding
import com.ss.mysmoothiesample.login.viewmodel.LoginViewModel
import com.ss.mysmoothiesample.login.viewmodel.LoginViewModelFactory
import com.ss.mysmoothiesample.login.viewmodel.repository.LoginRepository

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override var layout = R.layout.fragment_login
    lateinit var viewModel : LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity(), LoginViewModelFactory(LoginRepository())).get(LoginViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginHandler = this
        binding.loginViewModel = viewModel
    }

    fun validateEmailAddress(s : Editable){
        // If needed
    }


    fun onClickLogin(){
        findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
    }

}