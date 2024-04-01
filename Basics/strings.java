public class strings {

    public static void main(String[] args){
        String x = "Hello cats";
        String y = new String("Hey"); //not always necessary
        //object (instance of a class)
        //no single quotes, they are reserved for characters
        System.out.println(x.charAt(0));
        System.out.println(x.charAt(10)); //out of range

        System.out.println(x + " and dogs");
        x += " and puppies";
        System.out.println(x);

        String name = "Caleb";
        System.out.println(String.format("hello %s", name));

       System.out.println(name.length());

    }
}
///n