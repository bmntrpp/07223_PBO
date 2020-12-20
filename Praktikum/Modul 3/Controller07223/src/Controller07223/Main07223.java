package Controller07223;

import Entity.PraktikumEntity07223;
import Controller.AdminController07223;
import Controller.AllObjectModel07223;
import Controller.PraktikanController07223;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main07223 {
    
    private static AdminController07223 admin = new AdminController07223();
    private static Scanner input = new Scanner(System.in);
    private static PraktikanController07223 praktikan = new PraktikanController07223();

    public static void main(String[] args) {
        int loop=o;
        admin.dataAslab();
        do{
            int pilih = 0;
            System.out.print("Selamat Datang Di Laboratorium Informatika ITATS !!"+
                                "\n 1.  Login"+
                                "\n 2.  Daftar Praktikan"+
                                "\n 0.  Stop"+
                                "\n Masukan Pilihan Anda : ");
            pilih = input.nextInt();
            if(pilih==1){
                int pilLogin =  0;
                System.out.print("1. Login Aslab"+"\n2. Login Praktikan"+"\nPilih : ");
                pilLogin = input.nextInt();
            if(pilLogin == 1){
                loginAslab();
            }else{
                    loginPraktikan();
            }else if(pilih == 2){
                    registerPraktikan();
            }else if(pilih == 3){
                    admin.viewAslab();
            }else if(pilih == 4){
            }else{
                    break;
            }
            }while (loop!=1);
        }
    }

}
