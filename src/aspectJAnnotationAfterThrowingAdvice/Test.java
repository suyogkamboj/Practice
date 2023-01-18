package aspectJAnnotationAfterThrowingAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("aspectJAnnotationAfterThrowingAdvice.xml");  
        Operation op = (Operation) context.getBean("op");  
        System.out.println("calling validate...");  
        try{  
            op.validate(19);  
        }catch(Exception e){System.out.println(e);}  
        System.out.println("calling validate again...");  
          
        try{  
            op.validate(11);  
        }catch(Exception e){System.out.println(e);} 

	}

}
