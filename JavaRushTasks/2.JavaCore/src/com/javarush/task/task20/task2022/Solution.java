package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName,true);

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Solution sol = new Solution("D:\\newFile.txt");
        sol.writeObject("sdasasd");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\newFile.txt"));
        oos.writeObject(sol);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\newFile.txt"));
        Solution sol1 = (Solution) ois.readObject();
        sol1.writeObject("sdasd");

    }
}
