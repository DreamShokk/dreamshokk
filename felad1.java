import java.io.*;
public class felad1 {
    public static void main(String[] args) {
        Double[] t = new Double[100];
        Double min=0.0,atl=0.0,max=0.0;
        int[] bsz=new int[4];
        char[] b=null,betuk={'a','b','c','d'};
        int n=0,maxh=0,a=0,bk=0,c=0,d=0,max2=0;
        String[] szo=new String[15];
        String ketszo="";
        
        try{
            //feladat 1
            BufferedReader in= new BufferedReader(new FileReader("f04.txt"));
            PrintWriter out=new PrintWriter(new FileWriter("v04_a.txt"));
            while(in.ready()){
                t[n]=Double.parseDouble(in.readLine());
                atl+=t[n];
                n++;
            }
            min=t[n-1];
            for(int i = 0; i<n; i++){
                if(min>t[i]){
                    min=t[i];
                }
                if(max<t[i]){
                    max=t[i];
                    maxh=i;
                }
            }
            atl/=n;
            out.println(min);
            out.println(atl);
            out.println(maxh);
            in.close();
            out.close();
            n=0;
            //feladat 2
            BufferedReader in2=new BufferedReader(new FileReader("f05.txt"));
            PrintWriter out2=new PrintWriter(new FileWriter("v05_a.txt"));
            b=in2.readLine().toCharArray();
            for(int i = 0; i<b.length;i++){
                if(b[i]=='a'){
                    bsz[0]++;
                }else{
                    if(b[i]=='b'){
                        bsz[1]++;
                    }else{
                        if(b[i]=='c'){
                            bsz[2]++;
                        }else{
                            bsz[3]++;
                        }
                    }
                }
            }
            for(int i = 0; i<bsz.length;i++){
                if(bsz[i]>max2){
                    max2=bsz[i];
                }
            }
            for(int i = 0; i <bsz.length;i++){
                if(bsz[i]==max2){
                    out2.print(betuk[i]+" ");
                }
            }
            out2.close();
            n=0;
            //feladat 3
            BufferedReader in3=new BufferedReader(new FileReader("f06.txt"));
            PrintWriter out3=new PrintWriter(new FileWriter("v06_a.txt"));
            while(in3.ready()){
                szo[n]=in3.readLine();
                n++;
            }
            ketszo=szo[0]+szo[1];
            out3.println(ketszo);
            System.out.println(ketszo);
            for(int i = 2; i<n;i++){
                System.out.println(ketszo+szo[i]);
                out3.println(ketszo+szo[i]);
            }
            in3.close();
            out3.close();
        }catch(IOException| NumberFormatException e){System.err.println("hiba: "+e);}
    }
}