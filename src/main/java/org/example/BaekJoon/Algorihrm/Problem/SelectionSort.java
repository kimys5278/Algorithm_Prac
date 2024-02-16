package org.example.BaekJoon.Algorihrm.Problem;

public class SelectionSort {

    public static void selection_sort(int [] arr){
        selection_sort(arr,arr.length);
    }
    public static void selection_sort(int [] arr , int size) {
    for(int i =0;i<size-1;i++){
        // 가장 작은 요소의 인덱스를 추적하기 위한 변수
        int min = i;

        // i 다음 요소 부터 배열 긑까지 가장 작은 요소 찾음.
        for(int j = i+1;j<size;j++){
            if(arr[j]< arr[min]){
                min = j;
            }
        }

        swap(arr,min,i);
        }

    }
    public static void swap(int [] a , int i , int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String [] args){
        int arr[] = {50,40,80,70,90,30};
        selection_sort(arr); // 배열을 정렬합니다.
        // 정렬된 배열을 출력합니다.
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
