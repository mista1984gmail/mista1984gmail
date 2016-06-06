package Lesson08;

/**
 * Created by intelisoft on 01.06.2016.
 */
public class Circle extends ColorSharpInp{
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    double radius;
    @Override
    public double getPerimetr() {
        return 2*Math.PI*radius*radius;
    }

}
