package managementStudent;

import java.util.Objects;

public class Student {
    private String studentId;
    private String name;
    private String Address;
    private String phone;

    public Student(String studentId, String name, String address, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.Address = address;
        this.phone = phone;
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Student{studentId='" + this.studentId + "', name='" + this.name + "', Address='" + this.Address + "', phone='" + this.phone + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else {
            Student other = (Student)obj;
            return Objects.equals(this.studentId, other.studentId);
        }
    }
}

