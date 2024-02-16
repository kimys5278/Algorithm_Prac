package org.example.BaekJoon.Algorihrm.recursive_function;

// 1+N의 합계 출력
public class recursive_prac2 {
    public static int Plus(int n ){
        // N 이 0 이면 return
        if(n == 0){
            return 0;
        }
        return n += Plus(n-1); //재귀 함수 시작
    }
    public static void main(String [] args ){

        int n =5;

        System.out.println("1 부터 "+n +"까지의 합 은"+Plus(5));

    }

}
