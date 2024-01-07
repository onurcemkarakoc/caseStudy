package com.onurcem.feature.search_detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.onurcem.feature.search_detail.databinding.FragmentSearchDetailBinding

class SearchDetailFragment : Fragment() {

    private val args by navArgs<SearchDetailNavigationArgs>()

    private val itemId: String by lazy {
        args.itemId
    }

    private var binding: FragmentSearchDetailBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchDetailBinding.inflate(inflater)
        binding?.apply {
            tvItemId.text = itemId
        }
        return binding?.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
    companion object {
        @JvmStatic
        fun newInstance() = SearchDetailFragment()
    }
}