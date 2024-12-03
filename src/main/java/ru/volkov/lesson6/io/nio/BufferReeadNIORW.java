package ru.volkov.lesson6.io.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferReeadNIORW {

    public static final String filePath = "src/main/resources/TryWithNIO_RW.txt";

    public static void main(String[] args) {

        RandomAccessFile aFile = null;
        try {
            aFile = new RandomAccessFile(filePath, "rw");
            //aFile = new RandomAccessFile(filePath, "r");
            System.out.println(aFile.length()  + " - размер файла." );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            aFile.writeChars("zzzzzzzz");
            aFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            aFile = new RandomAccessFile(filePath, "r");
            FileChannel inChannel = aFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(4);

            int bytesReaded = inChannel.read(buf);
            while (bytesReaded != -1 ){

                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.print( (char) buf.get() );
                }
                buf.clear();
                bytesReaded = inChannel.read(buf);
            }
            aFile.close();

        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
