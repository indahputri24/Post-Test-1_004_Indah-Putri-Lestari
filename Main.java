package tugaspbo.sistem_parkir_kendaraan_mall;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Penyimpanan data di satu class menggunakan ArrayList
    static ArrayList<String> platList = new ArrayList<>();
    static ArrayList<String> jenisList = new ArrayList<>();
    static ArrayList<String> blokList = new ArrayList<>();
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            // Data Parkir Awal
            platList.add("KT4959IO");
            jenisList.add("Mobil");
            blokList.add("A1");

            platList.add("KT1234AB");
            jenisList.add("Motor");
            blokList.add("B2");

            platList.add("KT5678CD");
            jenisList.add("Mobil");
            blokList.add("C1");

            platList.add("KT8765XYZ");
            jenisList.add("Motor");
            blokList.add("D3");

            platList.add("KT4321EFG");
            jenisList.add("Mobil");
            blokList.add("E1");
            
            boolean jalan = true;
            while (jalan) {
                System.out.println("\n====================================");
                System.out.println("|     MENU SISTEM PARKIR MALL      |");
                System.out.println("====================================");
                System.out.println("| 1. Tambah Data Parkir            |");
                System.out.println("| 2. Tampilkan Data Parkir         |");
                System.out.println("| 3. Perbarui Data Parkir          |");
                System.out.println("| 4. Hapus Data Parkir             |");
                System.out.println("| 5. Keluar                        |");
                System.out.println("====================================");
                System.out.println("Masukkan pilihan menu [1-5]: ");
                int pilihan;
                try {
                    pilihan = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input menu harus angka 1-5.");
                    continue;
                }
                
                switch (pilihan) {
                    case 1 -> tambahData(sc);
                    case 2 -> tampilkanData();
                    case 3 -> perbaruiData(sc);
                    case 4 -> hapusData(sc);
                    case 5 -> {
                        System.out.println("Terima kasih. Program Selesai.");
                        jalan = false;
                    }
                    default -> System.out.println("Pilihan tidak valid. Masukkan pilihan angka [1-5].");
                }
            }
        }   
    }
    // Tambah Data Parkir
    static void tambahData(Scanner sc) {
        System.out.println("\n=============== Tambah Data Parkir ===============");
        // Tambah plat
        System.out.println("Masukkan plat nomor kendaraan (ENTER untuk batal): ");
        String plat = sc.nextLine();
        if (plat.equals("")) {
            System.out.println("Batal menambah data, kembali ke menu utama.");
            return;
        } 
        // cek duplikat plat
        for (String platKendaraan : platList) {
            if (platKendaraan.equalsIgnoreCase(plat)) {
                System.out.println("Plat sudah ada, data tidak bisa ditambahkan.");
                return;
            }
        }
        // Tambah jenis kendaraan
        String jenis;
        while (true) {
            System.out.println("Jenis kendaraan (mobil/motor) (ENTER untuk batal): ");
            jenis = sc.nextLine();
            if (jenis.equals("")) {
                System.out.println("Batal menambah data, kembali ke menu utama.");
                return;
            }
            if (jenis.equalsIgnoreCase("Mobil") || jenis.equalsIgnoreCase("Motor")) {
                break;
            } else {
                System.out.println("Jenis harus 'Mobil' atau 'Motor'! Coba lagi.");
            }
        }
        // Tambah blok lokasi
        System.out.println("Masukkan blok lokasi parkir (ENTER untuk batal): ");
        String blok = sc.nextLine();
        if (blok.equals("")) {
            System.out.println("Batal menambah data, kembali ke menu utama.");
            return;
        }
        
        platList.add(plat);
        jenisList.add(jenis);
        blokList.add(blok);
        
        System.out.println("\nBerhasil menambahkan data parkir dengan plat " + plat + ".");
        System.out.println("-------------------------------------------------------");
    }
    
    // Tampilkan Data Parkir
    static void tampilkanData() {
        System.out.println("\n========== Data Parkir Kendaraan ==========");
        if (platList.isEmpty()) {
            System.out.println("Belum ada data parkir kendaraan di mall.");
        } else {
            // Header tabel
            System.out.printf("%-3s %-10s %-10s %-6s%n", "No", "PLAT", "JENIS", "BLOK");
            System.out.println("-------------------------------------------");
            // Isi
            for (int i = 0; i < platList.size(); i++) {
                System.out.printf("%-3d %-10s %-10s %-6s%n",
                    (i + 1),
                    platList.get(i),
                    jenisList.get(i),
                    blokList.get(i));
            }
            System.out.println("-------------------------------------------");
        }
    }
    
    // Perbarui Data Parkir
    static void perbaruiData(Scanner sc) {
        tampilkanData();
        if (platList.isEmpty()) 
            return;
        System.out.println("\n========== Perbarui Data Parkir ===========");
        // Mencari plat
        int posisi = -1;
        String platCari;
        while (true) {
            System.out.println("Masukkan plat nomor yang ingin diperbarui (ENTER untuk batal): ");
            platCari = sc.nextLine();
            if (platCari.equals("")) {
                System.out.println("Batal perbarui data, kembali ke menu utama.");
                return;
            }
            // Cek data pada list
            posisi = -1;
            for (int i = 0; i < platList.size(); i++) {
                if (platList.get(i).equalsIgnoreCase(platCari)) {
                    posisi = i;
                    break;
                }
            }
            if (posisi != -1)
                break;
            System.out.println("\nPlat nomor kendaraan tidak ditemukan.");
            
        }
        // data lama
        String lamaPlat  = platList.get(posisi);
        String lamaJenis = jenisList.get(posisi);
        String lamaBlok  = blokList.get(posisi);
        
        System.out.println("\nData saat ini");
        System.out.println("Plat : " + lamaPlat);
        System.out.println("Jenis: " + lamaJenis);
        System.out.println("Blok : " + lamaBlok);
        
        //sub menu diperbarui
        System.out.println("\n==================================");
        System.out.println("|     Pilihan Perbarui Data      |");
        System.out.println("==================================");
        System.out.println("| 1. Plat Nomor                  |");
        System.out.println("| 2. Jenis Kendaraan             |");
        System.out.println("| 3. Blok Lokasi                 |");
        System.out.println("| 4. Batal Perbarui              |");
        System.out.println("====================================");
        System.out.println("Masukkan menu pilihan data yang ingin diperbarui [1-4]: ");
        int pilihan;
        try {
            pilihan = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input menu harus angka 1-5.");
            return;
        }
        
        switch (pilihan) {
            case 1 -> { //Perbarui Plat
               while (true) {
                    System.out.print("Masukkan plat baru (ENTER untuk batal): ");
                    String platBaru = sc.nextLine();
                    if (platBaru.equals("")) {
                        System.out.println("Batal ubah plat.");
                        return;
                    }
                    // cek duplikat
                    boolean duplikat = false;
                    for (int j = 0; j < platList.size(); j++) {
                        if (j != posisi && platList.get(j).equalsIgnoreCase(platBaru)) {
                            duplikat = true;
                            break;
                        }
                    }
                    if (duplikat) {
                        System.out.println("Plat baru sudah ada di data lain.");
                        continue;
                    }
                    platList.set(posisi, platBaru);
                    System.out.println("Plat " + lamaPlat + " berhasil diperbarui menjadi " + platBaru);
                    return;
               }
            }
            case 2 -> { //Perbarui Jenis Kendaraan
                while (true) {
                    System.out.print("Masukkan jenis baru (ENTER untuk batal): ");
                    String jenisBaru = sc.nextLine();
                    if (jenisBaru.equals("")) {
                        System.out.println("Batal ubah jenis.");
                        return;
                    }
                    if (jenisBaru.equalsIgnoreCase("Mobil") || jenisBaru.equalsIgnoreCase("Motor")) {
                        jenisList.set(posisi, jenisBaru);
                        System.out.println("Jenis kendaraan berhasil diperbarui.");
                        return;
                    } 
                    System.out.println("Jenis harus 'Mobil' atau 'Motor'! Coba lagi.");
                }
            }
            case 3 -> { //Perbarui Blok Lokasi
                System.out.println("Masukkan blok lokasi baru (ENTER untuk batal): ");
                String blokBaru = sc.nextLine();
                if (blokBaru.equals("")) {
                    System.out.println("Batal ubah blok.");
                    return;
                }
                blokList.set(posisi, blokBaru);
                System.out.println("Blok " + lamaBlok + " berhasil diperbarui menjadi " + blokBaru);
                return; 
            }
            case 4 -> {
                System.out.println("Batal perbarui data. Kembali ke menu utama.");
                return;
            }
            default -> {
                System.out.println("Pilihan tidak valid. Kembali ke menu utama.");
                return;
            }
        }
    }
    
    // Hapus Data Parkir
    static void hapusData(Scanner sc) {
        tampilkanData();
        if (platList.isEmpty()) 
            return;
        System.out.println("\n============ Hapus Data Parkir ============"); 
        while (true) {
            System.out.println("Masukkan plat nomor yang ingin dihapus (ENTER untuk batal): ");
            String platCari = sc.nextLine();

            if (platCari.equals("")) {
                System.out.println("Batal hapus data, kembali ke menu utama.");
                return;
            }
        
            int posisi = -1;
            for (int i = 0; i < platList.size(); i++) {
                if (platList.get(i).equalsIgnoreCase(platCari)) {
                    posisi = i;
                    break;
                }
            }
        
            if (posisi == -1) {
                System.out.println("Plat nomor tidak ditemukan.");
                continue;
            }
            // konfirmasi
            System.out.println("Yakin ingin menghapus data dengan plat " + platCari + "? (Y/T): ");
            String konfirmasi = sc.nextLine();
            if (konfirmasi.equalsIgnoreCase("Y")) {
                platList.remove(posisi);
                jenisList.remove(posisi);
                blokList.remove(posisi);
                System.out.println("Data dengan plat " + platCari + " berhasil dihapus!");
                System.out.println("------------------------------------------------");
            } else {
                System.out.println("Batal hapus data, kembali ke menu utama.");
            }
            return;
        }
    }
}