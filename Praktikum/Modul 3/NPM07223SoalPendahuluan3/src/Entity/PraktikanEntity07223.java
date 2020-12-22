package Entity;

import java.util.Date;
public class PraktikanEntity07223 extends MahasiswaAbstractEntity07223 {
    private String kelas;

    public PraktikanEntity07223(String npm, String password, String nama, String no_telp, Date tglLahir, String kelas) {
        super(npm, password, nama, no_telp, tglLahir);
        this.kelas = kelas;
    }
    @Override
    public String getNpm() {
        return npm;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
