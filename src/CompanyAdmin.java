package job.finder;

import java.util.ArrayList;

public class CompanyAdmin extends Account{
    
    static int logged_index;

    public CompanyAdmin(String Name,String Email,String Password){
           super.setName(Name);
           super.setEmail(Email);
           super.setPassword(Password);           
    }
    
    
    public static boolean isValid(String email , String Password , ArrayList <Company> Companies ){
        for(int i = 0 ; i < Companies.size() ; i ++){
            if(Companies.get(i).getAdmin().getEmail().equals(email) && Companies.get(i).getAdmin().getPassword().equals(Password)){
                return true;
            }
            logged_index = i;
        }
        return false;
    }
    
    public  static void addJobPoster(String name , String email , String password , ArrayList <Company> Companies){
            JobPoster poster = new JobPoster(name, email, password);
            Companies.get(logged_index).addPoster(poster);
            
            System.out.println("You Added a Job Poster Successfully.");
    }
       
    public static void changeCompanyInfo(String name ,int num_of_emp, ArrayList <Company> Companies ){
            Companies.get(logged_index).setC_name(name);
            Companies.get(logged_index).setNum_of_emp(num_of_emp);
            System.out.println("The company info has been changed Successfully");
                     
         }
    
    public static void changeCompanyInfo(String name ,ArrayList <Company> Companies ){
            Companies.get(logged_index).setC_name(name);
            System.out.println("The company info has been changed Successfully");
                     
         }
    
    public static void changeCompanyInfo(int num_of_emp, ArrayList <Company> Companies ){
            Companies.get(logged_index).setNum_of_emp(num_of_emp);
            System.out.println("The company info has been changed Successfully");
                     
         }
    
    
}
