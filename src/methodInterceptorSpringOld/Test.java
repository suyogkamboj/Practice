package methodInterceptorSpringOld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("methodInterceptorSpringOld.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		
		A a =(A) bf.getBean("proxy", A.class);
		a.logic();

	}

}
