package org.example.BaekJoon.Algorihrm.Problem;
// InsertSort 구현하기
public class InsertSort {
    public static void InsertionSort(int[] a , int n){
        int temp = 0;
        int i = 0;
        int j = 0;
        for(i = 1; i < n; i++){
            temp = a[i];
            j = i;
            while((j>0)&&a[j-1] > temp){
                a[j] = a[j-1];
                j = j-1;
            }
            a[j] = temp;
            System.out.println("반복 - "+ i );
        }
        PrintSort(a, n);

    }

    public static void PrintSort(int[] value, int n){
        for( int i = 0;i<n;i++){
            System.out.println(value[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int [] a = {80,50,70,10,60,20,40,30};
        InsertionSort(a,8);

    }

}
