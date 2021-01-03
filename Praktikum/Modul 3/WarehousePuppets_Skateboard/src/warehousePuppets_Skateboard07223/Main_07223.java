package warehousePuppets_Skateboard07223;

import Controller07223.*;
import Entity07223.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_07223 {
    // inisialisasi object baru dari controller (admin, barang masuk, barang keluar, daftar barang)
    private static AdminController07223 admin = new AdminController07223();
    private static BarangMasukController07223 barangMasuk = new BarangMasukController07223();
    private static BarangKeluarController07223 barangKeluar = new BarangKeluarController07223();
    private static DaftarBarangController07223 daftarBarang = new DaftarBarangController07223();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int loop = 0;
        boolean isLogin = false;
        int pilih = 0;
        System.out.println("Welcome to Warehouse Puppets Skateboard !! ");
        System.out.println("Login as Admin");
        System.out.print("Masukkan Nama Admin = ");
        String Admin = input.next();
        System.out.print("Masukkan Password Admin = ");
        String Password = input.next();
        // insert data admin melalui controller admin
        admin.DataAdmin();

        // perulangan untuk menentukan banyak data admin
        for (int i = 0; i < AllObjectModel07223.adminModel.getListNamaAdmin07223().size(); i++) {
            // penerapan exception handling (try catch)
            try {
                // pengujian untuk mencari apakah data yang login sudah sesuai atau belum dengan data admin yang sudah ada
                if(Admin.equals(AllObjectModel07223.adminModel.getListNamaAdmin07223().get(i).getAdmin()) && Password.equals(AllObjectModel07223.adminModel.getListNamaAdmin07223().get(i).getPassword())){
                    isLogin = true;
                    break;
                } else {
                    System.out.println("Username Atau Password Salah\n");
                    isLogin = false;
                }
            } catch (Exception exception) {
                System.out.println("Username Atau Password Salah\n");
                isLogin = false;
            }
        }
        
        // perulangan (do-while) untuk menampilkan menu
        // perulangan akan berhenti jika attribut isLogin bernilai false
        do {
            // pengujian jika attribut isLogin bernilai true
            if(isLogin){
            System.out.print("\nHello.... Admin"
                        +"\nPilihan Menu : "
                       + "\n 1. Input Daftar Barang Masuk"
                       + "\n 2. Input Daftar Barang Keluar"
                       + "\n 3. Cek Daftar Barang Masuk"
                       + "\n 4. Cek Daftar Barang Keluar"
                       + "\n 5. Update Daftar Barang Masuk"
                       + "\n 6. Update Daftar Barang Keluar"
                       + "\n 7. Hapus Daftar Barang Masuk"
                       + "\n 8. Hapus Daftar Barang Keluar"
                       + "\n 0. Stop"
                       + "\n Masukkan Pilihan Anda : ");
               pilih = input.nextInt();
               if (pilih == 1) {
                   BarangMasuk();
               } else if (pilih == 2) {
                   BarangKeluar();
               } else if (pilih == 3) {
                  viewBarangMasuk();
               } else if (pilih == 4) {
                  viewBarangKeluar();
               } else if (pilih == 5) {
                   UpdateBarangMasuk();
               } else if (pilih == 6) {
                   UpdateBarangKeluar();
               } else if (pilih == 7) {
                  HapusBarangMasuk();
               } else if (pilih == 8) {
                  HapusBarangKeluar();
               } else {
                   break;
               }  
            }else{
               System.out.println("Username Atau Password Salah\n");
            }
        } while (isLogin == true);
    }

    // method insert data barang masuk
    static void BarangMasuk() {
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (mm/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Gudang = ");
        String gudang = input.next();
        barangMasuk.insertBarang(kode,jenis,harga,tanggal,gudang);
    }
    
    // method insert data barang keluar
    static void BarangKeluar() {
       System.out.print("Input Kode = ");
       String kode = input.next();
       System.out.print("Input Jenis = ");
       String jenis = input.next();
       System.out.print("Input Harga = ");
       String harga = input.next();
       System.out.print("Input Tanggal (mm/dd/yyyy) = ");
       Date tanggal = new Date(input.next());
       System.out.print("Kota = ");
       String kota = input.next();
       barangKeluar.insertBarang(kode,jenis,harga,tanggal,kota);
    } 
     
    // method update data barang masuk
    static void UpdateBarangMasuk(){
        viewBarangMasuk();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (mm/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Gudang = ");
        String gudang = input.next();
        barangMasuk.updateBarang(index,kode,jenis,harga,tanggal,gudang); 
    }
     
    // method update data barang keluar
    static void UpdateBarangKeluar(){
        viewBarangKeluar();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        System.out.print("Input Kode = ");
        String kode = input.next();
        System.out.print("Input Jenis = ");
        String jenis = input.next();
        System.out.print("Input Harga = ");
        String harga = input.next();
        System.out.print("Input Tanggal (mm/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Kota = ");
        String kota = input.next();
        barangKeluar.updateBarang(index,kode,jenis,harga,tanggal,kota); 
    }
    
    // method delete data barang masuk
    static void HapusBarangMasuk() {
        viewBarangMasuk();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        barangMasuk.removeBarang(index);
    } 
    
    // method delete data barang keluar
    static void HapusBarangKeluar() {
        viewBarangKeluar();
        System.out.print("Index Barang Ke : ");
        int index = input.nextInt();
        barangKeluar.removeBarang(index);
    }
    
    // method view data barang masuk
    static void viewBarangMasuk() {
        int size = barangMasuk.view();
        if(size == 0) {
            System.out.println("Data Barang Masuk Kosong!");
        } else {
            for (int i=0;i<size;i++) {
                System.out.println("\nData Barang Ke "+i);
                System.out.println("===============================================================");
                System.out.println(" Kode Barang : " + barangMasuk.getData(i).getKode()
                        + "\n Jenis Barang : " + barangMasuk.getData(i).getJenis()
                        + "\n Harga Barang : " + barangMasuk.getData(i).getHarga()
                        + "\n Tanggal Barang : " + new SimpleDateFormat("dd-MM-yyyy").format(barangMasuk.getData(i).getTanggal())
                        + "\n Gudang : " + barangMasuk.getData(i).getGudang());
                System.out.println("===============================================================");
            }
        }
    }
    
    // method view data barang keluar
    static void viewBarangKeluar() {
        int size = barangKeluar.view();
        if(size == 0) {
            System.out.println("Data Barang Keluar Kosong!");
        } else {
            for (int i=0;i<size;i++) {
                System.out.println("\nData Barang Ke "+i);
                System.out.println("===============================================================");
                System.out.println(" Kode Barang : " + barangKeluar.getData(i).getKode()
                        + "\n Jenis Barang : " + barangKeluar.getData(i).getJenis()
                        + "\n Harga Barang : " + barangKeluar.getData(i).getHarga()
                        + "\n Tanggal Barang : " + new SimpleDateFormat("dd-MM-yyyy").format(barangKeluar.getData(i).getTanggal())
                        + "\n Kota : " + barangKeluar.getData(i).getKota());
                System.out.println("===============================================================");
            }
        }
    }
}