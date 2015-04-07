package org.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @author jianghm
 * @date 2015/4/1
 */
public class HelloServiceClient {

    public static void main(String[] args) {
        //调用WebService
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IHelloService.class);
        factory.setAddress("http://localhost:9000/helloWorld");

        IHelloService service = (IHelloService) factory.create();
        System.out.println("[result]" + service.sayHello("hoojo"));
    }
}
