package com.shante.todolistapp.di

import com.shante.todolistapp.data.ToDoItemsRepositoryImpl
import com.shante.todolistapp.domain.ToDoItemsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideRepository(): ToDoItemsRepository {
        return ToDoItemsRepositoryImpl()
    }

}