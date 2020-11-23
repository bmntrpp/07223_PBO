package Entity_07223;

import java.util.Date;
public abstract class Aldo07223_PlayerAbstractEntity {
    protected String id,password,nama,region,email,noHp;
    protected Date tglLahir;

public Aldo07223_PlayerAbstractEntity(String id,String password,String nama,String region,String email,String noHp,Date tglLahir){
        this.id=id;
        this.password=password;
        this.nama=nama;
        this.region=region;
        this.email=email;
        this.noHp=noHp;
        this.tglLahir=tglLahir;
}

public Aldo07223_PlayerAbstractEntity(){

}

    public abstract String getID();

    public void setID(String id) {
        this.id=id;
    }
    
    public abstract String getPassword();

    public void setPassword(String password) {
        this.password=password;
    }

    public abstract String getNama();

    public void setNama(String nama) {
        this.nama=nama;
    }
    
    public abstract String getRegion();

    public void setRegion(String region) {
        this.region=region;
    }
    
    public abstract String getEmail();

    public void setEmail(String email) {
        this.email=email;
    }
    
    public abstract String getNoHp();

    public void setNoHp(String noHp) {
        this.noHp=noHp;
    }
    
    public Date getTanggalLahir() {
        return tglLahir;
    }

    public void setTanggalLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
}