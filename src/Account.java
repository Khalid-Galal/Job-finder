
package job.finder;

public abstract class Account {
    
    private String Name, Email, Password;

    public String getName() {
        return Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
