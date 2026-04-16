import java.util.*;

/**
 * LATIHAN COLLECTION NO. 1
 * Mengurutkan buku secara abjad dan menghilangkan duplikat
 */
public class Latihan_No1 {
    public static void main(String[] args) {
        System.out.println("===== LATIHAN COLLECTION NO. 1 =====\n");
        
        // Data buku dengan beberapa duplikat
        String[] bukuArray = {
            "Dilan 1990", 
            "Laskar Pelangi", 
            "Mahaguru", 
            "Mengejar Matahari", 
            "Dilan 1991", 
            "Milea", 
            "Perahu Kertas", 
            "Laskar Pelangi",      // duplikat
            "Perahu Kertas"        // duplikat
        };
        
        System.out.println("Buku Asli (dengan duplikat):");
        for (String buku : bukuArray) {
            System.out.println("  - " + buku);
        }
        System.out.println("Total: " + bukuArray.length + " buku\n");
        
        // Menggunakan TreeSet untuk:
        // 1. Menghilangkan duplikat (karakteristik Set)
        // 2. Mengurutkan elemen secara otomatis (karakteristik Tree)
        Set<String> bukuSet = new TreeSet<>(Arrays.asList(bukuArray));
        
        // Menampilkan hasil menggunakan iterasi (looping)
        System.out.println("Daftar Buku Perpustakaan (Terurut Abjad, Tanpa Duplikat):");
        System.out.println("=========================================================");
        int nomor = 1;
        for (String buku : bukuSet) {
            System.out.println(nomor + ". " + buku);
            nomor++;
        }
        System.out.println("\nTotal buku unik: " + bukuSet.size() + " buku");
    }
}