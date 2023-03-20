package com.hillel.kubenko.homeworks.homeworks16;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.openSource();
        iPhones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.icloud();
    }
}
interface Smartphones {

    void call();

    void sms();

    void internet();

}


interface LinuxOS {

    void openSource();

}


interface iOS {

    void icloud();

}

