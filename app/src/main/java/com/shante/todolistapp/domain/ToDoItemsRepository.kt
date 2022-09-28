package com.shante.todolistapp.domain

import com.shante.todolistapp.domain.models.ToDoItem

interface ToDoItemsRepository {

    fun addToDoItem(toDoItem: ToDoItem)

    fun deleteToDoItem(toDoItem: ToDoItem)

    fun editToDoItem(toDoItem: ToDoItem)

    fun getToDoItem(toDoItemId: Int): ToDoItem

    fun getToDoItemsList(): List<ToDoItem>

}