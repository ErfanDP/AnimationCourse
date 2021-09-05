package com.invicta.animationcourse.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.invicta.animationcourse.R
import com.invicta.animationcourse.databinding.FragmentResourceAnimBinding
import com.invicta.animationcourse.viewModel.ResourceAnimViewModel


class ResourceAnimFragment: Fragment() {
	private val resourceAnimViewModel : ResourceAnimViewModel by viewModels()
	lateinit var binding :  FragmentResourceAnimBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		// Inflate the layout for this fragment
		binding = DataBindingUtil
			.inflate(inflater,R.layout.fragment_resource_anim, container, false)
		binding.viewModel = resourceAnimViewModel
		return binding.root
	}
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		resourceAnimViewModel.buttonClicked.observe(viewLifecycleOwner){
			if(it){
				binding.resButton.startAnimation(AnimationUtils.loadAnimation(context,R.anim.animate_one))
			}
		}
	}
	
	companion object {
		@JvmStatic
		fun newInstance() = ResourceAnimFragment()
	}
}