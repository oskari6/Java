public class OOP {
    public static void main(String[] args) {
        User user = new User(); //user object
        user.setFirstName("Sub");
        //user.lastName = "Scriber";
        user.setLastName("Scriber");

        /*user.output(2);
        System.out.println(user.firstName);*/
        String message = user.output();
        System.out.println(message);
        System.out.println(user.getFirstName());
        System.out.println(user.getFullName());
    }
}


//User.java