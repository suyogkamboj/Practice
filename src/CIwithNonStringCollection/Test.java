package CIwithNonStringCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("appConxtNonStringCollection.xml");
		BeanFactory f=new XmlBeanFactory(r);
		
		Question q=(Question) f.getBean("q");
		q.displayInfo();
	}
}
