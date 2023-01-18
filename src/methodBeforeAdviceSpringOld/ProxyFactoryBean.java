package methodBeforeAdviceSpringOld;

import java.util.List;
//no need to create this class spring framework will provide this
public class ProxyFactoryBean {
	private Object target;
	private List interceptorNames;
	
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public List getInterceptorNames() {
		return interceptorNames;
	}
	public void setInterceptorNames(List interceptorNames) {
		this.interceptorNames = interceptorNames;
	}
}
