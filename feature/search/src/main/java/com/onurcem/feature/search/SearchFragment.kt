package com.onurcem.feature.search

import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.onurcem.core.common.base.BaseFragment
import com.onurcem.core.common.utils.toList
import com.onurcem.feature.search.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {

    private val searchViewModel: SearchViewModel by viewModels()

    override fun onDataBound() {
        handleState(searchViewModel)
        binding.apply {
            btnToSearchList.setOnClickListener {
                findNavController().toList("62b00aedd9757183381459")
            }
        }
    }

    override fun onError(message: String?) {
        message?.let {
            binding.apply {
                tvError.text = it
                tvError.isVisible = true
                clSearch.isVisible = false
            }
        }
    }
}