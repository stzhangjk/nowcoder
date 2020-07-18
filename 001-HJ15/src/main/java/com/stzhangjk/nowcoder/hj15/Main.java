package com.stzhangjk.nowcoder.hj15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int count = 0;
        while(x > 0){
            x = x & (x-1);
            count++;
        }
        System.out.println(count);
    }
}
