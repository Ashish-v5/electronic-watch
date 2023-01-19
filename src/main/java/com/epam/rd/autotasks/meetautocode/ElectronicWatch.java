package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int x=seconds%86400;
        int s=x%60;
        int h=x/60;
        int m=h%60;
        h=h/60;
        if(h%24==0 && m==0 && s==0) {
            System.out.println("0:0" + m + ":0" + s);
        }
        else if(s<10 && m<10) {
            System.out.println(h+":0"+m+":0"+s);
        }else if(s<10 && m>10){
            System.out.println(h+":"+m+":0"+s);
        }else if(s>10 && m<10){
            System.out.println(h+":0"+m+":"+s);
        }
        else{
            System.out.println(h+":"+m+":"+s);
        }
    }
}
