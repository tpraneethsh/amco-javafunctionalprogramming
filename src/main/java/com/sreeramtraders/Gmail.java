package com.sreeramtraders;

public class Gmail implements EmailSender{

    @Override
    public void send() {
        System.out.println("Sending email using Gmail....");
    }
}
