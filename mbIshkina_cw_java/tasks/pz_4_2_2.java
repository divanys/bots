import java.util.Scanner;

public class pz_4_2_2 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        boolean b = false;
        for (String i = scan.nextLine().toLowerCase(); true; i = scan.nextLine().toLowerCase()) {
        if (i.equals("стоп")) break;
        if (i.equals("куб")) b = true;
        }
        System.out.println((b)?"YES":"NO");
    }
}
