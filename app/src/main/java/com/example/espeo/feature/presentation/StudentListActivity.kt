package com.example.espeo.feature.presentation

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.espeo.R
import com.example.espeo.core.platform.BaseActivity
import com.example.espeo.feature.domain.model.Student
import kotlinx.android.synthetic.main.student_list_activity.*
import javax.inject.Inject

class StudentListActivity : BaseActivity() {

    @Inject
    lateinit var studentListAdapter: StudentListAdapter
    lateinit var studentListViewModel: StudentListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_list_activity)
        appComponent.inject(this)

        studentListView.adapter = studentListAdapter

        studentListViewModel = ViewModelProviders
            .of(this, viewModelFactory)[StudentListViewModel::class.java]

        studentListViewModel.studentList.observe(this, Observer(::showStudentList))

        if (savedInstanceState == null) {
            studentListViewModel.getStudents()
        }

    }

    private fun showStudentList(studentList: List<Student>?) {
        studentList?.let {
            studentListAdapter.studentList = it
        }
    }
}
