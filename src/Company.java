package job.finder;

import java.util.ArrayList;

public class Company {
    
    private String c_name;
    private int num_of_emp;
    
    private ArrayList<JobPoster> poster;
    private ArrayList<JobVanancy> vacances;
    private ArrayList<Review> reviews;
    private CompanyAdmin admin;

    public Company() {
    }

    public Company(String c_name, int num_of_emp, ArrayList<JobPoster> poster, ArrayList<JobVanancy> vacances, ArrayList<Review> reviews, CompanyAdmin admin) {
        this.c_name = c_name;
        this.num_of_emp = num_of_emp;
        this.poster = poster;
        this.vacances = vacances;
        this.reviews = reviews;
        this.admin = admin;
    }

    public Company(String c_name, int num_of_emp, CompanyAdmin admin) {
        this.c_name = c_name;
        this.num_of_emp = num_of_emp;
        this.admin = admin;
    }
    
    public String getName() {
        return c_name;
    }

    public void setName(String c_name) {
        this.c_name = c_name;
    }
    

    public int getNum_of_emp() {
        return num_of_emp;
    }

    public void setNum_of_emp(int num_of_emp) {
        this.num_of_emp = num_of_emp;
    }

    public JobPoster getPoster(int i) {
        return poster.get(i);
    }

    public void displayJobPoster() {
        if (poster.size() > 0) {
            for (int i = 0; i < poster.size(); i++)
            {
                poster.get(i);
                System.out.print(poster.get(i));
            }
        }
        else{
            System.out.println("there's no Job Posters in the Company");
        }
    }

    public void addPoster(JobPoster poster) {
        this.poster.add(poster);
    }

    public void displayReviews() {
            System.out.println("Company: " + Company.this.c_name);
        if (reviews.size() > 0) {
            for (int i = 0; i < reviews.size(); i++)
            {
                reviews.get(i);
                System.out.println(reviews.get(i).toString(i+1));
            }
        } else {
            System.out.println("there's no Reviews");
        }
    }

    public void addReviews(Review reviews) {
        this.reviews.add(reviews);
        System.out.println("The review has been added sucessfully");
    }

    public CompanyAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(CompanyAdmin admin) {
        this.admin = admin;
    }

    public ArrayList<JobVanancy> getVacances() {
        return vacances;
    }

    public void setVacances(ArrayList<JobVanancy> vacances) {
        this.vacances = vacances;
    }
    
    public void addVacance (JobVanancy vacance){
        vacances.add(vacance);
    }
    
    public void display_jobs()
    {
        System.out.println("Company: " + c_name);
            if (vacances.size() >0){
            for ( int i = 0 ; i< vacances.size() ; i++){
               System.out.println("job #"+ (i+1) );
               System.out.println( "The jobs Title is: " + vacances.get(i).getNameOfJob() );
               System.out.println( "The job Description is: " + vacances.get(i).getDescription() );
            }
            }else {
                System.out.println("There is no opening jobs in this company");
            }
    }
    
    public boolean Apply_job (String jobName , JobSeeker seeker, String name, String address, String certifcate){
            for ( int i = 0 ; i < vacances.size() ; i++){
                if (vacances.get(i).getNameOfJob().equals(jobName)){
                    JobApp jobapp = new JobApp(name,address,certifcate,seeker);
                    vacances.get(i).addJobapp(jobapp);
                    
                    System.out.println("Your Application has been sent sucessfully");
                    return true;
                }
            }
            return false;
        }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public ArrayList<JobPoster> getPoster() {
        return poster;
    }

    public void setPoster(ArrayList<JobPoster> poster) {
        this.poster = poster;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
}