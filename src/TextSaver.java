

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextSaver {
    public TextSaver(TextTransformer transformer) {
        this.transformer = transformer;
    }

    private TextTransformer transformer;
    private File file;
    public void saveTextToFile(String text) {
        String string = transformer.transform(text);
        //"D:\\Java\\OtherCurs2\\Inheritance\\TextTransformer\\textTransform.txt" // так путь не пишем
        file = new File("textTransform.txt");
        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            string =string + "\r\n";
            byte[] buffer = string.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
