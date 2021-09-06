package com.invicta.animationcourse.viewModel

import androidx.lifecycle.ViewModel
import com.invicta.animationcourse.data.models.ListItemModel
import java.text.FieldPosition

class ItemListViewModel : ViewModel() {
	var itemsList = listOf("ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE", "TEN")
	
	fun getItemText(position: Int):String{
		return itemsList[position]
	}
}