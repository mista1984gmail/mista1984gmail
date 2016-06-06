package Lesson08;

/**
 * Created by intelisoft on 01.06.2016.
 */
public class Squard extends ColorSharpInp {

    private int a;
    private int b;
    private String color;

    public Squard(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getPerimetr() {
        return (a+b)*2;
    }


}
