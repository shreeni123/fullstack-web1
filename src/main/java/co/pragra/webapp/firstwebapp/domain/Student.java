package co.pragra.webapp.firstwebapp.domain;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Student {

    private String name;
    private long id;
    private LocalDate signUpDate;
    private Status status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(LocalDate signUpDate) {
        this.signUpDate = signUpDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", signUpDate=" + signUpDate +
                ", status=" + status +
                '}';
    }
}
