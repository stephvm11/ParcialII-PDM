package com.pdmcourse2026.basictemplate.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdmcourse2026.basictemplate.data.repositories.VotingApiRepository
import com.pdmcourse2026.basictemplate.data.repositories.VotingRepository
import com.pdmcourse2026.basictemplate.model.Option
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel(){
    private val votingRepository : VotingRepository = VotingApiRepository()

    private val _options = MutableStateFlow<List<Option>>(emptyList())
    val options = _options

    private val _loading = MutableStateFlow<Boolean>(false)
    val loading = _loading

    private val _hasVoted = MutableStateFlow<Boolean>(false)
    val hasVoted = _hasVoted

    private val _error = MutableStateFlow<String?>(null)
    val error = _error

    init {
        loadOptions()
    }

    fun loadOptions(){
        viewModelScope.launch {
            _loading.value = true
            _error.value = null
            votingRepository.getOptions()
                .onSuccess {options ->
                    _options.value = options
                }
                .onFailure {
                    _error.value = "Ha ocurrido un error"
                }
            _loading.value = false
        }
    }

}