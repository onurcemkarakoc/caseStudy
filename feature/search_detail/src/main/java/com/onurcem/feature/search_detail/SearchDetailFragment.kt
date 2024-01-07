package com.onurcem.feature.search_detail

import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.onurcem.core.common.base.BaseFragment
import com.onurcem.feature.search_detail.databinding.FragmentSearchDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchDetailFragment :
    BaseFragment<FragmentSearchDetailBinding>(FragmentSearchDetailBinding::inflate) {

    private val args by navArgs<SearchDetailNavigationArgs>()

    private val itemId: String by lazy {
        args.itemId
    }

    private val searchDetailViewModel: SearchDetailViewModel by viewModels()

    override fun onDataBound() {
        handleState(searchDetailViewModel)
        binding.apply {
            tvItemId.text = itemId
        }
    }

    override fun onError(message: String?) {
        message?.let {
            binding.apply {
                tvError.text = it
                tvError.isVisible = true
                clSearchDetail.isVisible = false
            }
        }
    }
}