package FileManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteFile {

    public WriteFile(){}

    public void createFile(byte[] data, String fileName) throws IOException {
        String fileID = fileName;
        try{
            File newFile = new File(".", fileID);
            if(newFile.exists()){
                System.out.println("File already exists. Please choose new output name.");
            } else {
                FileOutputStream fos = new FileOutputStream(newFile);
                fos.write(data);
                System.out.println("New file created.");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

// https://www.w3schools.com/java/java_files_create.asp
