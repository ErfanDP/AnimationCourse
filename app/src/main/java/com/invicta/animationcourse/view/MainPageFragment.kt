package com.invicta.animationcourse.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.invicta.animationcourse.viewModel.MainPageViewModel
import com.invicta.animationcourse.viewModel.MainViewModel
import com.invicta.animationcourse.R

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
		val view = inflater.inflate(R.layout.fragment_main_page, container, false)
		
		initButtons()
		return view
	}
	private fun initButtons() {
		setConstrains.setOnClickListener {
		
		}
		
		placeHolderAnim.setOnClickListener {
		}
	}
	
	companion object {
		
		fun newInstance() = MainPageFragment()
	}
}