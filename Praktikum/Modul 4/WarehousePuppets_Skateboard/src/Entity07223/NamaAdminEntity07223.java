package Entity07223;

public class NamaAdminEntity07223 {
    private String Admin,Password;
    
    public NamaAdminEntity07223 (String Admin, String Password){
       this.Admin = Admin;
       this.Password = Password;
    }
    
    public NamaAdminEntity07223() {
    }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAdmin() {
        return Admin;
    }

    public String getPassword() {
        return Password;
    }    
}