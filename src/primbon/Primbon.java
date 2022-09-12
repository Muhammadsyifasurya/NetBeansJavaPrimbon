package primbon;
import java.util.Scanner;

public class Primbon 
{
    Scanner sc = new Scanner(System.in);
    int neptuharipria=0,neptupsrnpria=0,neptupsrnwnt=0,sisa,sisa2;        
    static int neptuhariwnt=0,totalneptupria,totalneptuwanita,totalneptupriawanita;
    String haripria,hariwanita,pasaranpria,pasaranwanita;
    
    void pria()
    {
           do
        {
            System.out.println("Masukan Hari Pria\t = ");
            haripria=sc.next();   
        }
           while(!(haripria.toUpperCase().equals("MINGGU"))&&!(haripria.toUpperCase().equals("SENIN"))
                &&!(haripria.toUpperCase().equals("SELASA"))&&!(haripria.toUpperCase().equals("RABU"))
                &&!(haripria.toUpperCase().equals("KAMIS"))&&!(haripria.toUpperCase().equals("JUMAT"))
                &&!(haripria.toUpperCase().equals("SABTU")));
           
           if(haripria.toUpperCase().equals("MINGGU")) {neptuharipria=5;}
           else if(haripria.toUpperCase().equals("SENIN")) {neptuharipria=4;}
           else if(haripria.toUpperCase().equals("SELASA")) {neptuharipria=3;}
           else if(haripria.toUpperCase().equals("RABU")) {neptuharipria=7;}
           else if(haripria.toUpperCase().equals("KAMIS")) {neptuharipria=8;}
           else if(haripria.toUpperCase().equals("JUMAT")) {neptuharipria=6;}
           else if(haripria.toUpperCase().equals("SABTU")) {neptuharipria=9;}
    }
    
    void wanita()
    {
        do
        {
            System.out.print("Masukkan Hari Wanita\t= ");
            hariwanita=sc.next();
        }
        while(!(hariwanita.toUpperCase().equals("MINGGU"))&&!(hariwanita.toUpperCase().equals("SENIN"))
             &&!(hariwanita.toUpperCase().equals("SELASA"))&&!(hariwanita.toUpperCase().equals("RABU"))
             &&!(hariwanita.toUpperCase().equals("KAMIS"))&&!(hariwanita.toUpperCase().equals("JUMAT"))
             &&!(hariwanita.toUpperCase().equals("SABTU")));
        
        if(hariwanita.toUpperCase().equals("MINGGU")) {neptuhariwnt=5;}
        else if(hariwanita.toUpperCase().equals("SENIN")) {neptuhariwnt=4;}
        else if(hariwanita.toUpperCase().equals("SELASA")) {neptuhariwnt=3;}
        else if(hariwanita.toUpperCase().equals("RABU")) {neptuhariwnt=7;}
        else if(hariwanita.toUpperCase().equals("KAMIS")) {neptuhariwnt=8;}
        else if(hariwanita.toUpperCase().equals("JUMAT")) {neptuhariwnt=6;}
        else if(hariwanita.toUpperCase().equals("SABTU")) {neptuhariwnt=9;}
  
    }
    
