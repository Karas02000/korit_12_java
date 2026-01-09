package ch15_objects.teachers;

public class Teacher {
    String test = "hello world";
    private String name;
    private String shool;

    public Teacher(String name, String shool) {
        this.name = name;
        this.shool = shool;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getShool() {
        return shool;
    }
    public void setShool(String shool) {
        this.shool = shool;
    }

    public String toString() {
        return "Teacher : " + name + "\nSchool : " + shool;
    }
}
