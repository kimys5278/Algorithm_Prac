package org.example.BaekJoon.Algorihrm.recursive_function;
//배열에서 최대 값 찾기
public class ArrayFunction {

    public static int ArraySort(int [] a, int n ){
        int x;
        if(n == 1){
            return a[0];
        }else{
            x = ArraySort(a , n-1);
        }
        if(x > a[n-1]){
            return x;
        }else{
            return a[n-1];
        }

    }

    public static void main (String [] args ){
        int arr[] = {10,20,30,40,50,60,70};
        System.out.println(ArraySort(arr,5));
    }
}
