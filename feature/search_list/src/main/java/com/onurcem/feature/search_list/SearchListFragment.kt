package com.onurcem.feature.search_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.onurcem.core.common.utils.toDetail
import com.onurcem.feature.search_list.databinding.FragmentSearchListBinding

class SearchListFragment : Fragment() {

    private val args by navArgs<SearchListNavigationArgs>()

    private val searchId: String by lazy {
        args.searchId
    }

    private var binding: FragmentSearchListBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchListBinding.inflate(inflater)
        binding?.apply {
            tvSearchId.text = searchId
            btnToSearchDetail.setOnClickListener {
                findNavController().toDetail("PC1251:G:2022-06-28 08:40:00:20X1")
            }
        }
        return binding?.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
    companion object {
        @JvmStatic
        fun newInstance() = SearchListFragment()
    }
}