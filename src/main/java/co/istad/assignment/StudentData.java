package co.istad.assignment;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentData {

    @Bean("s1")
    public List<Student> studentList() {
        return new ArrayList<>(
                List.of(new Student(1, "koko", 40.5))
        );
    };

    @Bean("s2")
    public List<Student> studentList2 () {
        return new ArrayList<>(
                List.of(new Student(1, "kaka", 40.5))
        );
    }
}
