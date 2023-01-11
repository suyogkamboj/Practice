package setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("appconxtSetterInjection.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Employee e= (Employee) bf.getBean("si");
		e.display();
	}
}
