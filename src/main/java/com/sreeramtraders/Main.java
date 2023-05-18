package com.sreeramtraders;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new Gmail();
        emailSender.send();


        /*
        EmailSender praneethSender = new EmailSender() {
            @Override
            public void send() {
                System.out.println("Sending Email using Praneeth mail server.....");
            }
        };*/

        EmailSender praneethSender = () -> {    System.out.println("Gmail");   };

        praneethSender.send();
        }
}