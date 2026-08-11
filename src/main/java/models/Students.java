package models;

public class Students {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    //Contructor vacio
    public Students()
    {
    }

    //Constructor lleno
    public Students(Long idStudent, String firstNameStudent, String lastNameStudent, String emailStudent, String phoneStudent){
        this.id = idStudent;
        this.firstName = firstNameStudent;
        this.lastName = lastNameStudent;
        this.email = emailStudent;
        this.phone = phoneStudent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
