//készítette Illék Kristóf, csak referencia értékként kezelendő.
import java.io.*;
import java.util.*;
public class IllésKristóf10Ddolgozat {
    public static void main(String[] args) {
        int sorok=0,otajto=0,toyota=0,maxev=0,homokdb=0,homokszam=0;
        try{
            //feladat 1
            int ev=Calendar.getInstance().get(Calendar.YEAR);
            BufferedReader sor=new BufferedReader(new FileReader("autok1sorban.txt"));
            while(sor.ready()){
                sorok++;
                sor.readLine();
            }
            sor.close();
            BufferedReader in=new BufferedReader(new FileReader("autok1sorban.txt"));
            String[][]t=new String[sorok][4];
            for(int i=0;i<sorok;i++){
                String[] b=in.readLine().split(";");
            //feladat 2
                if(Integer.parseInt(b[2])==5){
                    otajto++;
                }
            
            //feladat 3    
                if(b[0].contains("Toyota")){
                    toyota++;
                }
                for(int j=0;j<4;j++){
                    t[i][j]=b[j];
                }
            //feladat5 (itt a gyártásuktól vett időt számítom a mostani évből.)
                if(b[3].contains("Homok")){
                    homokdb++;
                    homokszam+=ev-Integer.parseInt(b[1]);
                }
            }
            for(int i=0;i<t.length;i++){
                System.out.println((t[i][0])+" "+(t[i][1])+". évi kiadású, "+t[i][2]+" ajtós, "+t[i][3]+" színű.");
            //feladat 4
                if(Integer.parseInt(t[i][1])>Integer.parseInt(t[maxev][1])){
                    maxev=i;
                }
            }
            System.out.println("2. "+otajto+" autónak van 5 ajtaja.");
            System.out.println("3. "+toyota+"db Toyota gyártású autó van említve.");
            System.out.println("4. "+t[maxev][0]+" gyártású és típusú a legfiatalabb autó, ez "+t[maxev][1]+"-ben gyártott");
            System.out.println("5. A homokszínű autók átlagéletkora "+(((double)(homokszam))/((double)(homokdb)))+" év.");
        }catch(IOException|NumberFormatException e){System.err.println("Hiba: "+e);}
    }
}
