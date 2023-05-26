package ru.vshp.listing7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileByReader {
    File file = File("file.bin");
    InputStream is = new FileInputStream(file);
    long lenght = file.length();
    if (lengtht > Integer.MAX_VALUE) {
        throw new IOException("Файл " + file.getName() +
                "слишком длинный!")
    }
    byte[] bytes = new byte[(int) lenght];
    int offset = 0;
    int numRead = 0;
    while (offset < bytes.length &&
            (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
        offset += numRead;
    }
    if (offset < bytes.length) {
        throw new IOException("Не удалось прочитать файл " +
                file.getName() + " целиком.");
    }
    is.close();
}
