package co.istad.assignment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getStudentList() {
        return studentRepository.getStudentList();
    }

    public Student add() {
        Student student = new Student(
                studentRepository.getStudentList().size() + 1,
                "kaka",
                (double) Math.round ((60 + (Math.random() * 41) * 100.0) / 100.0)
        );
        return studentRepository.add(student);
    }
}
