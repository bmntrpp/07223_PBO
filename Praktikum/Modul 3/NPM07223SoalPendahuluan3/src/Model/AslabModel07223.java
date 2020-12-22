package Model;

import Entity.AslabEntity07223;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class AslabModel07223 implements ModelInterfaces07223 {
    private ArrayList<AslabEntity07223> aslabEntityArrayList = new ArrayList();
    
    public void AslabModel() {
        aslabEntityArrayList = new ArrayList<AslabEntity07223>();
    }
    
    public void insertAslab(AslabEntity07223 aslab) {
        aslabEntityArrayList.add(aslab);
    }
    
    @Override
    public void view() {
        for(AslabEntity07223 aslabEntity : aslabEntityArrayList) {
            System.out.println(aslabEntity.getNpm());
            System.out.println(aslabEntity.getNama());
            System.out.println(aslabEntity.getPassword());
            System.out.println(aslabEntity.getNo_telp());
            System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(aslabEntity.getTglLahir()));
        }
    }
    
    public int cekData(String npm, String password) {
        int loop = 0;
        for(AslabEntity07223 aslabEntity : aslabEntityArrayList) {
            if(aslabEntity.getNpm().equals(npm) && aslabEntity.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public AslabEntity07223 showDataAslab(int index) {
        return aslabEntityArrayList.get(index);
    }
}
 