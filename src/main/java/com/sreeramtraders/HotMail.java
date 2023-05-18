package com.sreeramtraders;

public class HotMail implements EmailSender{

    @Override
    public void send() {
        System.out.println("Sending email using HotMail...");
    }
}
