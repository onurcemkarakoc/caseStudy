package com.onurcem.feature.search_list.presentation

import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.onurcem.core.common.base.BaseFragment
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


    override fun onDataBound() {
        handleState(searchListViewModel)
        binding.apply {
            tvSearchId.text = searchId
            btnToSearchDetail.setOnClickListener {
                searchListViewModel.getFlightData("PC1251:G:2022-06-28 08:40:00:20X1")
            }
        }
        observers()
    }

    private fun observers() {
        searchListViewModel.data.observe(viewLifecycleOwner) {
            binding.apply {
                tvSearchId.text = it.toString()
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