package com.invicta.animationcourse.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.invicta.animationcourse.data.ButtonType
import com.invicta.animationcourse.utils.SingleLiveData

class MainPageViewModel : ViewModel() {
	val buttonTypeClicked  = SingleLiveData<ButtonType>()
	
	fun onPlaceHolderButtonClicked(){
		buttonTypeClicked.value = ButtonType.PLACEHOLDER
	}
	
	fun onConstrainSetButtonClicked(){
		buttonTypeClicked.value = ButtonType.CONSTRAINT_SET
	}
	
	fun onClassicAnimationsButtonClicked(){
		buttonTypeClicked.value = ButtonType.CLASSIC
	}
	
	fun onResourcesAnimationsButtonClicked(){
		buttonTypeClicked.value = ButtonType.RESOURCES
	}
	
	
	
	
}