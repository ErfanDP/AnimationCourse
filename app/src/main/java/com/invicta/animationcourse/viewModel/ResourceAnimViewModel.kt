package com.invicta.animationcourse.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.invicta.animationcourse.utils.SingleLiveData

class ResourceAnimViewModel : ViewModel() {
	val buttonClicked = SingleLiveData<Boolean>()
	fun onResButtonClicked(){
		buttonClicked.value = true
	}
}