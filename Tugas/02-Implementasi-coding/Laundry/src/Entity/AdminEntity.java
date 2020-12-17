package Entity;

import java.util.Date;

public class AdminEntity extends UserAbstractEntity{
    public AdminEntity(String id, String password, String nama){
        super(id,password,nama);
    }
    
   
 @Override
    public String getId() {
        return id;
    }
    
    
}
