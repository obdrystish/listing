package ru.vshp.listing6;

import javax.imageio.IIOException;

public class ExecProcess {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IIOException ioe) {
            ioe.printStackTrace();
        }
    }
}
