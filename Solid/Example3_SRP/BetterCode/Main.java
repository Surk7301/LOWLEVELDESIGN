package Solid.Example3_SRP.BetterCode;

public class Main {
    public static void main(String[] args) {
        
        FileProcessor fp = new FileProcessor("data.txt");
        TextProcessor textProcessor = new TextProcessor(fp);

        textProcessor.convertText();
    }
    
}
