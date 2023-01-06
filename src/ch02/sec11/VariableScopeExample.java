package ch02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1 > 10) {
            int v2 = v1 - 10;
        }
        // v2 변수는 지역변수로 선언되었기 때문에 사용할 수 없다.
        // int v3 = v1 + v2 + 5;
    }
}
