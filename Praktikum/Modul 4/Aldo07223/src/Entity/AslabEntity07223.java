package Entity;

import java.util.Date;

public class AslabEntity07223 extends MahasiswaAbstractEntity07223 {

    private String laboratorium;

    public AslabEntity07223(String npm, String password, String nama, String no_telp, Date tglLahir, String lab) {
        super(npm, password, nama, no_telp, tglLahir);
        this.laboratorium = lab;
    }

    @Override
    public String getNpm() {
        return npm;
    }

    public String getLaboratorium() {
        return laboratorium;
    }

    public void AslabEntity07223(String laboratorium) {
        this.laboratorium = laboratorium;
    }
}
