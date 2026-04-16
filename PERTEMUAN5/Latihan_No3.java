import java.util.*;

/**
 * LATIHAN COLLECTION NO. 3
 * Menggunakan Map untuk menyimpan pasangan Perusahaan - Founder
 * Menampilkan key dengan huruf besar menggunakan toUpperCase()
 */
public class Latihan_No3 {
    public static void main(String[] args) {
        System.out.println("===== LATIHAN COLLECTION NO. 3 =====\n");
        
        // Membuat Map untuk menyimpan pasangan Perusahaan (Key) - Founder (Value)
        // Menggunakan LinkedHashMap untuk mempertahankan urutan insertion
        Map<String, String> perusahaan = new LinkedHashMap<>();
        
        // Memasukkan data sesuai tabel
        perusahaan.put("Microsoft", "Bill Gates");
        perusahaan.put("Apple", "Steven Paul Jobs");
        perusahaan.put("Linux", "Linux Benedict Torvalds");
        perusahaan.put("Facebook", "Mark Zuckerberg");
        perusahaan.put("Twitter", "Jack Dorsey");
        perusahaan.put("Instagram", "Kevin Systrom");
        
        // Menampilkan data dalam format tabel
        System.out.println("Tabel Perusahaan dan Founder:");
        System.out.println("============================");
        System.out.println(String.format("%-15s | %-30s", "Perusahaan", "Founder"));
        System.out.println("-".repeat(50));
        for (String key : perusahaan.keySet()) {
            System.out.println(String.format("%-15s | %-30s", key, perusahaan.get(key)));
        }
        System.out.println();
        
        // Menampilkan key dengan huruf besar menggunakan toUpperCase()
        System.out.println("Output dengan Key Huruf Besar:");
        System.out.println("=============================");
        for (String key : perusahaan.keySet()) {
            // Method toUpperCase() mengubah semua huruf kecil menjadi huruf besar
            String keyBesar = key.toUpperCase();
            String value = perusahaan.get(key);
            System.out.println(keyBesar + " dikembangkan oleh " + value);
        }
        System.out.println();
        
        // Demonstrasi method toUpperCase() seperti di soal
        System.out.println("Demonstrasi method toUpperCase():");
        System.out.println("=================================");
        
        System.out.println("Contoh 1 - Literal String:");
        System.out.println("System.out.println(\"pbo\".toUpperCase());");
        System.out.println("Output => " + "pbo".toUpperCase());
        System.out.println();
        
        System.out.println("Contoh 2 - String Variable:");
        String p = "Pbo";
        System.out.println("String p = \"" + p + "\";");
        System.out.println("System.out.println(p.toUpperCase());");
        System.out.println("Output => " + p.toUpperCase());
        System.out.println();
        
        // Demonstrasi tambahan
        System.out.println("Demonstrasi Tambahan:");
        System.out.println("====================");
        String[] test = {"java", "collections", "map", "set", "list"};
        for (String str : test) {
            System.out.println("\"" + str + "\".toUpperCase() => " + str.toUpperCase());
        }
        System.out.println();
        
        // Menampilkan informasi tentang Map
        System.out.println("Informasi Map:");
        System.out.println("==============");
        System.out.println("Total pasangan key-value: " + perusahaan.size());
        System.out.println("Keys: " + perusahaan.keySet());
        System.out.println("Values: " + perusahaan.values());
    }
}