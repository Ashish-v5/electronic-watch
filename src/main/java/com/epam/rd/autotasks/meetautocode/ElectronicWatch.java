package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int s=seconds%60;
        int h=seconds/60;
        int m=h%60;
        h=h/60;
        if(h%24==0) {
            h = 0;
            System.out.println(h + "0:0" + m + ":0" + s);
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
