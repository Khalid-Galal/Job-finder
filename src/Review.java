
package job.finder;

public class Review {
   private String Sender;
   private String Message;
    private int Rating; // out of 5 
    
    Review (String Sender , String Message , int Rating){
        this.Sender = Sender; 
        this.Message = Message;
        this.Rating = Rating;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

 

    public String getSender() {
        return Sender;
    }

    public void setSender(String Sender) {
        this.Sender = Sender;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public String toString(int i) {
        return "Review #"+ i +"{"  + "Sender is: " + Sender + ", Message: " + Message + ", Rating: " + Rating + '}';
    }
    
    
}
