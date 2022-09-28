package com.shante.todolistapp.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ToDoItem(
    val id: Int,
    val title: String,
    val description: String?,
    val importance: Importance,
    val deadline: String?,
    val isCompleted: Boolean,
    val dateOfCreation: String,
    val dateOfEdit: String?
) : Parcelable

@Parcelize
sealed class Importance : Parcelable {
    object Low : Importance() , Parcelable
    object Default : Importance() , Parcelable
    object Urgent : Importance() , Parcelable
}