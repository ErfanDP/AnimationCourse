package com.invicta.animationcourse.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.invicta.animationcourse.viewModel.MainPageViewModel
import com.invicta.animationcourse.viewModel.MainViewModel
import com.invicta.animationcourse.R
import com.invicta.animationcourse.databinding.FragmentMainPageBinding

class MainPageFragment: Fragment() {
	private lateinit var  mainPageBinding: FragmentMainPageBinding
	
	private val activityViewModel by activityViewModels<MainViewModel>()
	private val viewModel by viewModels<MainPageViewModel>()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View{
		mainPageBinding = DataBindingUtil.inflate(layoutInflater,
												  R.layout.fragment_main_page,
												  container,
												  false)
		mainPageBinding.viewModel = viewModel
		return mainPageBinding.root
	}
	
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		initObservers()
	}
	
	private fun initObservers() {
		viewModel.buttonTypeClicked.observe(viewLifecycleOwner) {
			it.let { activityViewModel.selectItem(it) }
		}
	}
	
	companion object {
		fun newInstance() = MainPageFragment()
	}
}