import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 선언
        Scanner sc = new Scanner(System.in);

        // 실수형 변수 a 선언
        double a = sc.nextDouble();

        // a에 1.5를 더한 값을 출력
        System.out.printf("%.2f",a+1.5);
    }
}