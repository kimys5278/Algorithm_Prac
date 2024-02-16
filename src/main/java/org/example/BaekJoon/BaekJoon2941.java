package org.example.BaekJoon;

import java.util.Scanner;

public class BaekJoon2941 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    int cnt =0;
    String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
    for(int i=0;i<arr.length;i++){
        if(word.contains(arr[i])){
            word = word.replace(arr[i],"?");
        }

    }
        System.out.println(word.length());

    }
}
