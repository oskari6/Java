import java.util.List;
import java.io.File;
import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.File;
import java.util.Iterator;
import java.util.ListIterator;

public class  Collections{
    public static void main(String[] args) {
        //Queue
        LinkedList<String> names = new LinkedList<>();
        names.add("Caleb");
        names.add("Sue");
        names.add("Sally");

        Iterator<String> it = names.iterator();
        System.out.println(it.next());

        ListIterator<String> it2 = names.listIterator();
        it2.add("Susan");

        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
        //stack
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.removeFirst());
    }
}
