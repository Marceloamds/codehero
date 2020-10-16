package com.hero.code.presentation.view.splash

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hero.code.R
import com.hero.code.databinding.ActivitySplashBinding
import com.hero.code.presentation.util.base.BaseActivity
import com.hero.code.presentation.util.base.BaseViewModel
import com.hero.code.presentation.util.extension.transparentStatusAndNavigation
import org.koin.android.viewmodel.ext.android.viewModel

class SplashActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = _viewModel
    private val _viewModel: SplashViewModel by viewModel()

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        transparentStatusAndNavigation(window)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
    }
}