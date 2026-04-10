import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    static void queue(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> students = new ArrayList<>();
        ArrayList<Integer> samsa = new ArrayList<>();
        String str = sc.nextLine();
        Scanner split = new Scanner(str);
        while(split.hasNextInt()){
            students.add(split.nextInt());
        }
        str = sc.nextLine();
        split = new Scanner(str);
        while(split.hasNextInt()){
            samsa.add(split.nextInt());
        }
        int one = 0;
        int zero = 0;
        for (int i : students){
            if (i == 0){
                zero++;
            }
            else if (i == 1){
                one++;
            }
            else {System.out.println("Error!");}
        }
        for (int i : samsa){
            if (i == 0){
                if (zero == 0){
                    System.out.println(one);
                    return;
                }
                zero--;
            }
            else if (i == 1){
                if (one == 0){
                    System.out.println(zero);
                    return;
                }
                one--;
            }
        }
        System.out.println(0);
    }
}
