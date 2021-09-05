package com.invicta.animationcourse.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.invicta.animationcourse.R
import com.invicta.animationcourse.databinding.FragmentClassicAnimationsBinding
import com.invicta.animationcourse.viewModel.ClassicAnimationsViewModel

class ClassicAnimationsFragment: Fragment() {
	private lateinit var classicAnimationFragmentBinding:FragmentClassicAnimationsBinding
	private val classicAnimationsViewModel : ClassicAnimationsViewModel by viewModels()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View{
		classicAnimationFragmentBinding = DataBindingUtil.inflate(inflater,R.layout
			.fragment_classic_animations,container,false)
		classicAnimationFragmentBinding.viewModel = classicAnimationsViewModel
		return classicAnimationFragmentBinding.root
	}
	
	companion object {
		@JvmStatic
		fun newInstance() = ClassicAnimationsFragment()
	}
}