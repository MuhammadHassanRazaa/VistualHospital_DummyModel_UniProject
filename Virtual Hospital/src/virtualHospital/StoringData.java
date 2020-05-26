/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualHospital;

import java.io.*;

/**
 *
 * @author sshth
 */
class StoringData {
    public static void CompleteDataFrom2DArray(String [][] Dataa) throws IOException {
         File file = new File("./src/VirtualHospital/Files/PatientInfo.txt");
          File filefather = new File("./src/VirtualHospital/Files/PatientFatherInfo.txt");
          FileWriter fr = new FileWriter(file,true);
          BufferedWriter bf= new BufferedWriter (fr);
          PrintWriter pw = new PrintWriter(bf);
          pw.println(Dataa[0][0]+","+Dataa[0][1]+","+Dataa[0][2]+","+Dataa[0][3]+","+Dataa[0][4]+","+Dataa[0][5]+","+Dataa[0][6]+","+Dataa[0][7]+","+Dataa[0][8]+","+Dataa[0][9]);
          
          pw.flush();pw.close();
          fr= new FileWriter(filefather,true);
         bf= new BufferedWriter(fr);
         pw=new PrintWriter(bf);
         pw.println(Dataa[1][0]+","+Dataa[1][1]+","+Dataa[1][2]+","+Dataa[1][3]+","+Dataa[1][4]+","+Dataa[1][5]+","+Dataa[1][6]+","+Dataa[1][7]);
         pw.close();
    }
    
}
