package foo.bar;

public class Circle implements Figure{
    int a;

    public Circle(int a) {
        this.a = a;
    }

    @Override
    public int area() {
        return (int)3.14*a*a;
    }

    @Override
    public int circumference() {
        return (int)3.14*a;
    }
}
