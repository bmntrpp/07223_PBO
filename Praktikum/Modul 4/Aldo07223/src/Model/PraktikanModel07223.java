package Model;

import Entity.AslabEntity07223;
import Entity.PraktikanEntity07223;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PraktikanModel07223 implements ModelInterfaces07223 {

    private ArrayList<PraktikanEntity07223> praktikanEntity07223ArrayList;

    public PraktikanModel07223() {
        praktikanEntity07223ArrayList = new ArrayList<PraktikanEntity07223>();
    }

    public void insert(PraktikanEntity07223 praktikanEntity07223) {
        praktikanEntity07223ArrayList.add(praktikanEntity07223);
    }

    @Override
    public void view() {
        for (PraktikanEntity07223 praktikanEntity07223 : praktikanEntity07223ArrayList) {
            System.out.println("===============================================================");
            System.out.println(" NPM : " + praktikanEntity07223.getNpm()
                    + "\n Nama : " + praktikanEntity07223.getNama()
                    + "\n Password : " + praktikanEntity07223.getPassword()
                    + "\n No Telp : " + praktikanEntity07223.getNo_telp()
                    + "\n Tanggal Lahir : " + praktikanEntity07223.getTgllahir());
            System.out.println("===============================================================");
        }
    }

    //@Override
    public int cekData(String npm, String password) {
        int loop = 0;
        while (!praktikanEntity07223ArrayList.get(loop).getNpm().equals(npm)
                && !praktikanEntity07223ArrayList.get(loop).getPassword().equals(password)) {
            loop++;
        }
        return loop;
    }
    
    public PraktikanEntity07223 getPraktikanEntityArrayList(int index){
        return praktikanEntity07223ArrayList.get(index);
    }
}
