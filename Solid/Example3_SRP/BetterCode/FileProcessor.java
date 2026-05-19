package Solid.Example3_SRP.BetterCode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {
    private String filePath;

    public FileProcessor(String filePath){
        this.filePath = filePath;
    }

    public String readAllText(String fullFilePath) throws IOException{
        String content = new String(Files.readAllBytes(Path.of(this.filePath)));
        return content;
    }

        public void writeToFile(String fullFilePath, String text) throws IOException{
            String outputFilePath = Paths.get(this.filePath).getFileName().toString().replaceFirst("[.][^.]+$", "") + "_converted.html";
            System.out.println(outputFilePath);
    
            try(BufferedWriter writer = Files.newBufferedWriter(Path.of(outputFilePath))){
                writer.write(text);
            }
        }
    
}
