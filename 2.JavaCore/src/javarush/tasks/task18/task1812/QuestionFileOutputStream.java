package javarush.tasks.task18.task1812;

import java.io.*;

/*
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream original;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.original = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        original.flush();
    }

    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        if (string.equals("Д")) {
            original.close();
        }
    }
}

