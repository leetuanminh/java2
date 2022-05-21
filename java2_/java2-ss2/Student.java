public class Student {
    private String rollNo;
    private String fullName;
    private String address;
    private String email;
    private String DBO;
    private int Status;

    public Student(String rollNo, String fullName, String address, String email, String DBO, int status) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.DBO = DBO;
        this.Status = status;
    }

    public String getRollNo() {
        return this.rollNo;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDBO() {
        return this.DBO;
    }

    public int getStatus() {
        return this.Status;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDBO(String DBO) {
        this.DBO = DBO;
    }

    public void setStatus(int status) {
        this.Status = status;
    }

    public String toString() {
        return "Student{rollNo='" + this.rollNo + "', fullName='" + this.fullName + "', address='" + this.address + "', email='" + this.email + "', DBO='" + this.DBO + "', Status=" + this.Status + "}";
    }
}

