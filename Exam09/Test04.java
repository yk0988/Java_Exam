package Exam09;
//배열변수 값 표시//
public class Test04 {
    public static void main(String[] args) {
        int[] a = new int[5];   // 정수형 배열 a 선언 및 크기 5로 초기화
        System.out.println("a=" + a);  // 배열 변수 a 출력
        a = null;  // 배열 변수 a에 null 할당
        System.out.println("a=" + a);  // null인 배열 변수 a 출력
    }
}


/*
a=[I@15db9742: 첫 번째:
a 는 배열을 참조하고 있기 때문에 배열의 해시코드(메모리 주소를 나타내는 값)가 출력.
여기서 [I는 배열의 타입을 나타내며, @15db9742는 해당 배열 객체의 메모리 주소.

a=null: 두 번째 :
출력에서는 a가 null로 설정되어 있기 때문에, a=null이 출력됨.

요약:
배열을 출력할 때는 배열의 값이 아니라 배열의 메모리 주소가 출력.
배열을 null로 설정하면, 배열은 더 이상 객체를 참조하지 않게 되고, null이 출력.*/
