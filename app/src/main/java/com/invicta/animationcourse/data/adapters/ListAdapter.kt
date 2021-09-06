package com.invicta.animationcourse.data.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.invicta.animationcourse.viewModel.ItemListViewModel
import androidx.lifecycle.ViewModelStoreOwner
import com.invicta.animationcourse.R
import com.invicta.animationcourse.databinding.ListItemBinding


class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
	private lateinit var context:Context
	private lateinit var viewModel: ItemListViewModel
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
		val binding = DataBindingUtil.inflate<ListItemBinding>(LayoutInflater.from(context),
															   R.layout.list_item,
															   parent,
															   false)
		binding.viewModel = viewModel
		return ListViewHolder(binding)
	}
	
	override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
		holder.initData(position)
	}
	
	override fun getItemCount(): Int {
		return viewModel.itemsList.size
	}
	
	override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
		super.onAttachedToRecyclerView(recyclerView)
		context = recyclerView.context
		if (!this::viewModel.isInitialized) {
			viewModel =
				ViewModelProvider(recyclerView.context as ViewModelStoreOwner)[ItemListViewModel::class.java]
		}
	}
	
	class ListViewHolder(private val listItemBinding: ListItemBinding):RecyclerView.ViewHolder
		(listItemBinding.root){
		fun initData(position: Int) {
			listItemBinding.position = position
		}
	}
}