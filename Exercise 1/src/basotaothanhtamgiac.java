import java.util.Scanner;
public class basotaothanhtamgiac {
    public static void main(String[] args) throws Exception {
        System.out.println("Chương trình kiểm tra 3 số tạo thành tam giác");
        Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số đầu tiên");
                double a = scanner.nextDouble();
            System.out.println("Nhập số thứ hai");
                double b = scanner.nextDouble();
            System.out.println("Nhập số thứ ba");
                double c = scanner.nextDouble();
                    if (a+b>c) {
                        if (b+c>a) {
                            if (c+a>b) {
                                System.out.println("3 số là cạnh một tam giác");
                            } else {
                                System.out.println("3 số không phải cạnh một tam giác");
                            }
                            
                        } else {
                            System.out.println("3 số không phải cạnh một tam giác");
                        }
                    } else {
                        System.out.println("3 số không phải cạnh một tam giác");
                    }
                        
                    
                }
            
            
    }

