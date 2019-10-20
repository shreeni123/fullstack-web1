package co.pragra.webapp.firstwebapp.services;

import co.pragra.webapp.firstwebapp.domain.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {

    private List<Course> courses;

    public CourseService(List<Course> courses) {
        this.courses = courses;
    }

    public Course addCouse(Course course){
        this.courses.add(course);
        return course;
    }

    public Course getCourseById(Long id){
        System.out.println(courses);
        for (Course course: courses){

            if (null != course && course.getCourseId() == id){
                return course;
            }
        }
        return null;

    }

    public List<Course> getCourses() {
        return courses;
    }
}
