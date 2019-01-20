/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan6.kambingstatic.konstanta;

/**
 *
 * @author ibadguthwara
 * NAMA 	     : M. Ibad Guthwara
 * KELAS	     : PBO 3 ULANG
 * NIM		     : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mengambil variabel dari beda class
 */

public class Mamalia{
    // Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;
}

public class PBO3ULANG10116049Latihan6KambingStaticKonstanta {
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}

/* Variabel static "jumlahKambing" yang terdapat pada kelas Mamalia
 * dapat langsung diakses di kelas PBO3ULANG10116049Latihan6KambingStaticKonstanta
 * dengan cara "NamaKelas.namaVariabelStatic"
*/
