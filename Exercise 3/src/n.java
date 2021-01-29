import java.util.Scanner;

public class n{
    public static void main(String[] args) throws Exception {
        System.out.println("Chương trình nhập số nguyên dương n và hiển thị n!");
        System.out.println("Nhập số nguyên dương \"n\"");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        double m = Math.pow(n, n);
        System.out.println("Số n! là "+m);
    }
}
