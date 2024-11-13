import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // 공백을 기준으로 문자열을 분리하여 배열로 변환
        String[] strArr = s.split(":");
        
        // 배열의 첫 번째 요소를 숫자로 변환하고 +1 연산
        int firstNumber = Integer.parseInt(strArr[0]) + 1;

        System.out.println(firstNumber+":"+strArr[1]);        
    }
}