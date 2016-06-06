package Lesson08;

/**
 * Created by intelisoft on 01.06.2016.
 */
public abstract class ColorSharpInp implements ColorSharp {
    private String color;

    @Override
    public void setColor(String color) {
        this.color=color;

    }

    @Override
    public String getColor() {
        return color;
    }
}
