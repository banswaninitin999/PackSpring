import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
    
	//Resource resource=new ClassPathResource("ApplicationContext.xml");  
    //BeanFactory factory=new XmlBeanFactory(resource);  
   
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    //Student student=(Student)factory.getBean("studentbean");  
    
    Student student=(Student)context.getBean("studentbean");
    student.displayInfo();  //Display method abc
    
    Employee s=(Employee)context.getBean("employeebean");  
    s.show();  
}  
}  
