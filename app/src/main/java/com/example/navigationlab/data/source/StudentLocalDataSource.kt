package com.example.navigationlab.data.source

import com.example.navigationlab.data.model.Student

class StudentLocalDataSource {

    private val students = listOf(
        Student(2026, "Alya Putri", "Teknik Informatika", 2026),
        Student(2027, "Bima Pratama", "Teknik Informatika", 2026),
        Student(2028, "Citra Lestari", "Teknik Informatika", 2026),
        Student(2029, "Dina Maharani", "Teknik Informatika", 2026),   // tugas: data baru
        Student(2030, "Eko Saputra", "Teknik Informatika", 2026)      // tugas: data baru
    )

    fun getStudents(): List<Student> = students

    fun getStudentById(id: Int): Student? =
        students.find { it.id == id }
}