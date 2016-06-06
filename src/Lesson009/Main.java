package Lesson009;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by intelisoft on 06.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        User[] users = {new User(20, "Саша"), new User(15, "Борис"), new User(50, "Аня")};
        //System.out.println(Arrays.asList(users));

        //ComparableUser comparableUser = new CompareUserByAge();
        //sort(users, comparableUser);
        //System.out.println(Arrays.asList(users));

        ComparableUser comparableUser1 = new CompareUserByName();
        sort(users, new ComparableUser() {
            public int compare(User user1, User user2) {
                return user2.getAge()-user1.getAge();
            }
        });


       System.out.println(Arrays.asList(users));


    }


    public static void sort(User[] users, ComparableUser comparableUser) {
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - 1; j++) {
                User a = users[j];
                User b = users[j + 1];
                if (comparableUser.compare(a, b) < 0) {
                    users[j]=b;
                    users[j + 1]=a;

                }

            }
        }


    }
}

