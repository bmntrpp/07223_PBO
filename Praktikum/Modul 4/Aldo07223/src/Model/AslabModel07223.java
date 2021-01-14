package Model;

import Entity.AslabEntity07223;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AslabModel07223 implements ModelInterfaces07223 {

    private ArrayList<AslabEntity07223> aslabEntity07223ArrayList;

    public AslabModel07223() {
        aslabEntity07223ArrayList = new ArrayList<AslabEntity07223>();
    }

    public void insertAslab(AslabEntity07223 aslab) {
        aslabEntity07223ArrayList.add(aslab);
    }

    @Override
    public void view() {
        for (AslabEntity07223 aslabEntity07223 : aslabEntity07223ArrayList) {
            System.out.print(aslabEntity07223.getNpm());
            System.out.print(aslabEntity07223.getNama());
            System.out.print(aslabEntity07223.getPassword());
            System.out.print(aslabEntity07223.getNo_telp());
            System.out.print(new SimpleDateFormat("dd-mm-yyyy").format(aslabEntity07223.getTgllahir()));
            System.out.println();

        }
    }

    //@Override
    public int cekData(String npm, String password) {
        int loop = 0;
        for (AslabEntity07223 aslabEntity07223 : aslabEntity07223ArrayList) {
            if (aslabEntity07223.getNpm().equals(npm) && aslabEntity07223.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public AslabEntity07223 showDataAslab(int index){
        return aslabEntity07223ArrayList.get(index);
    }
}
