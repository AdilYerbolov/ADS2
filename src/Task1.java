import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    static void linePos(){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            ArrayList<Integer> a = new ArrayList<>();
            String str = sc.nextLine();
            Scanner split = new Scanner(str);
            while(split.hasNextInt()){
                a.add(split.nextInt());
            }
            matrix.add(a);
        }
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(matrix.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
