package Lesson009;

/**
 * Created by intelisoft on 06.06.2016.
 */
public class CompareUserByAge implements ComparableUser {


    public int compare(User user1, User user2) {
        return user1.getAge()-user2.getAge();
    }
}
