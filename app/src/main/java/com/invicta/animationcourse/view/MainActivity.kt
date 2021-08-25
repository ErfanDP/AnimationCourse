package com.invicta.animationcourse.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.invicta.animationcourse.*
import com.invicta.animationcourse.data.ButtonType
import com.invicta.animationcourse.data.Constants
import com.invicta.animationcourse.viewModel.MainViewModel

class MainActivity: AppCompatActivity() {
	private val viewModel: MainViewModel by viewModels()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		initObservers()
		createFragment(MainPageFragment.newInstance())
	}
	
	private fun initObservers() {
		viewModel.selectedItem.observe(this) {
			when (it) {
				ButtonType.CONSTRAINT_SET -> {
					createFragment(ConstraintSetsAnimFragment.newInstance())
				}
				ButtonType.PLACEHOLDER -> {
					createFragment(PlaceHolderAnimFragment.newInstance())
				}
				else -> {
					Log.d(Constants.LogTagBruh, "bruh")
				}
			}
		}
	}
	
	
	private fun createFragment(fragment: Fragment) {
		supportFragmentManager
			.beginTransaction()
			.add(R.id.container, fragment)
			.commit()
	}
	
}