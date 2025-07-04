package com.example.CMS.Services;

import com.example.CMS.Modules.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service

public class StudentServices {

    List <Student> std = new ArrayList<>(
            Arrays.asList(new Student("Guruvel","123cs","Java","guruvel@gmail.com"),
                    new Student("Arasan","124cs","C++","arasan@gmail.com")
            )
    );

    public List<Student> getStudentDetails(){
        return std;
    }

    public List<String> getStdCourse() {
        List<String> courses = new ArrayList<>();
        for (Student s : std) {
            courses.add(s.getCourse());
        }
        return courses;
    }

}
