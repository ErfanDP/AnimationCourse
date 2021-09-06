package com.invicta.animationcourse.view.fragments

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
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
		binding.buttonClickMe.setOnClickListener { button->
			val objectAnimator = ObjectAnimator.ofFloat(button,"scaleX",5F)
			objectAnimator.duration = 1000
			objectAnimator.repeatMode = ValueAnimator.REVERSE
			objectAnimator.repeatCount = ValueAnimator.INFINITE
			objectAnimator.start()
		}
		return binding.root
	}
	
	companion object {
	
		@JvmStatic
		fun newInstance() = ObjectAnimatorFragment()
	}
}