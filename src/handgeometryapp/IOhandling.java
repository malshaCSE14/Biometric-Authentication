/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handgeometryapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Malsha
 */
public class IOhandling {

    void saveUser(User user) {
        //create file if there is no file
        //record all the details
        float[] lengths = user.getLengthArray();
        float[] widths = user.getWidthArray();
        float[] tipToDivision = user.getTipToDivisionArray();
        String line =user.getName();
        line=line+" ";
        for (int i=0;i<5;i++){
            line=line+lengths[i];
            line=line+" ";
        }
        for (int i=0;i<5;i++){
            line=line+widths[i];
            line=line+" ";
        }
        for (int i=0;i<5;i++){
            line=line+tipToDivision[i];
            line=line+" ";
        }
        
        try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter("users.txt", true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.write(System.getProperty("line.separator"));

            // Always close files.
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println(ex);
            // Or we could just do this:
            // ex.printStackTrace();
        }
   
    }

    String verifyUser(User user) {
        
        
        float[] lengths = user.getLengthArray();
        float[] widths = user.getWidthArray();
        float[] tipToDivision = user.getTipToDivisionArray();
        String line1 ="";
        for (int i=0;i<5;i++){
            line1=line1+lengths[i];
            line1=line1+" ";
        }
        for (int i=0;i<5;i++){
            line1=line1+widths[i];
            line1=line1+" ";
        }
        for (int i=0;i<5;i++){
            line1=line1+tipToDivision[i];
            line1=line1+" ";
        }
        String[] details1 = line1.split(" ");
        String name = "";
      
        List filereaderOutput = new ArrayList();
        String line = "";
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =new FileReader("users.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                filereaderOutput.add(line);
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        for(int i=0; i<filereaderOutput.size();i++){
            String content = (String) filereaderOutput.get(i);
            String[] details2 = content.split(" ");
            //System.out.println(details2[0]);
            //System.out.println(compare(details1,details2));
            if (compare(details1,details2)==true){
                name= details2[0];
            }
                   
        }
    
      return name;
    }
    public boolean compare(String[] details1, String[] details2){

        boolean result = false;
        for(int i=0;i<15;i++){
            //comapre details1[i] with details2[i+1] if abs(details1[i]-details2[i+1])>0.2 break, return false
            float d1 = Float.parseFloat(details1[i]);
            float d2 = Float.parseFloat(details2[i+1]);
            if(Math.abs(d2-d1)>0.2){
                return false;
            }
        }
        return true;
    }
}
