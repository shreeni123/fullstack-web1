package co.pragra.webapp.firstwebapp.controller;

import co.pragra.webapp.firstwebapp.domain.Course;
import co.pragra.webapp.firstwebapp.services.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ext")
public class CourseController {
   private CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping("/course")
    public List<Course> getAll(){
       return service.getCourses();
   }

    @GetMapping("/course/{id}")
    public Course getById(@PathVariable long id){
        return service.getCourseById(id);
    }
}
