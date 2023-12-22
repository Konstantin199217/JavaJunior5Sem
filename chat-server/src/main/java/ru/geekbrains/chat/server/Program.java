package ru.geekbrains.chat.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Program {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(1600);
            Server server = new Server(serverSocket);
            server.runServer();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}