package chapter01.section01;


/**
 * 메소드에 대한 설계문서(Spec) 작성
 *
 * 작성 메소드 이름: sum
 * 기능 구현에 필요한 재료(argument): int a, int b
 * 반환 값의 타입: int
 * 정상 동작 만족 조건(작성 종료조건): a와 b를 더한 값을 결과로 돌려줌. 즉, sum(10, 15)는 25가 돼야 함
 */
public class Calculator {
    public int sum(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 예상 결과를 코드로 표현하여 자동으로 판단하도록 함
        // 검증 코드를 먼저 작성하고, 모든 검증 코드가 성공(true)할 때까지 구현
        System.out.println(calc.sum(10, 20) == 30);     // false
        System.out.println(calc.sum(1, 2) == 3);        // false
        System.out.println(calc.sum(-10, 20) == 10);    // false
        System.out.println(calc.sum(0, 0) == 0);        // false
    }
}
