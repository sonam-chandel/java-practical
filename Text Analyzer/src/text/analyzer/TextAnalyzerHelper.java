/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package text.analyzer;

/**
 *
 * @author sonam
 */
public class TextAnalyzerHelper {

    /**
     * @param args the command line arguments
     */
     private String inputtedText;
     private int textLength;
     private int wordCount;
     private int lineCount;
     private int tabCount;
     private int spaceCount;
     private String uniqueCharText;

    public TextAnalyzerHelper(String inputtedText) {
        this.inputtedText = inputtedText;
        analyze();
    }

    public int getTextLength() {
        return textLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getTabCount() {
        return tabCount;
    }

    public int getSpaceCount() {
        return spaceCount;
    }

    public String getUniqueCharText() {
        return uniqueCharText;
    }
     
    int getCharOrWordCount(String text){
      return 0;  
    }

    
    private void analyze(){
        textLength=inputtedText.length();
        lineCount=textLength>0?inputtedText.split("\n",-1).length:0;
        spaceCount=inputtedText.split(" ",-1).length-1;
        tabCount=inputtedText.split("\t",-1).length-1;
        wordCount=count(inputtedText);
        
        
        
}

    int count(String inputtedText){
        String[] str=inputtedText.split("[\n\t\s]");
        int emptyString=0;
    int words=0;
      for(int i=0;i<str.length;i++)
      {
   if(str[i]=="")
  {
  emptyString++;
    }
}
   words=str.length-emptyString;
   return words;
 }

    @Override
    public String toString() {
        return "TextAnalyzerHelper{" + "inputtedText=" + inputtedText + ", textLength=" + textLength + ", wordCount=" + wordCount + ", lineCount=" + lineCount + ", tabCount=" + tabCount + ", spaceCount=" + spaceCount + ", uniqueCharText=" + uniqueCharText + '}';
    }
    
    
     
  public static void main(String[] args) {
        // TODO code application logic here
       TextAnalyzerHelper textSample=new TextAnalyzerHelper(" a@adsd \t\nasd");
        System.out.println(textSample);
    }
    
}
