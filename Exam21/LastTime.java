package Exam21;

import java.io.*;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

class LastTime {
    static void init() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("LastTime.txt"));
            String time= br.readLine();
            System.out.println("이전 시간은"+time+"이 였습니다.");
        } catch (IOException e) {
            System.out.println("이 프로그램을 실행하는 것은 처음입니다.");
        }finally {
            if(br != null){
                try{
                    br.close();
                }catch (IOException e){
                    System.out.println("파일 닫기 실패");
                }
            }
        }

    }

    static void term() {
        FileWriter fw = null; // 파일 쓰기 객체 선언

        try {
            fw = new FileWriter("LastTime.txt"); // 파일 생성 또는 열기
            GregorianCalendar c = new GregorianCalendar(); // 현재 시각 얻기
            fw.write(String.format("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초",
                    c.get(YEAR), c.get(MONTH) + 1, c.get(DATE),
                    c.get(HOUR_OF_DAY), c.get(MINUTE), c.get(SECOND))); // 파일 쓰기
        } catch (IOException e) { // 예외 처리
            System.out.println("오류 발생!!");

        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기 실패.");
                }
            }
        }
    }

    public static void main(String[]args){
        init();
        term();
    }
    }