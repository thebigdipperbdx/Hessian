package hessian.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

import hessian.model.User;
import hessian.service.IService;

//Client Implementation
public class HessianClientTest {
	public static void main(String[] args) throws MalformedURLException {
		//在服务器端的web.xml文件中配置的HessianServlet映射的访问URL地址
        String url = "http://localhost:8181/HessianServer/ServiceServlet";
        HessianProxyFactory factory = new HessianProxyFactory();
        IService service = (IService) factory.create(IService.class, url);//创建IService接口的实例对象
        User user = service.getUser();//调用Hessian服务器端的ServiceImpl类中的getUser方法来获取一个User对象
        System.out.println(user.getName());
		
	}

}
