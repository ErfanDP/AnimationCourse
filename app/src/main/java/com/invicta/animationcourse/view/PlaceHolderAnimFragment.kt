package com.invicta.animationcourse.view

import android.os.Bundle
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Placeholder
import com.invicta.animationcourse.R


class PlaceHolderAnimFragment: Fragment() ,View.OnClickListener{
	private lateinit var  root : ConstraintLayout
	private lateinit var  placeholder: Placeholder
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val view =  inflater.inflate(R.layout.fragment_place_holder_anim, container, false)
		val image1 :ImageView = view.findViewById(R.id.image1)
		val image2 :ImageView = view.findViewById(R.id.image2)
		val image3 :ImageView = view.findViewById(R.id.image3)
		placeholder = view.findViewById(R.id.placeholderWidget)
		root = view.findViewById(R.id.root_place_holder)
		image1.setOnClickListener(this)
		image2.setOnClickListener(this)
		image3.setOnClickListener(this)
		return view
	}
	
	companion object {
		@JvmStatic
		fun newInstance() = PlaceHolderAnimFragment()
	}
	
	override fun onClick(v: View?) {
		TransitionManager.beginDelayedTransition(root)
		v?.let {
			placeholder.setContentId(it.id)
		}
		
	}
}