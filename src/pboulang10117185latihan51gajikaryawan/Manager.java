/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang10117185latihan51gajikaryawan;

/**
 *
 * @author user
 * Nama     : Andhyka Widariyanto
 * Kelas    : PBO Ulang
 * NIM      : 10117185
 * Tugas    : Latihan 51 - Gaji Karyawan
 */
public class Manager extends Karyawan{
    //Atribute
    int kehadiran;
    float tunjanganGolongan;
    float tunjanganJabatan;
    float tunjanganKehadiran;
    
    //Function
    int getKehadiran(){
        return kehadiran;
    }
    
    void setKehadiran(int parKehadiran){
        kehadiran=parKehadiran;
    }
    
    float tunjanganKehadiran (int hadir){
        tunjanganKehadiran = kehadiran*10000;
        return tunjanganKehadiran;
    }
    float tunjanganJabatan(String jabatan){
        switch(jabatan){
            case "Manager": tunjanganJabatan = 2000000;
                break;
            case "Kabag": tunjanganJabatan = 1000000;
                break;
        }
        return tunjanganJabatan;
    }
    float tunjanganGolongan(int golongan){
        switch (golongan){
            case 1: tunjanganGolongan = 500000;
                break;
            case 2: tunjanganGolongan = 1000000;
                break;
            case 3: tunjanganGolongan = 1500000;
                break;
            default:tunjanganGolongan = 0; 
        }
        return tunjanganGolongan;
        }
    float gajiTotal(){
        return tunjanganJabatan+tunjanganGolongan+tunjanganKehadiran;
    }
}
