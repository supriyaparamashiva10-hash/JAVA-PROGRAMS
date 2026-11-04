abstract class Shap {
    abstract double area();
}

class Circl extends Shap{
    double radius;

    Circl(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangl extends Shap {
    double length, breadth;

    Rectangl(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

class Triangle extends Shap {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}
 class Shapetest
{
    public static void shape(String[] args)
    {
        Shap[] shapes = {
                new Circl(5),
                new Rectangl(4, 6),
                new Triangle(8, 3)
        };

        for (Shap s : shapes)
        {
            System.out.printf("Area: %.2f%n", s.area());
        }
    }
}
