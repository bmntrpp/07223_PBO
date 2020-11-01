/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aldo Bimantara
 */
package NPM07223soalPendahuluan1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class NPM07223soalPendahuluan1 {
    static ArrayList <AslabEntity> dataAslab = new ArrayList();
    static ArrayList <PraktikanEntity> datapraktikan = new ArrayList();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Selamat Datang di Laboratorium Informatika ITATS!!");
        int pil;
        DataAslab();
        do{
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    daftar();
                    break;
                case 2:
                    System.out.print("NPM = ");
                    String npm = input.next();
                    System.out.print("Password = ");
                    String pass = input.next();
                    view(npm,pass);
                    break;
            }
        }while(pil!=3);
    }
    static void daftar(){
        System.out.print("Input NPM = ");
        String npm = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();
        System.out.print("Input No Telp = ");
        String notelp = input.next();
        System.out.print("Input Tgl Lahir (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Kelas = ");
        String kelas = input.next();
        for(int i=0;i<dataAslab.size();i++){
            System.out.println(i+". "+dataAslab.get(i).nama);
        }
        System.out.print("Pilih Aslab = ");
        int indexaslab = input.nextInt();
        for(int i=0;i<PraktikumEntity.Praktikum.length;i++){
            System.out.println(i+". "+PraktikumEntity.Praktikum[i]);
        }
        System.out.print("Pilih Praktikum = ");
        int indexprak = input.nextInt();
        datapraktikan.add(new PraktikanEntity(npm,nama,pass,notelp,tanggal,indexprak,indexaslab,kelas));
    }
        static void view(String npm,String password){
                for(int i=0;i<datapraktikan.size();i++){
                    if(npm.equals(datapraktikan.get(i).getNpm())&&password.equals(datapraktikan.get(i).getPassword())){
                        System.out.println("NPM             = "+datapraktikan.get(i).getNpm());
                        System.out.println("Nama            = "+datapraktikan.get(i).getNama());
                        System.out.println("Tanggal Lahir   = "+new SimpleDateFormat("dd-mm-yyyy").format(datapraktikan.get(i).getDate()));
                        System.out.println("No Telp         = "+datapraktikan.get(i).getNoTelp());
                        System.out.println("Nama Asisten    = "+dataAslab.get(datapraktikan.get(i).indexaslab).getNama());
                        System.out.println("Praktikum       = "+PraktikumEntity.Praktikum[datapraktikan.get(i).indexpraktikum]);
                }else{System.out.println("nama atau password salah");
                        }
}
    }
static void DataAslab(){
    String npmAslab [] = {"01","02","03","04","05","06","07"};
    String passwordAslab [] = {"01","02","03","04","05","06","07"};
    String namaAslab [] = {"Michael","Fadlan","Odila","Fitria","Sita","Eric","Fernanda"};
    String notelpAslab [] = {"01","02","03","04","05","06","07"};
    String tglLahirAslab [] = {"04/05/2000","01/12/2000","03/03/2000","23/06/2000","11/03/2000","13/09/2000","22/12/2000"};
    for(int i=0;i<npmAslab.length;i++){
        dataAslab.add(new AslabEntity(npmAslab[i],namaAslab[i],passwordAslab[i],notelpAslab[i],new Date(tglLahirAslab[i])));
}
}
}
