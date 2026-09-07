import java.util.*;
public class returnEven {
    public static void main(String[] args){
        ArrayList <Integer> al = new ArrayList<>();
        al.add(10);
        al.add(7);
        al.add(23);
        al.add(30);
        al.add(3);
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) % 2 == 0) {
                even.add(al.get(i));
            }
        }

        System.out.println("Original ArrayList: " + al);
        System.out.println("Even ArrayList: " + even);
    }
}
