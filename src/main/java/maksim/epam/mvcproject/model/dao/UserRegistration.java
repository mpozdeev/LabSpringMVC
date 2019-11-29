package maksim.epam.mvcproject.model.dao;

public class UserRegistration {

    private String userName;
    private String telNumber;
    private String password;
    private boolean userRole;

    public UserRegistration(){}

    public UserRegistration(String userName, String telNumber, String password, boolean userRole) {
        this.userName = userName;
        this.telNumber = telNumber;
        this.password = password;
        this.userRole = userRole;
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

    public boolean isUserRole() {
        return userRole;
    }

    public void setUserRole(boolean userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "userName='" + userName + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", password='" + password + '\'' +
                ", userRole=" + userRole +
                '}';
    }
}
