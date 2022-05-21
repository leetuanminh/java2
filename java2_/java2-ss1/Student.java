public class Student {
    public int id;
    public String name;
    public String className;

    public Student(int id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public String toString() {
        return "Student{id=" + this.id + ", name='" + this.name + "', className='" + this.className + "'}";
    }
}