    void pasaran()
    {
        do 
        {
            System.out.print("Masukkan Pasaran Pria\t= ");
            pasaranpria=sc.next();
        }
        while(!(pasaranpria.toUpperCase().equals("LEGI"))&&!(pasaranpria.toUpperCase().equals("PAHING"))
               &&!(pasaranpria.toUpperCase().equals("PON"))&&!(pasaranpria.toUpperCase().equals("WAGE"))
               &&!(pasaranpria.toUpperCase().equals("KLIWON")));
      
        if(pasaranpria.toUpperCase().equals("LEGI")) {neptupsrnpria=5;}
        else if(pasaranpria.toUpperCase().equals("PAHING")) {neptupsrnpria=9;}
        else if(pasaranpria.toUpperCase().equals("PON")) {neptupsrnpria=7;}
        else if(pasaranpria.toUpperCase().equals("WAGE")) {neptupsrnpria=4;}
        else if(pasaranpria.toUpperCase().equals("KLIWON")) {neptupsrnpria=8;}
        
        do 
        {
            System.out.print("Masukkan Pasaran Wanita\t= ");
            pasaranwanita=sc.next();
        }
        
        while(!(pasaranwanita.toUpperCase().equals("LEGI"))&&!(pasaranwanita.toUpperCase().equals("PAHING"))
               &&!(pasaranwanita.toUpperCase().equals("PON"))&&!(pasaranwanita.toUpperCase().equals("WAGE"))
               &&!(pasaranwanita.toUpperCase().equals("KLIWON")));
        
        if(pasaranwanita.toUpperCase().equals("LEGI")) {neptupsrnwnt=5;}
        else if(pasaranwanita.toUpperCase().equals("PAHING")) {neptupsrnwnt=9;}
        else if(pasaranwanita.toUpperCase().equals("PON")) {neptupsrnwnt=7;}
        else if(pasaranwanita.toUpperCase().equals("WAGE")) {neptupsrnwnt=4;}
        else if(pasaranwanita.toUpperCase().equals("KLIWON")) {neptupsrnwnt=8;}        
    }
    
    int hitung (int neptuwadon)
    {
        System.out.println("\n====================\nWeton Kedua Pasangan\t\n====================");
        
        totalneptupria=neptuharipria+neptupsrnpria;
        totalneptuwanita=neptuwadon+neptupsrnwnt;
        totalneptupriawanita=totalneptupria+totalneptuwanita;
      
        return totalneptupriawanita;
    }
    
    void tampil()
    {
        System.out.println("Total Neptu Pria\t\t= "+totalneptupria);
        System.out.println("Total Neptu Wanita\t\t= "+totalneptuwanita);
        System.out.println("Total Weton Kedua Pasangan\t= "+totalneptupriawanita);
          
        sisa=totalneptupriawanita%10;
        if(sisa==0) 
        {
            sisa=totalneptupriawanita%7;
            System.out.println("Sisa\t\t\t\t= "+sisa);
        }
        else 
        {System.out.println("Sisa\t\t\t\t= "+sisa);}
        
        if(sisa==1) {System.out.print("Wasesasegara yang artinya besar budinya, kaya dan besar wibawanya.");}
        else if(sisa==2) {System.out.print("Tunggaksemi yang artinya sedikit rezekinya.");}
        else if(sisa==3) {System.out.print("Satriyawibawa yang artinya dapat kemulyaan dan keluhuran tinggi.");}
        else if(sisa==4) {System.out.print("Sumursinaba yang artinya banyak orang datang untuk berguru.");}
        else if(sisa==5) {System.out.print("Satriyawirang yang artinya sering susah, \nsering malu akibat tindakannya sendiri dan suka difitnah orang dalam kita primbon. \nUntuk menolak hal tersebut bisa memotong ayam saat akan ijab kabul.");}
        else if(sisa==6) {System.out.print("Bumikepetak yang artinya hatinya gelap, kuat dalam bekerja, tahan menghadapi ujian dan rintangan.\nUntuk menolak hal tersebut bisa mendem lemah/mengubur tanah saat akan ijab kabul pengantin.");}
        else if(sisa==7) {System.out.print("Lebuketiupangin yang artinya sering mendapatkan kesusahan, apapun cita-cita tidak akan jadi, \nsering pindah rumah, penolak bala yang bisa dilakukan dengan cara abul lemah/menabur debu saat akan ijab kabul pengantin.");}
        else if(sisa>7) 
        {
            sisa2=sisa%7; 
            if(sisa2==1) {System.out.print("Wasesasegara yang artinya besar budinya, kaya dan besar wibawanya.");}
            else if(sisa2==2) {System.out.print("Tunggaksemi yang artinya sedikit rezekinya.");}
        }
        sc.close(); 
    }
 
    public static void main(String[] args) 
    {
        Primbon dino = new Primbon();
        dino.pria();
        dino.wanita();
        dino.pasaran();
        dino.hitung(neptuhariwnt);
        dino.tampil();
    }
}   