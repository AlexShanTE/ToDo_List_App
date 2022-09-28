package com.shante.todolistapp.presentation.tododetails

import androidx.lifecycle.ViewModel
import com.shante.todolistapp.domain.ToDoItemsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ToDoDetailsViewModel @Inject constructor(
    private val repository: ToDoItemsRepository
) : ViewModel() {

}