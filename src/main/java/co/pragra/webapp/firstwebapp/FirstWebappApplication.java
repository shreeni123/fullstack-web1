package co.pragra.webapp.firstwebapp;

import co.pragra.webapp.firstwebapp.domain.Course;
import co.pragra.webapp.firstwebapp.domain.Status;
import co.pragra.webapp.firstwebapp.domain.Student;
import co.pragra.webapp.firstwebapp.services.CourseService;
import co.pragra.webapp.firstwebapp.services.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class FirstWebappApplication {
    private CourseService courseService;
    private StudentService studentService;

    public FirstWebappApplication(CourseService courseService, StudentService studentService) {
        this.courseService = courseService;
        this.studentService = studentService;
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstWebappApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
      return args -> {
          Student student = new Student();
          student.setId(10001L);
          Course course  = new Course(10001L,"Java FullStack Program","Learn fundamental of Java alogn with Spring/Spring Boot and Angular", BigDecimal.valueOf(500.0), Status.ACTIVE);
          studentService.addStudent(student);
          courseService.addCouse(course);
          courseService.addCouse(new Course(10002L,"NodeJs FullStack Proogram","", BigDecimal.valueOf(2500.0), Status.ACTIVE));
      } ;
    }

}
