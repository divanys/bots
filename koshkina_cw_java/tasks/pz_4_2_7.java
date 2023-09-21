import java.util.Scanner;

public class pz_3_2_7 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        boolean b = false;
        int j = 0;
        int bb = 0;
        for (String i = scan.nextLine().toLowerCase(); true; i = scan.nextLine().toLowerCase()) {
            if (i.equals("стоп")) break;
            if (!i.equals("ээээ") && !i.equals("нууу")) {
                j++;
                if (i.equals("куб")) {
                    b = true;
                    bb = j;
                }
            }
        }
        System.out.println((b)?bb:"NO");
    }
}
