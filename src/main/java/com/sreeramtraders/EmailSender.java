package com.sreeramtraders;

@FunctionalInterface
public interface EmailSender {
    boolean send(String from, String to);
}
