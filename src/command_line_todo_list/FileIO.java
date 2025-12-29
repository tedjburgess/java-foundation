package command_line_todo_list;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileIO {
    
    public FileIO() {
    }

    public void write(String data, String filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(data);
            writer.close();
            System.out.println("Saved successfully\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }        
}
