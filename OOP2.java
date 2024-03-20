import java.util.ArrayList;
import java.util.List;

/*public class OOP2 {
    public static void main(String[] args) {
        User me = new User(); //user object
        me.setFirstName("Caleb");
        me.setLastName("Curry");

        User you = new User();
        you.setFirstName("Sub");
        you.setLastName("Scriber");

        List<User> users = new ArrayList<User>();
        users.add(you);
        users.add(me);

        System.out.println(users.get(1).getFullName());
    }
}*/

/*public class OOP2 {
    public static void main(String[] args) {
        String[] firstNames = {"Caleb", "Sub", "sally", "jamie"};
        String[] lastNames = {"Curry", "Scriber", "smith", "cal"};

        List<User> users = new ArrayList<User>();

        for(int i = 0; i < firstNames.length; i++) {
            User u = new User();
            u.setFirstName(firstNames[i]);
            u.setLastName(lastNames[i]);
            users.add(u);
        }
        for(User u : users) {
            System.out.println(u.getFullName());
        }


        OOP2 m = new OOP2(); //calling
            m.printUser(users.get(0));
    }
    public void printUser(User u) { //no static yet //custom method /instance method
        System.out.println(u.getFullName());
    }
}*/
//User.java
public class OOP2 {
    public static void main(String[] args) {

        User me = new User();
        me.setFirstName("Caleb");
        me.setLastName("Curry");

        User you = new User();
        you.setFirstName("Charles");
        you.setLastName("Matt");

        List<User> users = new ArrayList<User>();
        users.add(me);
        users.add(you);

        //User.printUsers(users);

        //System.out.println(me.output(false));

        //Searching list for Custom objects
        System.out.println(User.searchList(users, "Charles", "Matt"));

        //Overide toString
        System.out.println(me);

        //Override equals 
        System.out.println(me.equals(you));

        //Overload the search to take in  a user object
        System.out.println(User.searchList(users, you));

        //returning custom objects

        User search = new User();
        search.setFirstName("Charles");
        search.setLastName("Matt");

        User found = User.findUser(users, search);

        found.setFirstName("Sally");

        System.out.println(you);

        //passing by value or reference 
        User.changeCrap(you); //(interference somewhere)
        System.out.println(you);
    }
}


