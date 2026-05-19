package Solid.Example3_SRP.BetterCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TextProcessor {

    private FileProcessor fileProcessor;

    public TextProcessor(FileProcessor fileProcessor){
        this.fileProcessor = fileProcessor;
    }
    public void convertText(){
        try{
            System.out.println("Please spesify the full file path to convert to HtML");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fullFilePath = reader.readLine();
            if(fullFilePath == null || fullFilePath.isEmpty()){
                return;
            }

            String inputText = this.fileProcessor.readAllText(fullFilePath);
            String[] paragraphs = inputText.split("\\r?\\n\\r?\\n");

            StringBuilder sb = new StringBuilder();
            for(String paragraph : paragraphs){
                if(paragraph.trim().isEmpty()){
                    continue;
                }
                sb.append("<p>").append(paragraph.trim()).append("</p>\n");
            }
            sb.append("<br/>\n");
            this.fileProcessor.writeToFile(fullFilePath, sb.toString());
        }catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
