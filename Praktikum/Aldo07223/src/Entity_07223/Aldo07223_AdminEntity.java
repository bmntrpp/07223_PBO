package Entity_07223;

import java.util.Date;

public class Aldo07223_AdminEntity extends MahasiswaAbstractEntity07223{
    public Aldo07223_AdminEntity(String id, String password, String nama, String no_telp, Date tglLahir) {
        super(id, password, nama, no_telp, tglLahir);
    }
    
}
 
    @Override
    public String getID() {
        return id;
    }

