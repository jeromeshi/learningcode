
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner sc = new Scanner(f);
        List<String> l = new ArrayList<String>();
        while (sc.hasNextLine()) {
            l.add(sc.nextLine());
        }
        return l;
    }

    public void save(String file, String text) throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.write(text);
        fw.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.write("");
        for ( String s : texts) {
            fw.append(s);
            fw.append("\n");
        }
        fw.close();
    }
}
