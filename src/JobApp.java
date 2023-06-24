package job.finder;
/**
 *
 * @author dell
 */
enum state {
    pending,
    Accepted,
    Rejected }

public class JobApp {
    
    private state app_state ;
    private String Name;
    private String Address;
    private String yourCertaficates;
    private JobSeeker seeker; 

    public JobApp() {
    }

    
    public JobApp(String Name, String Address, String yourCertaficates, JobSeeker seeker) {
        this.app_state = app_state.pending;
        this.Name = Name;
        this.Address = Address;
        this.yourCertaficates = yourCertaficates;
        this.seeker = seeker;
    }

    public state getApp_state() {
        return app_state;
    }

    public void setApp_state(state app_state) {
        this.app_state = app_state;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getYourCertaficates() {
        return yourCertaficates;
    }

    public void setYourCertaficates(String yourCertaficates) {
        this.yourCertaficates = yourCertaficates;
    }

    public JobSeeker getSeeker() {
        return seeker;
    }

    public void setSeeker(JobSeeker seeker) {
        this.seeker = seeker;
    }
    
    public void displayApp(){
        System.out.println(Name);
        System.out.println(Address);
        System.out.println(yourCertaficates);
    }
}
