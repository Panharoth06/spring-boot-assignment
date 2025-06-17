package co.istad.assignment;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class StudentRepository {
    private final List<Student> studentList;

    StudentRepository(@Qualifier("s2") List<Student> studentList) {
        this.studentList = studentList;
    }

    public Student add(Student student) {
        studentList.add(student);
        return student;
    }

     public List <Student> getStudentList() {
        return new ArrayList<>(studentList);
    }
}
