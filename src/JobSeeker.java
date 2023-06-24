package job.finder;

import java.util.ArrayList;

public class JobSeeker extends Account{
    
    static int logged_idx;
    
    public JobSeeker (String Name , String Email , String Password){
        super.setEmail(Email);
        super.setPassword(Password);
        super.setName(Name);
    }
  
    public static boolean isValid(String email , String Password , ArrayList <JobSeeker> seekers ){
        for(int i = 0 ; i < seekers.size() ; i ++){
            if(seekers.get(i).getEmail().equals(email) && seekers.get(i).getPassword().equals(Password)){
                logged_idx = i;
                return true;
            }
        }
        return false;
    }
}
