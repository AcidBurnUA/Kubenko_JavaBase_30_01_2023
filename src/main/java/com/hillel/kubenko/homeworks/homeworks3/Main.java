package com.hillel.kubenko.homeworks.homeworks3;

public class Main {
    public static void main(String[] args) {
        int x = 51;
        int y = 10;
        float z = 43.9F;
        int g = 1;
        int b = 49;
        float f = 34.2F;
        char ch,cf,cd;
        ch='\u02B9'; cf='\u00B0'; cd='\u0022';
        System.out.println("Stonehenge");
        System.out.println("DMS Lat  "+x+cf+" "+y+ch+" "+z+cd+" N");
        System.out.println("DMS Long  "+g+cf+" "+b+ch+" "+f+cd+" W");
    }
}
