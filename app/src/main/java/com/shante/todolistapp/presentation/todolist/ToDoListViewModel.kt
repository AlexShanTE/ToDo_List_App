package com.shante.todolistapp.presentation.todolist

import androidx.lifecycle.ViewModel
import com.shante.todolistapp.domain.ToDoItemsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ToDoListViewModel @Inject constructor(
    private val repository: ToDoItemsRepository
) : ViewModel() {

}