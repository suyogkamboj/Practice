package CIwithCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r=new ClassPathResource("appContextCollection.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		Question q=(Question) factory.getBean("collection");
		q.displayInfo();
	}

}
