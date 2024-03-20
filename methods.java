public class methods {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(Integer.max(x, y));
        System.out.println(Integer.compare(x, y));

        String money = "300";

        System.out.println(Integer.valueOf(money));
        System.out.println(Integer.parseInt(money));

        Integer a = Integer.valueOf(money);
        int b = Integer.parseInt(money);
    }
    
}

//ctrl shift enter adds line above