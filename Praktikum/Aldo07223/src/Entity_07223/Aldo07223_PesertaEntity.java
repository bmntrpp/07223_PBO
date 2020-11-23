package Entity_07223;

import java.util.Date;

public class Aldo07223_PesertaEntity extends Aldo07223_PlayerAbstractEntity{
    
    private String kelas;
    
    public Aldo07223_PesertaEntity(String id,String password,String nama, String region, String email, String noHp, Date tglLahir, String kelas) {
        super(id,password,nama,region,email,noHp,tglLahir);
        this.kelas=kelas;
    }
    
    @Override
    public String getID() {
        return id;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}

