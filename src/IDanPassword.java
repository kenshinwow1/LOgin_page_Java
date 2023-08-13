import java.util.HashMap;

public class IDandPassword {

    HashMap<String,String>logininfo = new HashMap<String,String>();

    IDandPassword(){
        logininfo.put("Bro","pizza");
        logininfo.put("Brometheus","PASSWORD");
        logininfo.put("Brocode","abc123");

    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
