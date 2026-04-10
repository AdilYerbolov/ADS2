import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    static Scanner sc = new Scanner(System.in);
    static void loop(){
        ArrayList<Integer> a = new ArrayList<>();
        String str = sc.nextLine();
        Scanner split = new Scanner(str);
        while(split.hasNextInt()){
            a.add(split.nextInt());
        }
        System.out.println(recursion(a.size(), a));
    }
    static String recursion(int n, ArrayList<Integer> a){
        if (n == 1){
            return String.valueOf(a.getFirst());
        }
        return String.valueOf(a.get(n - 1)) + " " + recursion(n - 1, a);
    }
}
