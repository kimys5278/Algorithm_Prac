package org.example.BaekJoon.Algorihrm.recursive_function;

//HelloWorld 반복출력
public class recursive_prac1 {

    public static void hello(int n ){
        //n이 0인 경우 return
        if(n == 0){
            return ;
        }
        System.out.println("hello");
        //함수가 호출 될 때마다 n-1 을 해줘서 총 5번 출력됨.
        hello(n-1);
    }
    public static void main(String [] args){
        hello(5);
    }
}
