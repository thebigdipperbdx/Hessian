package hessian.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

import hessian.model.User;
import hessian.service.IService;

//Client Implementation
public class HessianClientTest {
	public static void main(String[] args) throws MalformedURLException {
		//�ڷ������˵�web.xml�ļ������õ�HessianServletӳ��ķ���URL��ַ
        String url = "http://localhost:8181/HessianServer/ServiceServlet";
        HessianProxyFactory factory = new HessianProxyFactory();
        IService service = (IService) factory.create(IService.class, url);//����IService�ӿڵ�ʵ������
        User user = service.getUser();//����Hessian�������˵�ServiceImpl���е�getUser��������ȡһ��User����
        System.out.println(user.getName());
		
	}

}
