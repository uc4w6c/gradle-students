package com.example.dns;

import java.net.InetAddress;
import java.net.Socket;

public class DnsSample {
    public static void main(String[] args) {
        // 一旦これで確認して修正すること
        // 参考:https://www.glamenv-septzen.net/view/1346
        try (Socket socket = new Socket("www.google.com", 80)) {
            InetAddress ia = socket.getInetAddress();
            System.out.println(ia.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
