package Controller07223;

import Entity.DaftarprakEntity07223;
import Entity.PraktikanEntity07223;
import java.util.Date;

public class PraktikanController07223 implements ControllerInteface07223{
    int indexLogin = 0;
    public PraktikanController07223(){
    }

public PraktikanEntity07223 getData(){
    return
    AllObjectModel07223.praktikanModel.getPraktikanEntityArrayList(indexLogin);
    }

public void login(String npm, String password){
    indexLogin = AllObjectModel07223.praktikanModel.cekData(npm,password);
    }

@Override
public void insert(String npm,String password,String nama,String no_telp
,Date tglLahir,String kelas){
    AllObjectModel.praktikanModel.insert(new PraktikanEntity07223(npm,password,nama
    ,no_telp,tglLahir,kelas));
    }

public PraktikanEntity07223 praktikanEntity(){
    return
    AllObjectModel.praktikanModel.getPraktikanEntityArrayList(indexLogin);
    }

public int cekDaftarprak(String npm){
    int cek = AllObjectModel.daftarprakModel.cekData(npm, null);
    return cek;
    }

public DaftarprakEntity07223 showDaftarprak(int index){
    return
    AllObjectModel,daftarprakModel.showDaftarprak(index);
    }
}