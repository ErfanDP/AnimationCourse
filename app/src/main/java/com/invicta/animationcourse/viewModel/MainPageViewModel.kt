package com.invicta.animationcourse.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.invicta.animationcourse.data.ButtonType

class MainPageViewModel : ViewModel() {
	val buttonTypeClicked  = MutableLiveData<ButtonType>()
	fun onPlaceHolderButtonClicked(){
		buttonTypeClicked.value = ButtonType.PLACEHOLDER
	}
	
	fun onConstrainSetButtonClicked(){
		buttonTypeClicked.value = ButtonType.CONSTRAINT_SET
	}
}