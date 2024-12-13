import java.util.LinkedList;

public class CollectionFramework {
    public static void main(String[] args) {
        // create - objects int, float, boolean is not used -> Integer, Float, Character
        // is used,

        // create
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}
