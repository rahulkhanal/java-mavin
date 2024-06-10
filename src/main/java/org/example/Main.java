package org.example;
import Database.SimpleConnection;
import crud.CRUD;

public class Main {
    public static void main(String[] args) {
//        Database connection
//        SimpleConnection simpleConnection = new SimpleConnection();
//        SimpleConnection.getConnection();
        CRUD crud = new CRUD();
//        Read from database

//        crud.readStudents();

//        create into database
        crud.insertStudent("Saira","9876543213","Anamnagar");
    }
}