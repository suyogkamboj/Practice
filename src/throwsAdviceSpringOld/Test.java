package throwsAdviceSpringOld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("throwsAdviceSpringOld.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		
		Validator v= bf.getBean("proxy", Validator.class);
		
		try {
			v.validate(25);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
