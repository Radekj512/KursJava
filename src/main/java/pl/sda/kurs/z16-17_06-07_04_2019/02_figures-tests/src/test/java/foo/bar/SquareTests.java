package foo.bar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTests {

    @ParameterizedTest(name = "Area of square({0}) should be {1}")
    @CsvSource({
                 "0, 0",
                 "1, 1",
                 "10, 100"
    })
    void areaOfSquare(int a, int expectedArea) {
        Square square = new Square(a);
        assertEquals(expectedArea, square.area(), "Area of square is different than expected");
    }

    @ParameterizedTest(name = "Circumference of square({0}) should be {1}")
    @CsvFileSource(resources = "/circumferenceTest.csv")
    void circumferenceOfSquare(int a, int expected){
        Square square = new Square(a);
        assertEquals(expected, square.circumference());
    }

    @ParameterizedTest(name = "Circumference of Rectangle({0}, {1}) should be {2}")
    @CsvSource({
            "1, 2, 2",
            "5, 3, 15",
            "10, 100, 1000"
    })
    void areaOfRectangle(int a,int b,  int expected){
        Rectangle rectangle = new Rectangle(a, b);
        assertEquals(expected, rectangle.area());
    }
    @ParameterizedTest(name = "Area of Rectangle({0}, {1}) should be {2}")
    @CsvSource({
            "1, 2, 6",
            "5, 3, 16",
            "10, 100, 220"
    })
    void circumferenceOfRectangle(int a,int b,  int expected){
        Rectangle rectangle = new Rectangle(a, b);
        assertEquals(expected, rectangle.circumference());
    }
    //---------CIRCLE--------------
    @ParameterizedTest(name = "Circumference of Circle({0}) should be {1}")
    @CsvSource({
            "1, 3",
            "2,6",
            "3,9"
    })
    void circumferenceOfCircle(int a, int expected){
        Circle circle = new Circle(a);
        assertEquals(expected, circle.circumference());
    }

    @ParameterizedTest(name = "Area of Circle({0}) should be {1}")
    @CsvSource({
            "1, 3",
            "2, 12",
            "3, 27"
    })
    void areaOfCircle(int a, int expected){
        Circle circle = new Circle(a);
        assertEquals(expected, circle.area());
    }
    //-----------DIAMOND---------
    @ParameterizedTest(name ="Area of Diamond({0},{1}) should by {2}")
    @CsvSource({
            "1,5,5",
            "2,5,10"
    })
    void areaOfDiamond(int a, int h, int expected){
        Diamond diamond = new Diamond(a,h);
        assertEquals(expected, diamond.area());
    }

}
