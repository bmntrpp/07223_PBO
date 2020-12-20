package Entity;

import java.util.Date;
public abstract class MahasiswaAbstractEntity07223 {
    protected String npm, password, nama, no_telp;
    protected Date tgllahir;

    public MahasiswaAbstractEntity07223(String npm, String password, String nama, String no_telp, Date tgllahir) {
        this.npm = npm;
        this.password = password;
        this.nama = nama;
        this.no_telp = no_telp;
        this.tgllahir = tgllahir;
    }
    
    public MahasiswaAbstractEntity07223(){
        
    }
    
    public abstract String getNpm();

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public Date getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(Date tgllahir) {
        this.tgllahir = tgllahir;
    }
}
