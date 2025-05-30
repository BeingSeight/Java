//using run time poly
class Figure
{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1=a;
        dim2=b;
    }
    double area()
    {
        System.out.println("Area for figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }

    //over0ride area for rectangle
    double area(){
        System.out.println("Inside area for rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }
    //override area for right triangle
    double area(){
        System.out.println("Inside area for triangle");
        return dim1*dim2/2;
    }
}

class basics{
    public static void main(String[] args) {
    Figure f=new Figure(10, 10);
    Rectangle r=new Rectangle(9, 5);
    Triangle t=new Triangle(10, 8);

    Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = f;
        System.out.println("Area is " + figref.area());
    }
}