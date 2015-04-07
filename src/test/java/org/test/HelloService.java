package org.test;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author jianghm
 * @date 2015/4/1
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class HelloService {

    public String sayHello(@WebParam(name = "name") String name) {
        return name + " say: Hello World ";
    }
}
