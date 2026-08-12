package models;

public class Course {

    private Long id;
    private String name;
    private String description;

    // Constructor vacío
    public Course() {
    }

    // Constructor lleno
    public Course(Long idCourse, String nameCourse, String descriptionCourse) {
        this.id = idCourse;
        this.name = nameCourse;
        this.description = descriptionCourse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}