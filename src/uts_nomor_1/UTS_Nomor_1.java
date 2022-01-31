/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_nomor_1;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class UTS_Nomor_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Warung “Air Murah” kepunyaan paman Gober
        Air mineral kemasan Galon dijual Rp 30.000, - dengan discount 15%, 
        kemasan Botol Besar dijual Rp. 5,000,- discount 12%, 
        kemasan Botol Kecil dijual Rp.3.000,- discount 10%,
        Gelas dijual Rp. 1.000,- discount 20%. 
        */
        int masukGalon, masukB_besar, masukB_kecil, masukGelas;
        int nilaiGalon, nilaiB_besar, nilaiB_kecil, nilaiGelas;
        int total, totalDiskon, diskonGalon, diskonB_besar, diskonB_kecil,diskonGelas, bayar;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nota Warung \"Air Murah\"");
        System.out.println("Nama  : FX Bima Yudha Pratama");
        System.out.println("NIM   : 205314020");
        System.out.println("");
        System.out.print  ("Masukkan Jumlah Galon  : ");
        masukGalon = input.nextInt();
        nilaiGalon = (masukGalon * 30000);
        diskonGalon = ( (nilaiGalon) * (15 / 100) );
        
        System.out.print  ("Masukkan Jumlah B.Besar: ");
        masukB_besar = input.nextInt();
        nilaiB_besar = (masukB_besar * 5000);
        diskonB_besar = ( (nilaiB_besar) * (12 / 100) );
        
        System.out.print  ("Masukkan Jumlah B.Kecil: ");
        masukB_kecil = input.nextInt();
        nilaiB_kecil = (masukB_kecil * 3000);
        diskonB_kecil = ( (nilaiB_kecil) * (10 / 100) );
        
        System.out.print  ("Masukkan Jumlah Gelas  : ");
        masukGelas = input.nextInt();
        nilaiGelas = (masukGelas * 1000);
        diskonGelas = ( (nilaiGelas) * (20 / 100) );

        total = nilaiGalon + nilaiB_besar + nilaiB_kecil + nilaiGelas;
        totalDiskon = diskonGalon + diskonB_besar + diskonB_kecil + diskonGelas;
        bayar = total - totalDiskon;
        
        System.out.println("Jml  Kemasan  @       Harga    Discount");
        System.out.println("=======================================");
        System.out.println("1.   Galon    30.000  "+ nilaiGalon   +"    "+diskonGalon);
        System.out.println("2.   B.Besar  5.000   "+ nilaiB_besar +"    "+diskonB_besar);
        System.out.println("3.   B.Kecil  3.000   "+ nilaiB_kecil +"     "+diskonB_kecil);
        System.out.println("4.   Gelas    1.000   "+ nilaiGelas   +"     "+diskonGelas);
        System.out.println("=======================================");
        System.out.println("     TOTAL            "+ total        +"    "+totalDiskon);
        System.out.println("");
        System.out.println("DIBAYARKAN : " + bayar);
    }
    
}
