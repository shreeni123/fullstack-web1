package co.pragra.webapp.firstwebapp.controller;

import co.pragra.webapp.firstwebapp.domain.Course;
import co.pragra.webapp.firstwebapp.domain.Student;
import co.pragra.webapp.firstwebapp.services.CourseService;
import co.pragra.webapp.firstwebapp.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private StudentService studentService;
    private CourseService courseService;

    public IndexController(StudentService studentService, CourseService courseService) {
        this.studentService = studentService;
        this.courseService = courseService;
    }

    @GetMapping("/")
    public String getAllCoursesAndStudent(Model model){
        Student student = studentService.getStudentsById(10001L);
        Course course = courseService.getCourseById(10001L);
        System.out.println(course);
        model.addAttribute("student", student);
        model.addAttribute("course", course);
        return "index";
    }
}
