package job.finder;

import java.util.ArrayList;
import java.util.Scanner;
public class JobPoster extends Account{
        
    static int Company_logged_index;
    static int Poster_logged_index;
    
    static ArrayList <String> jobPosted;

    public JobPoster() {
    }

    public JobPoster(String Name, String Email , String Password) {
        super.setName(Name);
        super.setEmail(Email);
        super.setPassword(Password);
    }
    
    public static boolean isValid (String email , String Password , ArrayList <Company> Companies ){
        for(int i = 0 ; i < Companies.size() ; i ++){
            for (int j = 0; j < Companies.get(i).getPoster().size(); j++){
            
                if(Companies.get(i).getPoster(j).getEmail().equals(email) && Companies.get(i).getPoster(j).getPassword().equals(Password)){
                    Poster_logged_index = j;
                    Company_logged_index = i;
                   // System.out.println(Company_logged_index);
                return true;
            }
            
            }
        }
        return false;
    }
    
    public static void AddJobVacancy (String NameOfJob, String Description, int Salary, ArrayList <Company> Companies){
        
             ArrayList<JobApp> jobApp = new ArrayList();
          
        JobVanancy job = new JobVanancy(NameOfJob, Description, Salary ,jobApp );
        Companies.get(Company_logged_index).addVacance(job);
        System.out.println("The job has been added successfuly");
    }
    
    public static JobPoster poster(ArrayList <Company> Companies){
        return Companies.get(Company_logged_index).getPoster(Poster_logged_index);
    }
    
    public static void Process_Applications (ArrayList<Company> Companies){
        int Option;
        int numOfEmp = Companies.get(Company_logged_index).getNum_of_emp();
        
        if (Companies.get(Company_logged_index).getVacances().size()>0){
            for (int i = 0; i < Companies.get(Company_logged_index).getVacances().size(); i++){
                System.out.println("Applications for Job #" + (i+1));
                int count = 1;
                if (Companies.get(Company_logged_index).getVacances().get(i).getJobapp().size() > 0){
                    for (int j = 0; j < Companies.get(Company_logged_index).getVacances().get(i).getJobapp().size(); j++){
                        if (Companies.get(Company_logged_index).getVacances().get(i).getJobapp(j).getApp_state().equals(state.pending)){
                        
                            System.out.println("Applicant number:" + count); count++;
                            System.out.println( "The Applicant name is : " + Companies.get(Company_logged_index).getVacances().get(i).getJobapp(j).getName());
                            System.out.println( "The Applicant Certaficates is : " + Companies.get(Company_logged_index).getVacances().get(i).getJobapp(j).getYourCertaficates());
                            System.out.println("Do you want to Accept this Applicant? 1- yes 2- no");
                            Scanner in = new Scanner(System.in); Option = in.nextInt();
                            switch (Option) {
                                case 1:
                                    Companies.get(Company_logged_index).getVacances().get(i).getJobapp(j).setApp_state(state.Accepted);
                                    Companies.get(Company_logged_index).setNum_of_emp(numOfEmp++);
                                    System.out.println("Applicant has been accepted");
                                    break;
                                case 2:
                                    Companies.get(Company_logged_index).getVacances().get(i).getJobapp(j).setApp_state(state.Rejected);
                                    System.out.println("Applicant has been rejected");
                                    break;
                                default:
                                    System.out.println("Please Choose a Valid Option");
                                    System.out.println("Do you want to Accept this Applicant? 1- yes 2- no");
                                    Scanner input = new Scanner(System.in);
                                    Option = input.nextInt();
                                    if (Option == 1){
                                        Companies.get(Company_logged_index).getVacances().get(i).getJobapp(j).setApp_state(state.Accepted);
                                        Companies.get(Company_logged_index).setNum_of_emp(numOfEmp++);
                                        System.out.println("Applicant has been accepted");
                                    } else if (Option == 2){
                                        Companies.get(Company_logged_index).getVacances().get(i).getJobapp(j).setApp_state(state.Rejected);
                                        System.out.println("Applicant has been rejected");
                                    }   break;
                            }
                        }
                    }
                }else{
                    System.out.println("There is no Applications");
                }
            }
        }else{
                System.out.println("There is no Applications");
            }
    }
}
