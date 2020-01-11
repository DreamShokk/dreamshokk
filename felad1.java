import java.io.*;
public class felad1 {
    public static void main(String[] args) {
        int n=0,max=0,maxam=0,nullak=0,otok=0,kettok=0;//maxam=a max számok mennyisége.
        int[] t=new int[30];
        
        try{
            BufferedReader inf = new BufferedReader(new FileReader("f03.txt"));
            PrintWriter out=new PrintWriter(new FileWriter("v03_a.txt"));
            
            //feladat 1
            while(inf.ready()){
                t[n]=Integer.parseInt(inf.readLine());
                if(max<t[n]){
                    max=t[n];
                }
                n++;
            }
            for(int i = 0; i<t.length; i++){
                if(t[i]==max){
                    maxam++;
                }
            }
            out.println(maxam);
            out.close();
            //feladat 2
            PrintWriter out2=new PrintWriter(new FileWriter("v03_b.txt"));
            //a)
            for(int i=0;i<t.length;i++){
                if(t[i]==0){
                    nullak++;
                }
            }
            System.out.println(nullak+"db nulla van a tömbben.");
            out2.println(nullak+" a nullak száma.");
            //b)
            for(int i=0;i<t.length;i++){
                if(t[i]==5){
                    otok++;
                }
                if(t[i]==2){
                    kettok++;
                }
            }            
            if(otok>kettok){
                System.out.println("Ötösökből több van, mint kettesekből.");
                out2.println("Ötösökből több van, mint kettesekből.");
            }else{
                System.out.println("Kettesekből több van, mint ötösökből.");
                out2.println("Kettesekből több van, mint ötösökből.");
            }
            for(int i=n-1;i>=0;i--){
                System.out.println(t[i]);
                out2.println(t[i]);
            }
            out2.close();
            inf.close();
        }catch(IOException|NumberFormatException e){System.err.println("hiba: " + e);}
    }
}