package com.invicta.animationcourse.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.invicta.animationcourse.*
import com.invicta.animationcourse.data.ButtonType
import com.invicta.animationcourse.data.Constants
import com.invicta.animationcourse.view.fragments.ConstraintSetsAnimFragment
import com.invicta.animationcourse.view.fragments.MainPageFragment
import com.invicta.animationcourse.view.fragments.MainPageFragmentDirections
import com.invicta.animationcourse.view.fragments.PlaceHolderAnimFragment
import com.invicta.animationcourse.viewModel.MainViewModel

class MainActivity: AppCompatActivity() {
	private val viewModel: MainViewModel by viewModels()
	private lateinit var navController: NavController
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val navHostFragment =
			supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
		navController = navHostFragment.navController
		initObservers()
	}
	
	private fun initObservers() {
		viewModel.selectedItem.observe(this) {
			navigate(it)
		}
	}
	
	
	private fun navigate(buttonType: ButtonType) {
		val action = when (buttonType) {
			ButtonType.CONSTRAINT_SET -> {
				MainPageFragmentDirections.actionMainPageFragmentToConstraintSetsAnimFragment()
			}
			ButtonType.PLACEHOLDER -> {
				MainPageFragmentDirections.actionMainPageFragmentToPlaceHolderAnimFragment()
			}
			ButtonType.CLASSIC->{
				MainPageFragmentDirections.actionMainPageFragmentToClassicAnimationsFragment()
			}
		}
		action.let {
			navController.navigate(action)
		}
	}
	
}