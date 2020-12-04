package org.sydlabz.demo;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Console.showData(LoadData.load());
    }
}