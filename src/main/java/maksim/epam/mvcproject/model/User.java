package maksim.epam.mvcproject.model;

import maksim.epam.mvcproject.enums.UserRole;

import java.util.Objects;



public class User {

//    public static int id = 0;
    private Long id;
    private String userName;
    private String telNumber;
    private String password;
    private UserRole userRole;
    private boolean active;

    public User(){
    }

    public User(Long id, String userName, String telNumber, String password, UserRole userRole) {
        this.id = id;
        this.userName = userName;
        this.telNumber = telNumber;
        this.password = password;
        this.userRole = userRole;
        this.active = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                userName.equals(user.userName) &&
                telNumber.equals(user.telNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, telNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", password='" + password + '\'' +
                ", userRole=" + userRole +
                '}';
    }
}
