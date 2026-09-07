import java.util.*;

public class returnUnique {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);
        al.add(20);
        al.add(10);

        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {

            int frequency = 0;

            for (int j = 0; j < al.size(); j++) {
                if (al.get(i).equals(al.get(j))) {
                    frequency++;
                }
            }

            // Add only if element has not occurred before
            if (!unique.contains(al.get(i))) {
                unique.add(al.get(i));
            }

            System.out.println(al.get(i) + " occurs " + frequency + " times");
        }

        System.out.println("Original ArrayList: " + al);
        System.out.println("Unique Elements: " + unique);
    }
}
