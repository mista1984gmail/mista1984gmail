package Lesson08;

/**
 * Created by intelisoft on 01.06.2016.
 */
public class lesson0802 {
    public static void main(String[] args) {
        ColorSharp sharp=new Circle(10.0);
        System.out.println(sharp.getPerimetr());

        if(sharp instanceof Color){
            Color color = (Color) sharp;
            color.setColor("green");
            System.out.println(color.getColor());

        }

    }
}
