import java.util.Scanner;

public class pz_3_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prod = 0;

        int count = 0;
        int one_digit = 0;


        for (String s = sc.nextLine();; s = sc.nextLine()) {
            if ((s.equals("СТОП"))) {
                break;
            }
            int n = Integer.parseInt(s);
            if (n != 0) {
                if (count == 0){
                    prod = 1;
                    one_digit = n;
                } prod = prod * n;
                count = count + 1;
            }
        }
        if(prod == 0){
            System.out.println("Не найдено");
        }else if (count == 1){
            System.out.println(one_digit);
        }else System.out.println(prod);
    }
}
