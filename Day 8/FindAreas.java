class Figure
{
    double din1;
    double din2;

    Figure(double a, double b)
    {
        din1 = a;
        din2 = b;
    }
    double area()
    {
        System.out.println("Area for figure is not defined");
        return 0;
    }
}

class Rectangle extends Figure
{
    Rectangle(double a, double b)
    {
        super(a, b);
    }
    double area()
    {
        System.out.println("Inside area for rectangle");
        return din1 * din2;
    }
}

class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a, b);
    }
    double area()
    {
        System.out.println("Inside area for triangle");
        return din1 * din2 / 2;
    }
}

class FindAreas
{
    public static void main(String[] args)
    {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = f;
        System.out.println("Area is " + figref.area());
    }
}