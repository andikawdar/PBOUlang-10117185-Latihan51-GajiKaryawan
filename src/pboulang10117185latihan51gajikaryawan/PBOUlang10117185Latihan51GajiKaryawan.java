/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang10117185latihan51gajikaryawan;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class PBOUlang10117185Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     * Nama     : Andhyka Widariyanto
     * Kelas    : PBO Ulang
     * NIM      : 10117185
     * Tugas    : Latihan 51 - Gaji Karyawan
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Manager inMan=new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK     : ");
            inMan.setNik(input.nextLine());
        System.out.print("Masukan Nama    : ");
            inMan.setNama(input.nextLine());
        System.out.print("Masukan Golongan (1/2/3)        : ");
            inMan.setGolongan(input.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
            inMan.setJabatan(input.next());
            
        System.out.print("Masukan Kehadiran : ");
            inMan.setKehadiran(input.nextInt());
            
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK         : "+inMan.getNik());
        System.out.println("NAMA        : "+inMan.getNama());
        System.out.println("GOLONGAN    : "+inMan.getGolongan());
        System.out.println("JABATAN     : "+inMan.getJabatan());
        
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN  : Rp."+inMan.tunjanganGolongan(inMan.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : Rp."+inMan.tunjanganJabatan(inMan.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : Rp."+inMan.tunjanganKehadiran(inMan.getKehadiran()));
        
    }
    
}
