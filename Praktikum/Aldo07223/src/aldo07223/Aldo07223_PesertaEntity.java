package aldo07223;
import java.util.Date;
public class Aldo07223_PesertaEntity {
    String nama,region,email,nohp;
    Date TanggalLahir;
    int indexucl;
    int indexpes;

public Aldo07223_PesertaEntity(String nama,String region,
String email,String nohp,Date tanggallahir,int indexucl){
        this.nama=nama;
        this.region=region;
        this.email=email;
        this.nohp=nohp;
        this.TanggalLahir=tanggallahir;
        this.indexucl=indexucl;
}
    String getNama(){
        return this.nama;
    }
    String getRegion(){
        return this.region;
    }
    String getEmail(){
        return this.email;
    }
    String getNoHp(){
        return this.nohp;
    }
    Date getDate(){
        return this.TanggalLahir;
    }
    int getIndexUCL(){
        return indexucl;
    }
}