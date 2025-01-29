package Class;

public class ClassInst {
    private int id;
    private String name;
    private int marks1;
    private int marks2;

    ClassInst() {
        id = 0;
        name = "";
        marks1 = 0;
        marks2 = 0;
    }

    ClassInst(int id, String name, int marks1, int marks2) {
        id = id;
        name = name;
        marks1 = marks1;
        marks2 = marks2;
    }

    public static void main(String[] args) {
        ClassInst obj = new ClassInst(1, "John Doe", 85, 90);
        System.out.println("ID: " + obj.id);
        System.out.println("Name: " + obj.name);
        System.out.println("Marks1: " + obj.marks1);
        System.out.println("Marks2: " + obj.marks2);
    }
}