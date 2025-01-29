class Student2{
    // defining field or data member or instance variable 
    private int id;
    private String name;
    private int marks1;
    private int marks2;

    Student2() {
        id = 0;
        name = "";
        marks1 = 0;
        marks2 = 0;
    }
    Student2(int i, String n, int m1, int m2){
        id = i;
        name = n;
        marks1 = m1;
        marks2 = m2;
    }
    @Override
    public String toString(){
        return "Id: " + id + " Name: " + name + " Marks1: " + marks1 + " Marks2: " + marks2;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getMarks1(){
        return marks1;
    }
    public void setMarks1(int m1){
        marks1 = m1;
    }
    public int getMarks2(){
        return marks2;
    }
    public void setMarks2(int m2){
        marks2 = m2;
    }
    public void result(){
        System.out.println("Total Marks: " + (marks1 + marks2));
    }
}
public class ClassInst{
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2(1, "Ravi", 90, 80);
        System.out.println(s1);
        System.out.println(s2);
        s1.setId(2);
        s1.setName("Raj");
        s1.setMarks1(80);
        s1.setMarks2(70);
        System.out.println(s1);
        System.out.println("Id: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks1: " + s1.getMarks1());
        System.out.println("Marks2: " + s1.getMarks2());
        s1.result();
        s2.result();
    }
}