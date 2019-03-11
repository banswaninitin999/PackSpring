
import java.util.Date;  
  
public class Answer {  
private int id;  
private String answer;  
private Date postedDate;  
public Answer() {}  
public Answer(int id, String answer) {  
    super();  
    this.id = id;  
    this.answer = answer;  
   
}  
  
public String toString(){  
    return "Id:"+id+" Answer:"+answer;  
}  
}  