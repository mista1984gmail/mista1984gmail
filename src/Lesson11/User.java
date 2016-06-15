package Lesson11;



/**
 * Created by intelisoft on 13.06.2016.
 */
public class User implements Comparable<User> {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.getName());
    }
}

