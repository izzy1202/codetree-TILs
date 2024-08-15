import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 선언
        Scanner sc = new Scanner(System.in);

        // 변수 n에 입력받은 실수값 저장
        double n = sc.nextDouble();

        // 소수점 둘째자리까지 반올림하여 출력
        System.out.printf("%.2f",n); 

    }
}