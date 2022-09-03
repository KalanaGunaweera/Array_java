package com.Array_java;

public class Main {
    public static void main(String[] args) {
        String a = "Saman";
        String b = "Kamal";
        String c = "123";
        String d = "12@gh";
        String e = "S";

        String [] data = new String[5];
        String [] data2 = {"Saman","Kamal","123","12@gh","S"};
        String[] data3 = new String[]{"Saman","Kamal","123","12@gh","S"};

        data[0]="Saman";
        data[1]="Kamal";
        data[2]="123";
        data[3]="12@gh";
        data[4]="S";

        String size = String.valueOf(data.length);
        System.out.println(size);


        System.out.println("DATA's 0 index is " +data[0]);
        System.out.println("DATA's 1 index is " +data[1]);
        System.out.println("DATA's 2 index is " +data[2]);
        System.out.println("DATA's 3 index is " +data[3]);
        System.out.println("DATA's 4 index is" + data[4]);













        //System.out.println("Hello world!");
    }
}