package co.istad.assignment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/add")
    public Student addStudent() {
        return studentService.add();
    }

    @GetMapping("/get-students")
    public List<Student> getStudentList() {
        return studentService.getStudentList();
    }
}
