package Controller07223;

import Entity.AsslabEntity07223;
import Entity.DaftarprakEntity07223;
import Entity.PraktikanEntity07223;
import java.util.ArrayList;
import java.util.Date;

public class AdminController07223 implements ControllerInterfaces07223{
    int indexLogin = 0;

    public AdminController07223(){
    }

    public void dataAslab(){
        String npmAslab[]       = {"01", "02", "03", "04", "05", "06", "07"};
        String passwordAslab[]  = {"01", "02", "03", "04", "05", "06", "07"};
        String namaAslab[]      = {"Michael", "Alan", "Odila", "Fitria", "Sita"
                                     , "Eric", "Fernanda"};
        String notelpAslab[]    = {"01", "02", "03", "04", "05", "06", "07"};
        String tglLahirAslab[]  = {"04/05/2000", "01/12/2000", "03/03/2000", "23/06/2000"
                                    , "11/07/2000", "13/09/2000", "22/12/2000"};
        String laboratorium[]   = {"RPL", "SO", "BASPROG", "BASPROG", "SO", "RPL", "RPL"};
        for (int i = 0; i < npmAslab.length; i++){
            AllObjectModel07223.aslabModel.insertAslab(new AslabEntity07223(npmAslab[i],
            passwordAslab[i],namaAslab[i],telpAslab[i],new Date(tglLahirAslab[i]),
            laboratorium[i]));
        }
    }

    public void viewAslab(){
        AllObjectModel07223.aslabModel.view();
    }

    public void listPendaftarPraktikum(){
        AllObjectModel07223.daftarprakModel.view();
    }

@Override
    public void login(String npm, String password){
        indexlogin = AllObjectModel07223.cekData(npm,password);
    }

    public void updateIsVerified(int index,int indexPrak
        ,PraktikanEntity07223 praktikanEntity){
            AllObjectModel07223.daftarprakModel.updateIsVerified(index
            ,new DaftarprakEntity07223(indexPrak,praktikanEntity,true));
    }

    public ArrayList<DaftarprakEntity07223>cekdaftarprakModel(){
        return
        AllObjectModel07223.daftarprakModel.getDaftarprakArrayList();
    }
}
