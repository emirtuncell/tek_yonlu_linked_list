package veri_yapilari3;

import java.util.Scanner;

public class uygulama {
       public static void main(String[] args) {
		
    	   
    	   liste_yapisi tylist= new liste_yapisi();
    	   
    	   Scanner scan=new Scanner(System.in);
    	  
    	   int secim,eklenecek,indis;	
    	   while(true) {
    		   System.out.println("1- BAŞA  EKLE");
    		   System.out.println("2- SONA  EKLE");
    		   System.out.println("3- ARAYA  EKLE");
    		   System.out.println("4- BAŞTAN  SİL");
    		   System.out.println("5- SONDAN SİL");
    		   System.out.println("6- ARADAN SİL");
    		   System.out.println("0- ÇIKIŞ");
    		   System.out.println("SEÇİMİNİZ:  ");
    		   
    		   secim=scan.nextInt();
    		    
    		
    		   
    		   switch(secim) {//hangi işlemi yapmak istediğini kullanıcıdan aldım. Yapmak istediği işleme göre
    		   //ekleyeceği sayıyı veya ekleyeceği indis numarasını da aldım.
    		   case 1: 
    			   System.out.println("EKLENECEK SAYI:  ");
    		   eklenecek=scan.nextInt();
    			   tylist.basaekle(eklenecek);
    		   break;
    		   
    		   
    		   case 2:
    			   System.out.println("EKLENECEK SAYI:  ");
        		   eklenecek=scan.nextInt();
    			   tylist.sonaekle(eklenecek);
    		   break;
    		   
    		   case 3:
    			   System.out.println("EKLENECEK SAYI:  ");
        		   eklenecek=scan.nextInt();
        		   System.out.println("EKLENECEĞİ İNDİS:  ");
        		   indis=scan.nextInt();
    			   tylist.arayaekle(indis, eklenecek);
    		   break;
    		   
    		   case 4:
    			   
    			   tylist.bastanSil();
    		   break;
    		   
    		   case 5:
    			   
    			   tylist.sondanSil();
    		   break;
    		   
    		   case 6:
    			   System.out.println("SİLİNECEK İNDİS:  ");
           		   indis=scan.nextInt();
    			   tylist.aradanSil(indis);
    		   break;
    		   
    		   
    		   }
    		   if(secim==0) {
    			   System.out.println("LİSTEYE ELEMAN EKLEME SÜRECİ BİTTİ.");
    			   break;
    		   }
    		   
    		   tylist.yazdır();
    		   System.out.println("\n\n");
    		   
    	   }
	}
}
