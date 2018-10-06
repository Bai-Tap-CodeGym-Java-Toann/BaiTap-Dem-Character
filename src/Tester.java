import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuôi: ");
        String string = sc.nextLine();
        System.out.print("nhập kí tự cần tìm: ");
        String character = sc.nextLine();
        System.out.println("số lần xuất hiện: " + counter(string, character.charAt(0)));

    }

    private static int counter(String stringIn, char findThis) {
        int out = 0;
        for (int i = 0; i < stringIn.length(); i++) {
            if (stringIn.charAt(i) == findThis) {
                out++;
            }
        }
        return out;
    }
}
