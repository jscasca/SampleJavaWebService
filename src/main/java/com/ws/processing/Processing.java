package com.ws.processing;

public class Processing {

    public static void delay(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
