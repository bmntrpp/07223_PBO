/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Entity.*;
import Model.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author nolife
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Transaksi> dataTransaksi = new ArrayList();
    static ArrayList<Katalog> jenisLayanan = new ArrayList();
    private static AdminModel adminModel = new AdminModel();
    private static Scanner input = new Scanner(System.in);
    

    static int cekAdmin;
    static int pil;
    int indexdat;
    public static void main(String[] args) {
       Main m = new Main();
       System.out.println("=============Sistem Manajemen Laundry=================");
       System.out.println("=============Silakan Login=================");
       m.dataAdmin();
       m.loginAdmin();
       m.menu();
       
       
       
    }
    
    void menu(){
      do{
          
          System.out.println("1. Input");
            System.out.println("2. Tampilkan Data");           
            System.out.println("3. Data Inventori");
            System.out.println("4. Keluar");
            pil = input.nextInt();
             switch(pil){
                 case 1:
                    add();
                    break;
                 case 2:
                     view();
                     break;                     
             }
      }while(pil !=4);
    }
    
     void add(){
         System.out.print("input nama pelanggan = ");
         String nama_pelanggan = input.next();
         System.out.print("input Tgl masuk (dd/mm/yyyy) = ");
         Date tanggal_masuk = new Date(input.next());
         System.out.print("input antrian = ");
         String antrian = input.next();
           for(int i=0;i<Katalog.layanan.length;i++){
             System.out.println(i+". "+Katalog.layanan[i]);
         }
         System.out.print("input paket cuci = ");
         int indexpaket = input.nextInt();
         
         System.out.print("input nama pegawai = ");
         String pegawai = input.next();
       
         System.out.print("input berat cucian = ");
         float berat_cucian = input.nextByte();
         
         System.out.print("input Tgl Selesai (dd/mm/yyyy) = ");
         Date tanggal_selesai = new Date(input.next());
         
         System.out.print("input Harga = Rp.");
         int harga = input.nextInt();

         System.out.print("input Bayar = Rp.");
         int bayar = input.nextInt();

         System.out.print("Kembalian = Rp.");
         int kembalian =  bayar - harga;

         dataTransaksi.add(new Transaksi(nama_pelanggan,tanggal_masuk,antrian,
                 indexpaket,pegawai,berat_cucian,tanggal_selesai,harga,bayar,kembalian)); 
         System.out.print("");
     }
     void view(){
         for(int i=0;i<dataTransaksi.size();i++){
            System.out.println("==========================================================");
            System.out.println("Transaksi:"+i);
            System.out.println("Nama = "+dataTransaksi.get(i).getNama_pelanggan());
            System.out.println("Tanggal Masuk = "+new SimpleDateFormat("dd-MM-yyyy").format(dataTransaksi.get(i).getTanggal_masuk()));
            System.out.println("Antrian = "+dataTransaksi.get(i).getAntrian());
            System.out.println("Paket Cuci = "+Katalog.layanan[dataTransaksi.get(i).indexpaket]);
            System.out.println("Pegawai yang melayani = "+dataTransaksi.get(i).getPegawai());
            System.out.println("Berat cucian = "+dataTransaksi.get(i).getBerat_cucian()+" Kg");
            System.out.println("Tanggal Selesai = "+new SimpleDateFormat("dd-MM-yyyy").format(dataTransaksi.get(i).getTanggal_selesai()));
            System.out.println("Harga = Rp."+dataTransaksi.get(i).getHarga());
            System.out.println("Bayar = Rp."+dataTransaksi.get(i).getBayar());
            System.out.println("Kembalian = Rp."+dataTransaksi.get(i).getKembalian());
            System.out.println("=========================================================="); 
            System.out.print("");
             }
         
     }
    
     void dataAdmin(){
        String id [] = {"01","02","03"};
        String password [] = {"01","02","03"};
        String nama [] = {"Rama","Dinda","Tiara"};
        for (int i=0; i<id.length;i++){
            adminModel.insertAdmin(new AdminEntity(id[i],password[i],nama[i]));
        }
    }
    
     void loginAdmin(){
        System.out.print("Id : ");
        String id = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cekAdmin = adminModel.cekData(id, password);
        
        System.out.println("Selamat Datang "+adminModel.showDataAdmin(cekAdmin)
                    .getNama());
       
        
    }
    
    
}
