package com.example.espeo.feature.datasource.remote

import com.example.espeo.core.mapper.Mapper
import com.example.espeo.feature.data.datasource.StudentRemoteDataSource
import com.example.espeo.feature.datasource.model.NetworkStudent
import com.example.espeo.feature.domain.model.Student
import io.reactivex.Single
import javax.inject.Inject

class StudentRemoteDataSourceImpl
@Inject constructor(
    private val studentApi: StudentApi,
    private val networkStudentMapper: Mapper<NetworkStudent, Student>
) : StudentRemoteDataSource {

    override fun get(): Single<List<Student>> {
        return studentApi.getStudents().map {
            mapNetworkStudent(it)
        }
    }

    private fun mapNetworkStudent(networkStudentList: List<NetworkStudent>): List<Student> {
        return networkStudentList.map {
            networkStudentMapper.map(it)
        }
    }

}