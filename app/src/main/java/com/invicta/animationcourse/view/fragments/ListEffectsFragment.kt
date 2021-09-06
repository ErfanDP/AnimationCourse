package com.invicta.animationcourse.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.invicta.animationcourse.R
import com.invicta.animationcourse.data.adapters.ListAdapter
import com.invicta.animationcourse.databinding.FragmentListEffectsBinding

class ListEffectsFragment: Fragment() {
	
	
	private lateinit var binding: FragmentListEffectsBinding
	private lateinit var adapter: ListAdapter
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		binding = DataBindingUtil.inflate<FragmentListEffectsBinding>(inflater,R.layout
			.fragment_list_effects,container,false)
		initRecyclerView()
		return binding.root
	}
	
	private fun initRecyclerView() {
		adapter = ListAdapter()
		binding.listRecyclerView.adapter = adapter
		binding.listRecyclerView.layoutManager = GridLayoutManager(context, 3)
	}
	
	
	companion object {
		fun newInstance() = ListEffectsFragment()
	}
}