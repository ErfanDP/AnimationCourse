package com.invicta.animationcourse.view.fragments

import android.animation.AnimatorSet
import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.invicta.animationcourse.R
import com.invicta.animationcourse.databinding.FragmentObjectAnimatorBinding


class ObjectAnimatorFragment: Fragment() {

	private lateinit var binding :FragmentObjectAnimatorBinding
	private lateinit var scaleX : ObjectAnimator
	private lateinit var translationY : ObjectAnimator
	private lateinit var colorAnim : ObjectAnimator
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		binding = DataBindingUtil.inflate(inflater,
										  R.layout.fragment_object_animator,
										  container,
										  false)
		initObjectAnimators()
		val animatorSet = AnimatorSet()
		animatorSet.duration = 1000
		animatorSet.playTogether(scaleX,translationY,colorAnim)
		binding.buttonClickMe.setOnClickListener {
			if(animatorSet.isRunning){
				animatorSet.end()
			}else{
				animatorSet.start()
			}
		}
		return binding.root
	}
	
	private fun initObjectAnimators() {
		scaleX = ObjectAnimator.ofFloat(binding.buttonClickMe,
										"scaleX",
										3F)
		initObjectAnimatorFields(scaleX)
		
		translationY = ObjectAnimator.ofFloat(binding.buttonClickMe,
											  "translationY",
											  300F)
		initObjectAnimatorFields(translationY)
		
		colorAnim = ObjectAnimator.ofObject(binding.buttonClickMe,
											"textColor",
											ArgbEvaluator(),
											Color.RED,
											Color.GREEN)
		initObjectAnimatorFields(colorAnim)
		
	}
	
	private fun initObjectAnimatorFields(objectAnimator: ObjectAnimator) {
		objectAnimator.repeatMode = ValueAnimator.REVERSE
		objectAnimator.repeatCount = ValueAnimator.INFINITE
	}
	
	companion object {
	
		@JvmStatic
		fun newInstance() = ObjectAnimatorFragment()
	}
}