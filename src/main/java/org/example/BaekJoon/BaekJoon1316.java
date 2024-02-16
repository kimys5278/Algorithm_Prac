package org.example.BaekJoon;

import java.util.Scanner;

public class BaekJoon1316{

    public  static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int word_num = sc.nextInt();
        int cnt = word_num;
        String word;

        for(int i =0;i<word_num;i++){
            boolean check[] = new boolean[26]; //알파벳 갯수
            word = sc.next();
            for(int k = 0; k < word.length()-1; k++){
                if(word.charAt(k)!= word.charAt(k+1)){
                    if(check[word.charAt(k+1)-97]==true){
                        cnt --;
                        break;
                    }
                }
                check[word.charAt(k)-97] = true;

            }

        }
        System.out.println(cnt);
    }
}
