/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam
 */
public class WriteToCSV {

    public static void savePlayerInfo(int id, String name, int score,String filepath){
        boolean Overload = false;
        
        if(id == 0){
            Overload = false;
        }else{
            Overload = true;
        }
            try{
                FileWriter fw = new FileWriter(filepath,Overload);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                
                pw.println(id + "," + name + "," + score);
                pw.close();
                fw.close();
                if(id == 0){
                    System.out.println("File Saved");
                }
                

        }catch(Exception E){
            System.out.println("File Did not Save");
        }
    }
    public static void deletePlayerFile(String filepath){
         try{
                FileWriter fw2 = new FileWriter(filepath,false);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                PrintWriter pw2 = new PrintWriter(bw2);
                
                pw2.println(0);
                pw2.close();
                fw2.close();
                System.out.println("File Deleted");
            
                

        }catch(Exception E){
            System.out.println("File Did not Save");
        }
        
    }
}
