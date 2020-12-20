package modul2_07223;

import Entity.*;
import Model.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Modul2_07223 {

    private static AslabModel07223 aslabModel = new AslabModel07223();
    private static Scanner input = new Scanner(System.in);
    private static PraktikanModel07223 praktikanModel = new PraktikanModel07223();
    private static DaftarprakModel07223 daftarprakModel = new DaftarprakModel07223();
    private static int pilPrak;
    static int cekPraktikan;
    static int cekAslab;

    public static void main(String[] args) {
        // TODO code application logic here
        int loop = 0;
        dataAslab();
        do {
            int pilih = 0;
            System.out.print("Selamat Datang Di Laboratotium Informatika ITATS !!"
                    + "\n 1. Login"
                    + "\n 2. Daftar Praktikan"
                    + "\n 0. Stop"
                    + "\n Masukkan Pilihan Anda : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                int pilLogin = 0;
                System.out.print(" 1. Login Aslab"
                        + "\n 2. Login Praktikan"
                        + "\n Pilih : ");
                pilLogin = input.nextInt();
                if (pilLogin == 1) {
                    loginAdmin();
                } else {
                    login();
                }
            } else if (pilih == 2) {
                register();
            } else if (pilih == 3) {
                aslabModel.view();
            } else {
                break;
            }
        } while (loop != 1);
    }

    static void dataAslab() {
        String npmAslab[] = {"01", "02", "03", "04", "05", "06", "07"};
        String passwordAslab[] = {"01", "02", "03", "04", "05", "06", "07"};
        String namaAslab[] = {"Michael", "Alan", "Odila", "Fitria", "Sita", "Eric", "Fernanda"};
        String notelpAslab[] = {"01", "02", "03", "04", "05", "06", "07"};
        String laboratorium[] = {"RPL", "SO", "BASPROG", "BASPROG", "SO", "RPL", "RPL"};
        String tglLahirAslab[] = {"04/05/2000", "01/12/2000", "03/03/2000", "23/06/2000", "11/07/2000", "13/09/2000", "22/12/2000"};
        for (int i = 0; i < npmAslab.length; i++) {
            aslabModel.insertAslab(new AslabEntity07223(npmAslab[i], passwordAslab[i],
                    namaAslab[i], notelpAslab[i], new Date(tglLahirAslab[i]), laboratorium[i]));
        }
    }

    static void register() {
        System.out.print("Input NPM = ");
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
        praktikanModel.insert(new PraktikanEntity07223(npm, pass, nama, notelp, tanggal, kelas));
    }

    static void login() {
        System.out.print("NPM : ");
        String npm = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cekPraktikan = praktikanModel.cekData(npm, password);
        System.out.println("Selamat Datang " + praktikanModel.getPraktikanEntityArrayList(cekPraktikan).getNama());
        int cekpraktikum = daftarprakModel.cekData(npm, password);
        if (cekpraktikum == -1) {
            System.out.println("Anda Belum Daftar Praktikum ");
            daftarPrak();
        } else if (cekpraktikum == -2) {
            System.out.println("Anda Belum Daftar Praktikum ");
            daftarPrak();
        } else {
            System.out.println("Nama = " + daftarprakModel.showDaftarprak(cekPraktikan).getPraktikan().getNama());
            System.out.println("NPM = " + daftarprakModel.showDaftarprak(cekPraktikan).getPraktikan().getNpm());
            System.out.println("No Telp = " + daftarprakModel.showDaftarprak(cekPraktikan).getPraktikan().getNo_telp());
            System.out.println("Praktikum = " + PraktikumEntity07223.nama[daftarprakModel.showDaftarprak(cekPraktikan).getIndexPrak()]);
            System.out.println("isVerified = " + daftarprakModel.showDaftarprak(cekPraktikan).isVerified());
        }
    }

    static void daftarPrak() {
        System.out.println("Pilih Praktikum = ");
        for (int i = 0; i < PraktikumEntity07223.nama.length; i++) {
            System.out.println(i + ". " + PraktikumEntity07223.nama[i]);
        }
        System.out.print("Pilih Praktikum = ");
        pilPrak = input.nextInt();
        daftarprakModel.insertDataDaftarprak(new DaftarprakEntity07223(pilPrak, praktikanModel.getPraktikanEntityArrayList(cekPraktikan), false));
    }

    static void loginAdmin() {
        System.out.print("NPM : ");
        String npm = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cekAslab = aslabModel.cekData(npm, password);
        System.out.println("Selamat Datang "+aslabModel.showDataAslab(cekAslab).getNama());
        praktikanModel.view();
        updateIsverified();
    }
    static void updateIsverified(){
        System.out.print("NPM Praktikan : ");
        String npm = input.next();
        int index = daftarprakModel.cekData(npm, null);
        daftarprakModel.updateIsVerified(index, new DaftarprakEntity07223(pilPrak,praktikanModel.getPraktikanEntityArrayList(index),true));
    }

}
