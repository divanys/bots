import java.util.Scanner;

public class pz_2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        String third = scan.nextLine();
        if ((second.equals(first)) || (second.equals(third)) || (first.equals(third))) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }
    }
}
