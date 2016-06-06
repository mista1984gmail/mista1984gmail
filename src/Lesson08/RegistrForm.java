package Lesson08;

/**
 * Created by intelisoft on 01.06.2016.
 */
public class RegistrForm extends Forma {

    private String email;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String collectDate() {
        return "RegistrForm{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
