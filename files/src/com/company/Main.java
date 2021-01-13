package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File fl1 = new File("first.txt");
            Scanner sc1 = new Scanner(fl1);
            File fl2 = new File("second.txt");
            Scanner sc2 = new Scanner(fl2);
            String allfirst =  sc1.next();
            String allsecond =  sc2.next();
            while (sc1.hasNext()) {
                String first = sc1.next();
                allfirst = allfirst + " "+ first;
            }
            sc1.close();
            while (sc2.hasNext()) {
                String second = sc2.next();
                allsecond = allsecond + " " + second;
            }
            System.out.println("Сравнить: \n" + allfirst + "\n" + allsecond);
            sc1.close();
            sc2.close();
            char[] firarr = allfirst.toCharArray();
            char[] secarr = allsecond.toCharArray();
            int i=0;
            while(true){
                try{
                    if(firarr[i] != secarr[i])
                        System.out.println("Не совпадает символ под №: " +  (i+1));
                    i++;
                }
                catch(Exception e){
                    //если один из массивов заканчивается
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
