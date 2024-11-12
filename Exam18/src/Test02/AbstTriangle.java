package Test02;

 public abstract class AbstTriangle extends Shape {
        // 한 변의 길이를 나타내는 int형 필드
        private int length;

        // 직각 이등변 삼각형을 생성하는 생성자이다.
        // 한 변의 길이를 인수로 받는다.
        public AbstTriangle(int length) {
            setLength(length);
        }

        // 한 변의 길이를 반환한다
        public int getLength() {
            return length;
        }

        // 한 변의 길이를 설정한다.
        public void setLength(int length) {
            this.length = length;
        }
     public String toString() {
         return "AbstTriangle(length: " + length + ")";
     }
 }