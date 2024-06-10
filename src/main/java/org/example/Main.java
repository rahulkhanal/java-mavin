package org.example;
import Database.SimpleConnection;

public class Main {
    public static void main(String[] args) {
        SimpleConnection simpleConnection = new SimpleConnection();
        SimpleConnection.getConnection();
        System.out.println("Hello world!");
    }
}