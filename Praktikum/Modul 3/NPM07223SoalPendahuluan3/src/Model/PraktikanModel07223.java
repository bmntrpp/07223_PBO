package Model;

import Entity.PraktikanEntity07223;
import java.util.ArrayList;
public class PraktikanModel07223 implements ModelInterfaces07223 {
    private ArrayList<PraktikanEntity07223> praktikanEntityArrayList = new ArrayList();
    
    public void PraktikanModel() {
        praktikanEntityArrayList = new ArrayList<PraktikanEntity07223>();
    }
    
    public void insert(PraktikanEntity07223 praktikanEntity) {
        praktikanEntityArrayList.add(praktikanEntity);
    }
    
    @Override
    public void view() {
        for(PraktikanEntity07223 praktikanEntity : praktikanEntityArrayList) {
            System.out.println("===========================================");
            System.out.println("NPM : "+praktikanEntity.getNpm()+"\nNama : "+praktikanEntity.getNama()+"\nPassword : "+praktikanEntity.getPassword()+"\nNo. Telp : "+praktikanEntity.getNo_telp()+"\nTanggal Lahir : "+praktikanEntity.getTglLahir());
            System.out.println("===========================================");
        }
    }
    
    public int cekData(String npm, String password) {
        int loop = 0;
        while(!praktikanEntityArrayList.get(loop).getNpm().equals(npm) && !praktikanEntityArrayList.get(loop).getPassword().equals(password)) {
            loop++;
        }
        return loop;
    }
    
    public PraktikanEntity07223 getPraktikanEntityArrayList(int index) {
        return praktikanEntityArrayList.get(index);
    }
}
