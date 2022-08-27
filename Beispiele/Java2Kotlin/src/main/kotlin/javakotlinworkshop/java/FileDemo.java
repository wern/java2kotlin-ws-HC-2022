package javakotlinworkshop.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDemo {

    private static final Logger LOGGER = Logger.getLogger(FileDemo.class.getName());

    public static void main(String[] args) {
        FileOutputStream fos = null;
        // demo: explain why we are not using try-with-resources
        try {
            File temp = File.createTempFile("MATHEMA_Campus_2018", ".txt");
            temp.deleteOnExit();
            LOGGER.info(temp.getAbsolutePath());
            fos = new FileOutputStream(temp);
            // demo: what happens if we set an unknown encoding?
            fos.write("Hallo MATHEMA Campus".getBytes(Charset.forName("UTF8")));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "whoops", e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    LOGGER.log(Level.SEVERE, "close() failed", e);
                }
            }
        }
    }
}
