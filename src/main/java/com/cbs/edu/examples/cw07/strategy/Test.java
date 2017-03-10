package com.cbs.edu.examples.cw07.strategy;

public class Test {
    public static void main(String[] args) {
        String text = "Hello world";
        String key = "qwerty";

        Algorithm desa = new DESAlgorithm();
        Encryption encryption = new Encryption(desa);
        System.out.println(encryption.crypt(text, key));

        Algorithm rsa = new RSAAlgorythm();
        encryption.setAlgorithm(rsa);
        System.out.println(encryption.crypt(text, key));

        encryption.setAlgorithm(new Algorithm() {
            @Override
            public String crypt(String text1, String key1) {
                return "Crypted by custom algorithm!";
            }
        });
        System.out.println(encryption.crypt(text, key));

    }
}
