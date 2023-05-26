package ru.vshp.listing7;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GrepInputStream  {
     class GrepInputStream extends FileInputStream {
         String substring = null;
         BufferedReader br;
         public GrepInputStream(InputStream in, String substring)
         {
             super(in);
             this.br = new BufferedReader(new
                     InputStreamReader(in));
             this.substring = substring;
         }
         public final String readLine() throws IIOException {
             String line;
             do {
                 line = br.readLine();
             } while ((line != null) && line.indexOf(substring) == -1);
             return line;
         }
     }
}
