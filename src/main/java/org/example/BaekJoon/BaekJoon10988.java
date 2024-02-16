package org.example.BaekJoon;

import java.io.*;

public class BaekJoon10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        boolean isPalindrom = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrom = false;
                break;
            }
        }

        if(isPalindrom){
            bw.write("1");
        }else{
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}

