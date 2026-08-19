package models;

public class Enrollment {

    private Long id;
    private Long studentId;
    private Long courseId;

    //Contructor vacio
    public Enrollment() {
    }

    //Constructor lleno
    public Enrollment(Long enrollmentId, Long studentId, Long courseId) {
        this.id = enrollmentId;
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

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                '}';
    }
}

