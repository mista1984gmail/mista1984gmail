package Lesson08;

/**
 * Created by intelisoft on 01.06.2016.
 */
public class Forma {
    private String nik;
    private String password;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String collectDate() {
        return "Forma{" +
                "nik='" + nik + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

