package org.test;

import javax.xml.ws.Endpoint;

/**
 * @author jianghm
 * @date 2015/4/1
 */
public class DeployHelloService {

    /**
     * <b>function:</b>发布WebService
     * @author hoojo
     */
    public static void deployService() {
        System.out.println("Server start ……");
        HelloService service = new HelloService();
        String address = "http://127.0.0.1:9000/helloWorld";
        Endpoint.publish(address, service);
    }

    public static void main(String[] args) throws InterruptedException {
        //发布WebService
        deployService();
        System.out.println("server ready ……");
        Thread.sleep(1000 * 60);
        System.out.println("server exiting");
        //休眠60秒后就退出
        System.exit(0);
    }
}
