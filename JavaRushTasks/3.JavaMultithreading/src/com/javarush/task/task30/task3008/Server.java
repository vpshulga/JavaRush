package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        int port = ConsoleHelper.readInt();
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server started");

        try {
            while (true) {

                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        }

        catch (Exception e){
            System.out.println("Error");
        }
        finally {
            serverSocket.close();
        }
    }

    public static void sendBroadcastMessage(Message message){
        try {
            for (Connection connection : connectionMap.values()) {
                connection.send(message);
            }
        }
        catch (IOException e){
            System.out.println("cannot send message");
        }
    }

    private static class Handler extends Thread{
        Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{

            while (true){
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();


                if (message.getType() == MessageType.USER_NAME) {
                    if (!message.getData().isEmpty() && message.getData() != null) {
                        if (!connectionMap.containsKey(message.getData())) {
                            connectionMap.put(message.getData(), connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return message.getData();
                        }
                    }
                }
            }
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException{
            for (String s : connectionMap.keySet()) {
                Message message = new Message(MessageType.USER_ADDED, s);
                if (!s.equals(userName)){
                    connection.send(message);
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true){
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT){
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));
                }
                else
                    ConsoleHelper.writeMessage("Error");
            }
        }

        @Override
        public void run() {

            ConsoleHelper.writeMessage("Connection with " + socket.getRemoteSocketAddress());
            try(Connection connection = new Connection(socket)){
                String userName = serverHandshake(connection);

                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));

                sendListOfUsers(connection, userName);

                serverMainLoop(connection, userName);

                connectionMap.remove(userName);

                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Error1");
            } catch (ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Error2");
            }



            ConsoleHelper.writeMessage("Connection with " + socket.getRemoteSocketAddress() + " closed");
        }
    }
}
