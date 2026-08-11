package models;

public class Enrollments {

    private Long id;
    private Long studentId;
    private Long courseId;

    //Contructor vacio
    public Enrollments() {
    }

    //Constructor lleno
    public Enrollments(Long id, Long studentId, Long courseId) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}