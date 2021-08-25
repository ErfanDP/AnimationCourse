package com.invicta.animationcourse.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.invicta.animationcourse.viewModel.MainPageViewModel
import com.invicta.animationcourse.viewModel.MainViewModel
import com.invicta.animationcourse.R
import com.invicta.animationcourse.databinding.FragmentMainPageBinding

class MainPageFragment: Fragment() {
	private lateinit var  setConstrains : Button
	private lateinit var placeHolderAnim : Button
	
	private val activityViewModel by activityViewModels<MainViewModel>()
	private val viewModel by viewModels<MainPageViewModel>()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		val mainPageBinding = DataBindingUtil
			.inflate<FragmentMainPageBinding>(layoutInflater,
											  R.layout.fragment_main_page,
											  container,
											  false)
		mainPageBinding.viewModel = this.viewModel
		return mainPageBinding.root
	}
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		
	}
	
	companion object {
		
		fun newInstance() = MainPageFragment()
	}
}