package com.yaroslavtir;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class Main {

    public static void main(String[] args) {
        String guestName = new Guest().retrieveName("test");
        System.out.println(new Hello().sayHello(guestName));
    }
}
