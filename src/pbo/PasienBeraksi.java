package pbo;

import java.util.Scanner;

public class PasienBeraksi {
    public static void main(String[] args) {
        //objek 7
        //Pasien psx = new Pasien("Susanti", "2310010196s");
        
        //System.out.println(psx.displayInfo());
        //System.out.println(psx.displayInfo("ICU"));
        
        try{
        
        //io sederhana 11 (scanner input data)
        Scanner scanner = new Scanner(System.in);
        
        //array 12
        PasienDetail[] psx = new PasienDetail[2];
        
    for(int i=0; i<psx.length; i++){
        System.out.print("Masukkan nama pasien "+ (i+1)+": ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Noregistrasi pasien "+(i+1)+": ");
        String noregistrasi = scanner.nextLine();
        
        //objek
        psx[i] = new PasienDetail(nama, noregistrasi);
    }
        
    //perulangan 13
    for(PasienDetail data: psx){
        System.out.println("===================================");
        System.out.println("Data Pasien: ");      
        System.out.println(data.displayInfo());
    }
    
    //Eror Handling 14
} catch (NumberFormatException e){
    System.out.println("Kesalahan format nomor: "+e.getMessage());
} catch (StringIndexOutOfBoundsException e){
    System.out.println("Kesalahan format Noregistrasi: "+e.getMessage());
}catch (Exception e) {
    System.out.println("Kesalahan umum: "+e.getMessage());
            
        }    
    
    }
}
