
class StringTester {
    public static void main(String[] args) {
        String s1 = null; // null 참조 (참조하지 않는다)
        String s2 = ""; // 빈 문자열
        String s3 = "ABC"; // "ABC" 문자열
        String s4 = "ABC"; // "ABC" 문자열
        String s5 = "ABC"; // "ABC" 문자열
        s5 = "XYZ"; // s5는 "XYZ" 문자열로 변경

        System.out.println("문자열 s1 = " + s1);
        System.out.println("문자열 s2 = " + s2);
        System.out.println("문자열 s3 = " + s3);
        System.out.println("문자열 s4 = " + s4);
        System.out.println("문자열 s5 = " + s5);
        System.out.println("s3와 s4는 같은 문자열 리터럴을 참조합니다."+
                ((s3==s4)?"하고있다.":"하고 있지 않음"));
    }
}