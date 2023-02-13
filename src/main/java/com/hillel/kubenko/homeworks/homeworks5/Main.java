package com.hillel.kubenko.homeworks.homeworks5;

public class Main {
    public static void main(String[] args) {
        int warLi = 13;
        int arcLi = 24;
        int ridLi = 46;
        int warMin = 9;
        int arcMin = 35;
        int ridMin = 12;
        int numLi =  860;
        int numMin = (int) (860 * 1.5);
        int armyLi = (int) ((numLi * warLi)+(numLi * warLi)+(numLi * warLi));
        int armyMin = (int) ((numMin * warMin)+(numMin * warMin)+(numMin * warMin));
        System.out.print("army Li strength: " +armyLi);
        System.out.print("\narmy Min strength: " +armyMin);
    }
}