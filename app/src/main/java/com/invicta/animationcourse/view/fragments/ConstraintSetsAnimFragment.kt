package com.invicta.animationcourse.view.fragments

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.Transition
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.OvershootInterpolator
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.invicta.animationcourse.R


class ConstraintSetsAnimFragment: Fragment() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val view =  inflater.inflate(R.layout.fragment_blank, container, false)
		val button : Button = view.findViewById(R.id.button)
		val root :ConstraintLayout = view.findViewById(R.id.frameLayout)
		button.setOnClickListener {
			val set = ConstraintSet()
			set.clone(context, R.layout.fragment_blank_anim)
			set.applyTo(root)
			val transition :Transition = ChangeBounds()
			transition.interpolator = OvershootInterpolator()
			transition.duration = 2000
			TransitionManager.beginDelayedTransition(root,transition)
		}
		return view
	}
	
	companion object {
		@JvmStatic
		fun newInstance() = ConstraintSetsAnimFragment()
	}
}