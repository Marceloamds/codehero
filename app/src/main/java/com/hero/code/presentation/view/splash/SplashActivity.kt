package com.hero.code.presentation.view.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hero.code.R
import com.hero.code.databinding.ActivitySplashBinding
import com.hero.code.presentation.util.extension.onGoTo
import com.hero.code.presentation.util.extension.transparentStatusAndNavigation
import org.koin.android.viewmodel.ext.android.viewModel

class SplashActivity : AppCompatActivity() {

    private val _viewModel: SplashViewModel by viewModel()

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        transparentStatusAndNavigation(window)
        subscribeUi()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
    }

    private fun subscribeUi() {
        _viewModel.goTo.observe(this, ::onGoTo)
    }
}