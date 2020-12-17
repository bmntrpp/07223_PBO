/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_07223;

import java.util.Date;
/**
 *
 * @author aldo
 */
public class Peserta_07223 {
    String nama_peserta;
    String nickname_peserta;
    Date tanggal_lahir;
    String email;
    String region;
    String no_hp;
    int indexUCL;
    
    public Peserta_07223(String nama_peserta,String nickname_peserta,Date tanggal_lahir,
                         String email,String region,String no_hp,int indexUCL){
        
        this.nama_peserta=nama_peserta;
        this.nickname_peserta=nickname_peserta;
        this.tanggal_lahir=tanggal_lahir;
        this.email=email;
        this.region=region;
        this.no_hp=no_hp;
        this.indexUCL=indexUCL;
    }
    
    public String getNama_Peserta() {
        return nama_peserta;
    }
    
    public String getNickname_Peserta() {
        return nickname_peserta;
    }
    
    public Date getTanggal_Lahir() {
        return tanggal_lahir;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getRegion() {
        return region;
    }
    
    public String getNo_Hp() {
        return no_hp;
    }
    
    public int getindexUCL() {
        return indexUCL;
    }
}
