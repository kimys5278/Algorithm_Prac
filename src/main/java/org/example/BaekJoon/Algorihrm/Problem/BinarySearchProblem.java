package org.example.BaekJoon.Algorihrm.Problem;

import java.util.Scanner;

/*
*여러 개의 수가 정렬된 순서로 있을 때 특정한 수를 찾는 방법

단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 O(n)의 수행이 이루어짐

수가 정렬된 상태에서는 이진 탐색(binary search)을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 O(logN)의 수행으로 원하는 수를 찾을 수 있음

수의 예 : [12, 25, 31, 48, 54, 66, 70, 83, 95, 108]

83 위치 찾기
* */
public class BinarySearchProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;

        int temp = numbers[mid];
        boolean find = false;

        while (left <= right) {
            if(target == temp){
                find = true;
                break;
            }else if(target > temp){
                left = mid +1;

            }else{
                right = mid - 1;
            }
            mid = (left + right)/2;
            temp = numbers[mid];
        }

        if(find == true){
            mid ++;
            System.out.println("찾고자 하는 수는 "+mid+"번 째에 있습니다.");
        }else{
            System.out.println("찾고자 하는 수가 없습니다.");
        }

    }
}
