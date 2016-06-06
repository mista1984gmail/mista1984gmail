package Lesson08;

/**
 * Created by intelisoft on 01.06.2016.
 */
public class FormManager extends Manager {
    public boolean validate(Forma form){
            return form.getNik()!=null && form.getPassword()!=null;
    }
}
