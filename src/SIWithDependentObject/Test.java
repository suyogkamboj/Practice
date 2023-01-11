package SIWithDependentObject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("appContxtDependentObject.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Employee e=(Employee)factory.getBean("emp");  
	    e.displayInfo();

	}

}
