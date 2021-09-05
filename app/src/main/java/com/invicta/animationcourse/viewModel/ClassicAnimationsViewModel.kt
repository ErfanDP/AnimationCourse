package com.invicta.animationcourse.viewModel

import android.app.Application
import android.view.View
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.ScaleAnimation
import android.view.animation.TranslateAnimation
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class ClassicAnimationsViewModel(application: Application): AndroidViewModel(application) {
	private val translateAnimation = TranslateAnimation(0F, -100F, 0F, 200F)
	private val scaleAnimation = ScaleAnimation(1F,2F,1F,2F)
	private val rotateAnimation = RotateAnimation(0F,360F)
	
	fun onHalloButtonClicked(view: View){
		val animationSet = AnimationSet(getApplication(),null)
		animationSet.addAnimation(translateAnimation)
		animationSet.addAnimation(scaleAnimation)
		animationSet.addAnimation(rotateAnimation)
		animationSet.duration = 3000
		view.startAnimation(animationSet)
	}
}