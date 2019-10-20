package co.pragra.webapp.firstwebapp.domain;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class Course {

    private long courseId;
    private String courseName;
    private String description;
    private BigDecimal fee;
    private Status status;

    public Course() {
    }

    public Course(long courseId, String courseName, String description, BigDecimal fee, Status status) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.fee = fee;
        this.status = status;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", fee=" + fee +
                ", status=" + status +
                '}';
    }
}
