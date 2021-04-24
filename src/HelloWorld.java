import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("가로");
	        int a = sc.nextInt();//5
	       System.out.println("세로");
	        int b = sc.nextInt();//3
		for(int i=1;i<=3;i++) {
            for(int j=1;j<=5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
