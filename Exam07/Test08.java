public class Test08 {
    public static void main(String[] args) {
        // double형 배열-앞에서부터 1.1 2.2....5.5 표시

        double[]a=new double[5];//배열선언

        for(int i =0; i<a.length; i++)
            a[i] =5-i;

        for(int i =0; i< a.length; i++)
        System.out.println("a["+ i +"]=" +a[i]);
    }
}
