package com.invicta.animationcourse.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.invicta.animationcourse.data.ButtonType

class MainViewModel : ViewModel() {
	private val mutableSelectedItem = MutableLiveData<ButtonType>()
	val selectedItem: LiveData<ButtonType> get() = mutableSelectedItem
	
	fun selectItem(buttonType: ButtonType) {
		mutableSelectedItem.value = buttonType
	}
	
	
}