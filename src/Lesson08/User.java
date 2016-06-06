package Lesson08;

/**
 * Created by intelisoft on 01.06.2016.
 */
public class User implements Cloneable{

    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(o instanceof User){
            User user=(User)o;
            if (this.age==user.getAge() && this.name.equals(user.getName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new User(this.age,this.name);
    }
}
