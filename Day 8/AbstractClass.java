abstract class bank{
    abstract int getROI();
}
class sbi extends bank{
    int getROI() {return 7;}
}

class icici extends bank{
    int getROI() {return 9;}
}

class AbstractClass{
    public static void main(String[] args) {
        bank b;
        b=new sbi();
        System.out.println("roi of sbi "+b.getROI());
        b=new icici();
        System.out.println("roi of icici "+ b.getROI());
    }
}