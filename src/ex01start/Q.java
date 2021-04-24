package ex01start;


import java.util.Scanner;

public class Q {
    public static void main(String args[]) {
        int arr[] = new int[6];  // 배열선언
        Scanner sc = new Scanner(System.in);
 
        System.out.println("원하는 수 6개를 입력하세요");
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // 배열에 숫자 입력
            for (int j = 0; j < i; j++) {
 
                if (arr[i] == arr[j]) {  // 중복검사
                    System.out.println("중복되는 수 입니다 다시입력하세요.  ( 중복숫자 " + arr[j] + ")");
                    i--;
                }
            }
        }
        
        System.out.println("당신이 입력한 숫자는  :  ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
 
    }
}