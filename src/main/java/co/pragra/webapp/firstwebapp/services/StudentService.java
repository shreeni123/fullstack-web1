package co.pragra.webapp.firstwebapp.services;

import co.pragra.webapp.firstwebapp.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class StudentService {
    List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public Student  addStudent(Student student){
        if(null!=student){
            this.students.add(student);
        }
        return student;
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public Student getStudentsById(Long iD){
        System.out.println(students);

        //Student st;
        for (Student st: students ){
            if(st.getId()==iD){
                return st;
            }
        }
        return null;
        //return students.stream().filter(s->s.getId()==iD).collect(Collectors.toList()).get(0);
    }



}
