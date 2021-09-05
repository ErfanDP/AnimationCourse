package com.invicta.animationcourse.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.invicta.animationcourse.data.ButtonType
import com.invicta.animationcourse.utils.SingleLiveData

class MainViewModel : ViewModel() {
	val selectedItem = SingleLiveData<ButtonType>()
	
	fun selectItem(buttonType: ButtonType) {
		selectedItem.value = buttonType
	}
	
	
	
	
}