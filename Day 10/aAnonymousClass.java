interface Greeting
{
    void sayHello();
}

public class aAnonymousClass
{
    public static void main(String[] args) {
        Greeting greeting=new Greeting() {
            
                public void sayHello()
                {
                    System.out.println("Hello, this is an anonymous class implemention!!");
                }
            };
            greeting.sayHello();
    };
        
}