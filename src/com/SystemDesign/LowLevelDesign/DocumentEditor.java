package com.SystemDesign.LowLevelDesign;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
    //bad way of writing code
   private List<String> documentElement;
   private String renderedDocument;
   public DocumentEditor(){
       documentElement=new ArrayList<>();
       renderedDocument="";
   }

    public  void addText(String text) {
       documentElement.add(text);

    }
    public  void addImage(String imagePath) {
       documentElement.add(imagePath);

    }
    public  String renderDocument() {
        if (renderedDocument.isEmpty()) {
            StringBuilder result = new StringBuilder();
            for (String element : documentElement) {
                if (element.length() > 4 && (element.endsWith(".png") || element.endsWith(".jpj"))) {
                    result.append("[image : ").append(element).append("]\n");
                } else {
                    result.append(element).append("\n");
                }
            }
           renderedDocument= result.toString();
        }

         return renderedDocument;
    }
    public  void saveToFile() {
       try{
           FileWriter writer=new FileWriter("document.txt");
           writer.write(renderedDocument);
           writer.close();
           System.out.println("document save to documnet.txt");
       }catch(IOException e){
           System.out.println("error ! unable to open file for write");
       }
    }

    public static  void main(String[] args) {
       DocumentEditor editor=new DocumentEditor();
       editor.addText("hii i am hira");
        editor.addImage("picture.png");
        editor.addText("this is my first document");
        System.out.println(editor.renderDocument());
        editor.saveToFile();
    }
}
