package com.onurcem.feature.search_list.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.onurcem.core.common.base.BaseViewModel
import com.onurcem.core.data.model.Data
import com.onurcem.feature.search_list.domain.use_cases.GetFlightListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchListViewModel @Inject constructor(private val getFlightListUseCase: GetFlightListUseCase) :
    BaseViewModel() {

    private val _data = MutableLiveData<Data>()
    val data: LiveData<Data> = _data

    fun getFlightData(searchId: String) {
        viewModelScope.launch {
            getFlightListUseCase(searchId).collectLatest { resource ->
                handleResource(resource) { response ->
                    response?.let { safeResponse ->
                        _data.postValue(safeResponse)
                    }
                }
            }
        }
    }
}