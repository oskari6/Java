
public class nesting {
    public static void main(String[] args) {
        for(int i = 9; i >= 0; i--) {
            for(int k = i; k >= 0; k--) {
                if(k == 6) {
                    break; //continue; next ideration, break = out of loop
                }
                System.out.println(k + " ");
            }
            if (i == 3) {
                break; //continue;
            }
            System.out.println();
        }
        /*int i = 9;
        while(i >= 0) {
            int k = i;
            while(k >= 0) {
                System.out.println(k + " ");
                k--;
            }
            System.out.println();
            i--;
        }*/

    }
}


