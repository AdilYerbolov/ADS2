import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    static void shelfRules() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> shelf = new ArrayList<>();
        ArrayList<Integer> removed = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            int q = sc.nextInt();
            if (q == 1){
                shelf.addFirst(sc.nextInt());
            }
            else if (q == 2){
                shelf.add(sc.nextInt());
            }
            else if (q == 3){
                removed.add(shelf.getFirst());
                shelf.removeFirst();
            }
            else if (q == 4){
                removed.add(shelf.getLast());
                shelf.removeLast();
            }
            else {System.out.println("Error!");}
            sc.nextLine();
        }
        System.out.println(removed);
    }
}
