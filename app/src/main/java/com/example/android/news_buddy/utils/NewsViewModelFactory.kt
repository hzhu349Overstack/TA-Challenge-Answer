package com.example.android.news_buddy.utils

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.news_buddy.repository.NewsRepository
import com.example.android.news_buddy.viewmodel.NewsViewModel

@Suppress("UNCHECKED_CAST")
class NewsViewModelFactory(
    private val application: Application,
    private val repository: NewsRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(application,repository) as T
    }
}