import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    static void queries(){
        ArrayList<Integer> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            l.add(sc.nextInt());
        }
        sc.nextLine();
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++){
            String query = sc.nextLine();
            if (query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                sc.nextLine();
                l.add(x, y);
            }
            else if (query.equals("Delete")){
                int x = sc.nextInt();
                sc.nextLine();
                l.remove(x);
            }
            else {
                System.out.println("Error!");
            }
        }
        System.out.println(l);
    }
}
