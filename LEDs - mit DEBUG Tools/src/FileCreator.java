
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileCreator {

    private File f;

    public FileCreator(String dateipfad) {
        String filePath = dateipfad;
        f = new File(filePath);
    }

    public void createFile(String data) {
        try {
            f.createNewFile();
        } catch (Exception e) {
            System.err.println(e);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
            writer.write(data);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void appendData(String additionalData, boolean zeilenumbruch) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f, true))) {
            writer.write(" ");
            if (zeilenumbruch){
                writer.newLine();
            }
            writer.write(additionalData);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
} 