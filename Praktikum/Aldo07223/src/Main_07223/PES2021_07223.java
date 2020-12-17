/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_07223;
import Entity_07223.*;
import Model_07223.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author aldo
 */
public class PES2021_07223 {
    
    static ArrayList<Peserta_07223> dataPeserta = new ArrayList();
    static ArrayList<UCLTeam_07223> dataUCLTeam = new ArrayList();
    private static AdminModel_07223 adminModel = new AdminModel_07223();
    private static Scanner input = new Scanner(System.in);
    
    static int cekAdmin;
    static int pil;
    int indexdat;
    public static void main(String[] args) {
       PES2021_07223 m = new PES2021_07223();
       System.out.println("=============Tournament PES 2021=================");
       System.out.println("=============Silakan Login=================");
       m.dataAdmin();
       m.loginAdmin();
       m.menu();    
    }
    
    void menu(){
      do{
          
          System.out.println("1. Daftar");
            System.out.println("2. Tampilkan Data");           
            System.out.println("3. Keluar");
            pil = input.nextInt();
             switch(pil){
                 case 1:
                    add();
                    break;
                 case 2:
                     view();
                     break;                     
             }
      }while(pil !=3);
    }
    
    void add(){
        System.out.print("input nama peserta = ");
         String nama_peserta = input.next();
         System.out.print("input nickname peserta = ");
         String nickname_peserta = input.next();
         System.out.print("input tgl lahir (dd/mm/yyyy) = ");
         Date tanggal_lahir = new Date(input.next());
         System.out.print("input email = ");
         String email = input.next();
         System.out.print("input region = ");
         String region = input.next();
         System.out.print("input no hp = ");
         String no_hp = input.next();
         System.out.print("input UCL team = ");
         String UCLTeam = input.next();
           for(int i=0;i<UCLTeam_07223.UCLTeam.length;i++){
             System.out.println(i+". "+UCLTeam_07223.UCLTeam[i]);
             
             dataPeserta.add(new Peserta_07223(nama_peserta,nickname_peserta,tanggal_lahir,
                 email,region,no_hp,UCLTeam)); 
         System.out.print("");
         }
    }
    
    void view(){
         for(int i=0;i<dataPeserta.size();i++){
            System.out.println("==========================================================");
            System.out.println("Data Peserta:"+i);
            System.out.println("Nama = "+dataPeserta.get(i).getNama_Peserta());
            System.out.println("Tanggal Lahir = "+new SimpleDateFormat("mm-dd-yyyy").format(dataPeserta.get(i).getTanggal_Lahir()));
            System.out.println("Nickname = "+dataPeserta.get(i).getNickname_Peserta());
            System.out.println("Paket Cuci = "+UCLTeam_07223.UCLTeam[dataPeserta.get(i).indexUCL]);
            System.out.println("E-mail = "+dataPeserta.get(i).getEmail());
            System.out.println("Region = "+dataPeserta.get(i).getRegion());
            System.out.println("No HP = "+dataPeserta.get(i).getNo_Hp());
            System.out.println("=========================================================="); 
            System.out.print("");
             }
    }
         
    void dataAdmin(){
        String id [] = {"01"};
        String password [] = {"01"};
        String nama [] = {"Aldo"};
        for (int i=0; i<id.length;i++){
            adminModel.insertAdmin(new AdminEntity_07223(id[i],password[i],nama[i]));
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
