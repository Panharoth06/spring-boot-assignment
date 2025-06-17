package co.istad.assignment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {
    private final StudentData studentData;

    Student add(Student student) {
        studentData.studentList.add(student);
        return student;
    }

    List<Student> getStudentList() {
        return studentData.studentList;
    }
}
