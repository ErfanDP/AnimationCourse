package com.invicta.animationcourse.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.invicta.animationcourse.data.ButtonType

class MainViewModel : ViewModel() {
	val selectedItem = MutableLiveData<ButtonType>()
	
	fun selectItem(buttonType: ButtonType) {
		selectedItem.value = buttonType
	}
	
	
	
	
}