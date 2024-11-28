
package src.backend.security;

public class SecurityGuard {

    private String name;
    private String gender;
    private String id;
    private String phoneNumber;
    private int shift;

    public SecurityGuard(String name, String gender, String id, String phoneNumber, int shift) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void displayInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("ID: " + this.id);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Shift: " + this.shift);
    }

    public static void main(String[] args) {
        SecurityGuard guard1 = new SecurityGuard("Nguyen Van A", "Male", "SG001", "0367505366", 1);
        System.out.println("Initial information of the security guard:");
        guard1.displayInformation();
        guard1.setName("Tran Van B");
        guard1.setGender("Male");
        guard1.setId("SG002");
        guard1.setPhoneNumber("0794172227");
        guard1.setShift(2);
        System.out.println("\nInformation after update:");
        guard1.displayInformation();
    }
}
