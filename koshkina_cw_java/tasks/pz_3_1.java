import java.util.Scanner;

public class pz_2_1 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        if (str1.equals(str2) && str2.equals(str3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
