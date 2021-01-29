import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        System.out.println("Chương trình liệt kê số Fibonacci");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương");
        int n = scanner.nextInt();
               
        long f0 = 0, f1 = 1, fn;
        if (n>0){
do {
        for (int i=0; i <= n; i++){
            if (i < 2) {
                System.out.println(i);
            } else {
                fn = f0+f1;
                f0 = f1;
                f1 = fn;
                System.out.println(fn);
            }
            }
        }while (n>=0);
        }else{System.out.println("Bảo nguyên dương cơ mà?");}
    }
}
