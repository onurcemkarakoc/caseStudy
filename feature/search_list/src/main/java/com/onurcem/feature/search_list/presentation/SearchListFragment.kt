package com.onurcem.feature.search_list.presentation

import android.os.Bundle
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.onurcem.core.common.base.BaseFragment
import com.onurcem.core.common.utils.toDetail
import com.onurcem.feature.search_list.SearchListNavigationArgs
import com.onurcem.feature.search_list.databinding.FragmentSearchListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchListFragment :
    BaseFragment<FragmentSearchListBinding>(FragmentSearchListBinding::inflate) {

    private val args by navArgs<SearchListNavigationArgs>()

    private val searchId: String by lazy {
        args.searchId
    }

    private val searchListViewModel: SearchListViewModel by viewModels()

    private val searchListAdapter: SearchListAdapter by lazy {
        SearchListAdapter{
            findNavController().toDetail(it)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        searchListViewModel.getFlightData(searchId)
    }


    override fun onDataBound() {
        handleState(searchListViewModel)
        binding.rvSearchList.adapter = searchListAdapter
        observers()
    }

    private fun observers() {
        searchListViewModel.data.observe(viewLifecycleOwner) {
            binding.apply {
                it.airlines?.map { airline ->
                    airline.name.orEmpty()
                }?.let { list ->
                    searchListAdapter.updateList(list)
                }


                tvError.isVisible = false
                clSearchList.isVisible = true
            }
        }
    }

    override fun onError(message: String?) {
        message?.let {
            binding.apply {
                tvError.text = it
                tvError.isVisible = true
                clSearchList.isVisible = false
            }
        }
    }
}