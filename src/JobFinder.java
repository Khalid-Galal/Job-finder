package job.finder;

import java.util.ArrayList;
import java.util.Scanner;
public class JobFinder {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<JobSeeker> seekers = new ArrayList();
        
        JobSeeker s1 = new JobSeeker("Ibrahim", "ibrahim@gmail.com", "0000");
        seekers.add(s1);
        JobSeeker s2 = new JobSeeker("Hossam", "hossam@gmail.com", "0000");
        seekers.add(s2);
        JobSeeker s3 = new JobSeeker("Hazm", "hazm@gmail.com", "0000");
        seekers.add(s3);
        JobSeeker s4 = new JobSeeker("Amr", "amr@gmail.com", "0000");
        seekers.add(s4);
        JobSeeker s5 = new JobSeeker("Sameh", "sameh@gmail.com", "0000");
        seekers.add(s5);
        JobSeeker s6 = new JobSeeker("Saad", "saad@gmail.com", "0000");
        seekers.add(s6);
        
        ArrayList<Company> companies = new ArrayList();
        
        ArrayList<JobPoster> p1 = new ArrayList();  
        JobPoster jp1 = new JobPoster("Yasmeen", "yasmeen@gmail.com", "0000");
        p1.add(jp1);
        ArrayList<JobVanancy> v1 = new ArrayList();
        ArrayList<JobApp> ja1 = new ArrayList();
        JobApp app1 = new JobApp("Ibrahim","any","any",s1);
        ja1.add(app1);
        JobVanancy jv1 = new JobVanancy("Designer", "Required a Designer to design the required resources", 2400, ja1);
        v1.add(jv1);
        ArrayList<Review> r1 = new ArrayList();
        CompanyAdmin a1 = new CompanyAdmin("Ahmed", "ahmed@gmail.com", "0000");
        Company c1 = new Company("Google", 9, p1, v1, r1, a1);
        companies.add(c1);
        
        ArrayList<JobPoster> p2 = new ArrayList();     
        JobPoster jp2 = new JobPoster("Safaa", "safaa@gmail.com", "0000");
        p2.add(jp2);   
        ArrayList<JobVanancy> v2 = new ArrayList();
        ArrayList<JobApp> ja2 = new ArrayList();
        JobApp app2 = new JobApp("Hossam","any","any",s2);
        ja2.add(app2);
        JobVanancy jv2 = new JobVanancy("Manager", "Require an Expert Manager to manage on of the department", 4500, ja2);
        v2.add(jv2);
        ArrayList<Review> r2 = new ArrayList();
        CompanyAdmin a2 = new CompanyAdmin("Ali", "ali@gmail.com", "0000");
        Company c2 = new Company("Facebook", 21, p2, v2, r2, a2);
        companies.add(c2);
        
        ArrayList<JobPoster> p3 = new ArrayList();   
        JobPoster jp3 = new JobPoster("Doha", "doha@gmail.com", "0000");
        p3.add(jp3);     
        ArrayList<JobVanancy> v3 = new ArrayList();
        ArrayList<JobApp> ja3 = new ArrayList();
        JobApp app3 = new JobApp("Hazm","any","any",s3);
        ja3.add(app3);
        JobVanancy jv3 = new JobVanancy("Web Developer", "Require a junior web devoloper to work on the back end of our website", 3600, ja3);
        v3.add(jv3);
        ArrayList<Review> r3 = new ArrayList();
        CompanyAdmin a3 = new CompanyAdmin("Khalid", "khalid@gmail.com", "0000");
        Company c3 = new Company("Microsoft", 14, p3, v3, r3, a3);
        companies.add(c3);
        
        ArrayList<JobPoster> p4 = new ArrayList();  
        JobPoster jp4 = new JobPoster("Asmaa", "asmaa@gmail.com", "0000");
        p4.add(jp4);      
        ArrayList<JobVanancy> v4 = new ArrayList();
        ArrayList<JobApp> ja4 = new ArrayList();
        JobApp app4 = new JobApp("Amr","any","any",s4);
        ja4.add(app4);
        JobVanancy jv4 = new JobVanancy("Software Tester", "Require an Expert Software tester to test our software", 4700, ja4);
        v4.add(jv4);
        ArrayList<Review> r4 = new ArrayList();
        CompanyAdmin a4 = new CompanyAdmin("Hussen", "hussen@gmail.com", "0000");
        Company c4 = new Company("Apple", 17, p4, v4, r4, a4);
        companies.add(c4);
        
