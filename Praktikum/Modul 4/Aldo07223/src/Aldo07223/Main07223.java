package Aldo07223;

import Entity.*;
import Controller.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import View.GUI07223;

public class Main07223 {

    private static AdminController07223 admin = new AdminController07223();
    private static Scanner input = new Scanner(System.in);
    private static PraktikanController07223 praktikan = new PraktikanController07223();

    public static void main(String[] args) {
        GUI07223 gui = new GUI07223();
        // TODO code application logic here
//        int loop = 0;
//        admin.dataAslab();
//        do {
//            int pilih = 0;
//            System.out.print("Selamat Datang Di Laboratotium Informatika ITATS !!"
//                    + "\n1. Login"
//                    + "\n2. Daftar Praktikan"
//                    + "\n0. Stop"
//                    + "\nMasukkan Pilihan Anda : ");
//            pilih = input.nextInt();
//            if (pilih == 1) {
//                int pilLogin = 0;
//                System.out.print("1. Login Aslab"
//                        + "\n2. Login Praktikan"
//                        + "\nPilih : ");
//                pilLogin = input.nextInt();
//                if (pilLogin == 1) {
//                    loginAslab();
//                } else {
//                    loginPraktikan();
//                }
//            } else if (pilih == 2) {
//                registerPraktikan();
//            } else if (pilih == 3) {
//                admin.viewAslab();
//            } else {
//                break;
//            }
//        } while (loop != 1);
    }

    static void registerPraktikan() {
        try {
            System.out.print("Masukkan NPM = ");
            String npm = input.next();
            System.out.print("Input Nama = ");
            String nama = input.next();
            System.out.print("Input Password = ");
            String pass = input.next();
            System.out.print("Input No Telp = ");
            String notelp = input.next();
            System.out.print("Input Tanggal Lahir (dd/mm/yyyy) = ");
            Date tanggal = new Date(input.next());
            System.out.print("Kelas = ");
            String kelas = input.next();
            praktikan.insert(npm, pass, nama, notelp, tanggal, kelas);
            System.out.println("Daftar Sukses !!");
        } catch (Exception exception) {
            System.out.println("Format Pengisian Salah !!!");
        }
    }

    static void loginPraktikan() {
        System.out.print("NPM : ");
        String npm = input.next();
        System.out.print("Password : ");
        String password = input.next();
        praktikan.login(npm, password);
        System.out.println("Selamat Datang " + praktikan.praktikanEntity().getNama());
        int cek = praktikan.cekDaftarprak(praktikan.praktikanEntity().getNpm());
        if (cek == -1) {
            System.out.println("Anda Belum Terdaftar Praktikum !!!");
            registerPraktikum();
        } else if (cek == -2) {
            System.out.println("Anda Belum Terdaftar Praktikum !!!");
            registerPraktikum();
        } else {
            System.out.println("===========================================");
            System.out.print("NPM : " + praktikan.showDaftarprak(cek).getPraktikan().getNama()
                    + "\n Password : " + praktikan.showDaftarprak(cek).getPraktikan().getPassword()
                    + "\n No. Telp : " + praktikan.showDaftarprak(cek).getPraktikan().getNo_telp()
                    + "\n Tanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy")
                    .format(praktikan.showDaftarprak(cek).getPraktikan().getTgllahir())
                    + "\n Praktikum : " + PraktikumEntity07223.nama[praktikan.showDaftarprak(cek).getIndexPrak()]
                    + "\n IsVerified : ");
            if (praktikan.showDaftarprak(cek).isVerified() == false) {
                System.out.println("Belum Di Verifikasi Admin");
            } else {
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("Kelas : " + praktikan.showDaftarprak(cek).getPraktikan().getKelas());
            System.out.println("===========================================");
        }
    }

    static void registerPraktikum() {
        System.out.println("Pilih Praktikum : ");
        for (int i = 0; i < PraktikumEntity07223.nama.length; i++) {
            System.out.println((i) + " " + PraktikumEntity07223.nama[i]);
        }
        System.out.print("Pilih Praktikum = ");
        int pilPrak = input.nextInt();
        praktikan.daftarPraktikum(pilPrak, praktikan.getData(), false);
        admin.listPendaftarPraktikum();
    }

    static void viewDaftarprak() {
        admin.listPendaftarPraktikum();
    }

    static void loginAslab() {
        System.out.print("NPM : ");
        String npm = input.next();
        System.out.print("Password : ");
        String password = input.next();
        try {
            admin.login(npm, password);
            System.out.println("Selamat Datang "
                    + admin.aslabEntity().getNama()
                    + " Dari Lab " + admin.aslabEntity().getLaboratorium());
            if (admin.cekdaftarprakModel().size() == 0) {
                System.out.println("Data Masih Kosong");
            } else {
                viewDaftarprak();
                updateIsverified();
            }
        } catch (Exception exception) {
            System.out.println("Npm atau Password salah !!!");
        }
    }

    static void updateIsverified() {
        System.out.print("NPM Praktikan : ");
        String npm = input.next();
        int index = AllObjectModel07223.daftarprakModel.cekData(npm, npm);
        admin.updateIsVerified(index, praktikan.showDaftarprak(index).getIndexPrak(), praktikan.showDaftarprak(index).getPraktikan());
    }

}
