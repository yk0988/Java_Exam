public class Test06 {
    public static void main(String[] args) {
        // int 형 자료 : 순서대로 5 4 3 2 1 대입하는 프로그램
        int[]a=new int[5];//배열선언

        for(int i =0; i<a.length; i++)
            a[i] =5-i;

        for(int i =0; i<a.length; i++)
        System.out.println("a["+ i +"]=" +a[i]);
    }
}
