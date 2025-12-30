package command_line_todo_list;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
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
    
    public String read(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            String data = "";
            while ((line = reader.readLine()) != null) {
                data += line + "\n";
            }
            reader.close();
            System.out.println("File loaded successfully\n");
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Could not load file";
        
    }
}
