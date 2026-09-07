import java.util.*;

public class returnOdd {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(35);

        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) % 2 != 0) {
                odd.add(al.get(i));
            }
        }

        System.out.println("Original ArrayList: " + al);
        System.out.println("Odd ArrayList: " + odd);
    }
}
