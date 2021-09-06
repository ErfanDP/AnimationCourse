package com.invicta.animationcourse.view.fragments

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.invicta.animationcourse.R
import com.invicta.animationcourse.databinding.FragmentBackgroundAnimationBinding
import com.invicta.animationcourse.viewModel.BackgroundAnimationViewModel

class BackgroundAnimationFragment: Fragment() {
	
	private val viewModel: BackgroundAnimationViewModel by viewModels()
	private lateinit var  backgroundAnimationBinding: FragmentBackgroundAnimationBinding
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		backgroundAnimationBinding = DataBindingUtil.inflate(inflater,
															 R.layout.fragment_background_animation,
															 container,
															 false)
		val animDrawable:AnimationDrawable = backgroundAnimationBinding
			.buttonInvokeBackgroundAnimation.background as AnimationDrawable
		backgroundAnimationBinding.buttonInvokeBackgroundAnimation.setOnClickListener{
			invokeAnimation(animDrawable)
		}
		return backgroundAnimationBinding.root
	}
	
	private fun invokeAnimation(animDrawable: AnimationDrawable) {
		viewModel.animationIsRunning = if (viewModel.animationIsRunning) {
			animDrawable.stop()
			backgroundAnimationBinding.buttonInvokeBackgroundAnimation.setText(R.string.start)
			false
		} else {
			animDrawable.start()
			backgroundAnimationBinding.buttonInvokeBackgroundAnimation.setText(R.string.stop)
			true
		}
	}
	
	companion object {
		fun newInstance() = BackgroundAnimationFragment()
	}
	
}