import java.util.*;

/**
 * LATIHAN COLLECTION NO. 2
 * Lanjutan dari Latihan No. 1
 * Mengecek apakah buku tertentu ada di perpustakaan menggunakan contains()
 */
public class Latihan_No2 {
    public static void main(String[] args) {
        System.out.println("===== LATIHAN COLLECTION NO. 2 =====\n");
        
        // Data buku dari Latihan No. 1 (sudah diurutkan dan tanpa duplikat)
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
        
        // Menggunakan TreeSet untuk menghilangkan duplikat dan mengurutkan
        Set<String> bukuSet = new TreeSet<>(Arrays.asList(bukuArray));
        
        // Menampilkan daftar buku perpustakaan
        System.out.println("Daftar Buku Perpustakaan:");
        System.out.println("=========================");
        for (String buku : bukuSet) {
            System.out.println("  - " + buku);
        }
        System.out.println();
        
        // Simulasi pengunjung mencari buku
        String bukuDicari = "Mahaguru";
        System.out.println("[PENGUNJUNG] Saya ingin meminjam buku: \"" + bukuDicari + "\"\n");
        
        // Mengecek menggunakan method contains()
        if (bukuSet.contains(bukuDicari)) {
            System.out.println("[PETUGAS] ✓ Buku \"" + bukuDicari + "\" TERSEDIA");
            System.out.println("           Silahkan lanjut ke meja peminjaman.\n");
        } else {
            System.out.println("[PETUGAS] ✗ Buku \"" + bukuDicari + "\" TIDAK TERSEDIA");
            System.out.println("           Maaf, buku sedang dipinjam atau tidak ada di katalog.\n");
        }
        
        // Menampilkan daftar lengkap menggunakan looping for tanpa index
        System.out.println("Daftar Lengkap Buku (Menggunakan for loop tanpa index):");
        System.out.println("=====================================================");
        System.out.print("Buku tersedia: ");
        int counter = 0;
        for (String buku : bukuSet) {
            System.out.print(buku);
            counter++;
            if (counter < bukuSet.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        
        // Demonstrasi penggunaan contains() dengan berbagai input
        System.out.println("Demonstrasi method contains():");
        System.out.println("==============================");
        String[] bukuTest = {"Mahaguru", "Harry Potter", "Dilan 1990", "Ayat-Ayat Cinta"};
        for (String buku : bukuTest) {
            if (bukuSet.contains(buku)) {
                System.out.println("\"" + buku + "\" => TERSEDIA ✓");
            } else {
                System.out.println("\"" + buku + "\" => TIDAK TERSEDIA ✗");
            }
        }
    }
}
