package co.istad.assignment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class StudentRepository {
    private final StudentData studentData;


    public Student add(Student student) {
        studentData.studentList().add(student);
        return student;
    }

     public List <Student> getStudentList() {
        return studentData.studentList().stream().map(student -> student).collect(Collectors.toList());
    }
}
