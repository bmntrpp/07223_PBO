package aldo07223;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aldo07223_PES2021 {
    static ArrayList <Aldo07223_PesertaEntity> datapeserta = new ArrayList();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Aldo07223_PES2021 program = new Aldo07223_PES2021();
        System.out.println("Selamat Datang Di UEFA Champions League PES 2021 Competition!!");
        int pil;
        int indexdata;
        do{
            System.out.println("1. Daftar");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Hapus");
            System.out.println("4. Edit");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    program.daftar();
                    break;
                case 2:
                    program.view();
                    break;
                case 3:
                    System.out.println("Hapus Data Ke = ");
                    indexdata=input.nextInt();
                    program.remove(indexdata);
                    break;
                case 4:
                    System.out.println("Edit Data Ke = ");
                    indexdata=input.nextInt();
                    program.edit(indexdata);
            }
        }while(pil!=5);
    }
    void daftar(){
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Region = ");
        String region = input.next();
        System.out.print("Input Email = ");
        String email = input.next();
        System.out.print("Input No HP = ");
        String nohp = input.next();
        System.out.print("Input Tgl Lahir (mm/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        for(int i=0;i<Aldo07223_UCLTeamEntity.UCLTeam.length;i++){
            System.out.println(i+". "+Aldo07223_UCLTeamEntity.UCLTeam[i]);
        }
        System.out.print("Pilih Team = ");
        int indexucl = input.nextInt();
        datapeserta.add(new Aldo07223_PesertaEntity(nama,region,email,nohp,tanggal,indexucl));

}
    void view(){
        for(int i=0;i<datapeserta.size();i++)
        {
             System.out.println("Data"+i);
             System.out.println("Nama               = "+datapeserta.get(i).getNama());
             System.out.println("Region             = "+datapeserta.get(i).getRegion());
             System.out.println("E-Mail             = "+datapeserta.get(i).getEmail());
             System.out.println("No Telp            = "+datapeserta.get(i).getNoHp());
             System.out.println("Tanggal Lahir      = "+new SimpleDateFormat("mm-dd-yyyy").
                                                        format(datapeserta.get(i).getDate()));
             System.out.println("Team               = "+Aldo07223_UCLTeamEntity.
                                                        UCLTeam[datapeserta.get(i).indexucl]);
             System.out.println(" ");
        }
}
    void remove(int indexdata){
        datapeserta.remove(indexdata);
        System.out.println("Data Berhasil Dihapus");
}
    void edit(int indexdata){
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Region = ");
        String region = input.next();
        System.out.print("Input Email = ");
        String email = input.next();
        System.out.print("Input No HP = ");
        String nohp = input.next();
        System.out.print("Input Tgl Lahir (mm/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        for(int i=0;i<Aldo07223_UCLTeamEntity.UCLTeam.length;i++){
            System.out.println(i+". "+Aldo07223_UCLTeamEntity.UCLTeam[i]);
        }
        System.out.print("Pilih Team = ");
        int indexucl = input.nextInt();
        Aldo07223_PesertaEntity update = new Aldo07223_PesertaEntity(nama,region,email,nohp,
                                                tanggal,indexucl); //jika data banyak
                datapeserta.set(indexdata,update);//new Aldo07223_PesertaEntity(nama,region,email,nohp,tanggal,indexucl)); Dibuat Data jika sedikit
    }
}