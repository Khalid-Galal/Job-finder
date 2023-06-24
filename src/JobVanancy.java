package job.finder;

import java.util.ArrayList;

public class JobVanancy {
    
    private String NameOfJob, Description;
    private int Salary;
    private ArrayList<JobApp> jobapp ;

    public JobVanancy() {
    }

    public JobVanancy(String NameOfJob, String Description, int Salary) {
        this.NameOfJob = NameOfJob;
        this.Description = Description;
        this.Salary = Salary;
    }

    public JobVanancy(String NameOfJob, String Description, int Salary, ArrayList<JobApp> jobapp) {
        this.NameOfJob = NameOfJob;
        this.Description = Description;
        this.Salary = Salary;
        this.jobapp = jobapp;
    }

    public String getNameOfJob() {
        return NameOfJob;
    }

    public void setNameOfJob(String NameOfJob) {
        this.NameOfJob = NameOfJob;
    }
    
    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    //return a specific application
    public JobApp getJobapp(int i) {
        return jobapp.get(i);
    }
    
    //return the number of the applications applied on the job
    public int numOfApp() {
        return jobapp.size();
    }

    public void addJobapp(JobApp jobapp) {
        this.jobapp.add(jobapp);
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    //return the list
    public ArrayList<JobApp> getJobapp() {
        return jobapp;
    }

    //to insert a list for testing
    public void setJobapp(ArrayList<JobApp> jobapp) {
        this.jobapp = jobapp;
    } 
}