        ArrayList<JobPoster> p5 = new ArrayList();      
        JobPoster jp5 = new JobPoster("Nour", "nour@gmail.com", "0000");
        p5.add(jp5);  
        ArrayList<JobVanancy> v5 = new ArrayList();
        ArrayList<JobApp> ja5 = new ArrayList();
        JobApp app5 = new JobApp("Sameh","any","any",s5);
        ja5.add(app5);
        JobVanancy jv5 = new JobVanancy("Hardware Developer", "Require an Expert Hardware Developer in our Hardware department", 7300, ja5);
        v5.add(jv5);
        ArrayList<Review> r5 = new ArrayList();
        CompanyAdmin a5 = new CompanyAdmin("Omar", "omar@gmail.com", "0000");
        Company c5 = new Company("Dell", 18, p5, v5, r5, a5);
        companies.add(c5);
        System.out.println("Welcome to The Job Finder System");
        while(true){
        
        System.out.println("Login as: \n 1- Company Admin \n 2- Job Poster \n 3- Job Seeker");
         
        int Login_Option , User_Option , Change_Option , num_of_emp , salary = 0;
        String name , email , password , description ; 
        
        Scanner input = new Scanner(System.in);
        Scanner input_line = new Scanner (System.in).useDelimiter("\n");
        Login_Option = input.nextInt();
         
        switch (Login_Option) {
            case 1:
                while (true){
                    
                    System.out.print("Enter your Email:"); email=input.next();
                    System.out.print("Enter your Password:"); password=input.next();
                    if (CompanyAdmin.isValid(email, password, companies)){
                        
                        System.out.println("1- Add Job Poster \n2- Change the Company info");
                        User_Option = input.nextInt();
                        
                        if (User_Option == 1){
                            System.out.print("Enter his name: "); name=input.next();
                            System.out.print("Enter his email: "); email=input.next();
                            System.out.print("Enter his password: "); password=input.next();
                            CompanyAdmin.addJobPoster(name, email,  password, companies);
                            break;
                        }else if (User_Option == 2){
                            System.out.print("1- Change the Company Name \n2- Change the Number of Employees \n3- Change Both\n");
                            Change_Option = input.nextInt();
                            if (Change_Option == 1){
                                System.out.print("Etner The new Company Name: "); name = input.next();
                                CompanyAdmin.changeCompanyInfo(name, companies);
                                break;
                            }
                            if (Change_Option == 2){
                                System.out.print("Etner The new Number of Employees: "); num_of_emp = input.nextInt();
                                CompanyAdmin.changeCompanyInfo(num_of_emp, companies);
                                break;
                            }
                            if (Change_Option == 3){
                                System.out.print("Etner The new Company Name: "); name = input.next();
                                System.out.print("Etner The new Number of Employees: "); num_of_emp = input.nextInt();
                                CompanyAdmin.changeCompanyInfo(name, num_of_emp, companies);
                                break;
                            }
                        }
                        
                    }else {
                        System.out.println("Please Enter Valid email and password");
                    }
                }   break;
            case 2:
                while (true){
                    
                    System.out.print("Enter your Email:"); email=input.next();
                    System.out.print("Enter your Password:"); password=input.next();
                    
                    if (JobPoster.isValid(email, password, companies)){
                        
                        System.out.println("1- Add Job Vacancy  \n2- view Applications");
                        User_Option = input.nextInt();
                        if (User_Option == 1){
                            System.out.print("Enter The Job Name: "); name=input_line.next();
                            System.out.print("Enter The Job Desription: "); description = input_line.next();
                            try{
                            System.out.print("Enter The Salary: "); salary = input.nextInt();
                            }catch(Exception e){
                                 System.out.print("Please Enter Valid Rating "); 
                            }
                            JobPoster.AddJobVacancy(name, description, salary, companies);
                            
                            break;
                        }else if (User_Option == 2){
                            
                            JobPoster.Process_Applications(companies);
                            break;
                        }
                        
                    }else {
                        System.out.println("Please Enter Valid email and password");
                    }
                    
                }   break;
            case 3:
                while (true){
                    
                    System.out.print("Enter your Email:"); email=input.next();
                    System.out.print("Enter your Password:"); password=input.next();
                    if (JobSeeker.isValid(email, password, seekers)){
                        
                        System.out.println("1- View The Companies and Reviews \n2- View And Apply to jobs");
                        User_Option = input.nextInt();
                        
                        if (User_Option == 1) {
                            companies.forEach((x) -> {
                                x.displayReviews();
                            });
                            
                            System.out.println("Do you want to add Review? 1- Yes 2- No");
                            User_Option = input.nextInt();
                            
                            if (User_Option == 1){
                                String Company_name, Message;
                                int Rating = 0;
                                System.out.print("Enter your name: "); name= input.next();
                                System.out.print("Enter Company name: "); Company_name= input.next();
                                System.out.print("Enter your Review : "); Message = input_line.next();
                                try {
                                System.out.print("Enter your Rating: "); Rating = input.nextInt();
                                }catch (Exception e){
                                    System.out.print("Please Enter Valid Rating "); 
                                }
                                boolean isFound = false;
                                for (Company x: companies){
                                    if(x.getName().equals(Company_name) ){
                                        x.addReviews(new Review(name ,  Message, Rating));
                                        isFound = true;
                                    }
                                }
                                if (!isFound){
                                    System.out.println("This Company dosent exist");
                                }
                                break;
                            }else if (User_Option == 2){
                                break;
                            }
                        }else if(User_Option == 2){
                            String job_name,Name, Address, Certificate;
                            int n_posted_jobs = 0;
                            int n_Rightjobs =0;
                            n_posted_jobs = companies.stream().map((x) -> {
                                x.display_jobs();
                                return x;
                            }).map((x) -> x.getVacances().size()).reduce(n_posted_jobs, Integer::sum);
                            // Process to apply to job
                            if (n_posted_jobs> 0){
                                System.out.print("Enter the Name of the job that you want to apply to: ");
                                job_name = input_line.next();
                                System.out.print("Enter your Name: ");
                                Name = input_line.next();
                                System.out.print("Enter your Address: ");
                                Address = input_line.next();
                                System.out.print("Enter your Certificate: ");
                                Certificate = input_line.next();
                                n_Rightjobs = companies.stream().map((x) -> x.Apply_job(job_name, seekers.get(JobSeeker.logged_idx),Name,Address,Certificate)).filter((Right_job) -> (Right_job)).map((_item) -> 1).reduce(n_Rightjobs, Integer::sum);
                                if (n_Rightjobs == 0){
                                    System.out.println("This job dosent exist");
                                }
                                break;
                            }
                            break;
                        }
                    }else {
                        System.out.println("Please Enter Valid email and password");
                    }
                }   break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Please Choose a Valid Option");
                break;
        }
    }
}
}
