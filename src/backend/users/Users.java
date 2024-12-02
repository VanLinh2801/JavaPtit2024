package src.backend.users;

public class Users {

    private int id;
    private String userName;
    private String password;
    private String fullName;
    private String gender;
    private String phoneNumber;
    private int workShift;
    private int roleId;

    public Users(int id, String userName, String password, String fullName, String gender, String phoneNumber,
            int workShift) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.workShift = workShift;
    }

    public Users(String userName, String password, String fullName, String gender, String phoneNumber,
            int workShift, int role) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.workShift = workShift;
        this.roleId = role;
    }

    public Users(String userName, String fullName, String gender, String phoneNumber,
            int workShift) {
        this.userName = userName;
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.workShift = workShift;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getShift() {
        return workShift;
    }

    public void setShift(int workShift) {
        this.workShift = workShift;
    }

    public int getRole() {
        return roleId;
    }

}
