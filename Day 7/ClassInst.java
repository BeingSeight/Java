package Class;


class ClassInst {
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

    ClassInst(int i, String n, int m1, int m2) {
        id = i;
        name = n;
        marks1 = m1;
        marks2 = m2;
    }

    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nMarks1: " + marks1 + "\nMarks2: " + marks2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public void setMarks1(int m1) {
        marks1 = m1;
    }

    public void setMarks2(int m2) {
        marks2 = m2;
    }

    public void results(){
        
        System.out.println("Total Marks: " + (marks1 + marks2));
    }
}