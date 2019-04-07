package foo.bar;

public class Diamond implements Figure {
    int a;
    int h;

    public Diamond(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public int area() {
        return a*h;
    }

    @Override
    public int circumference() {
        return 4*a;
    }
}
