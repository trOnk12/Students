package com.example.espeo.core.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.espeo.feature.presentation.studentlist.StudentListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(StudentListViewModel::class)
    abstract fun bindStudentListViewModel(studentListViewModel: StudentListViewModel): ViewModel

}