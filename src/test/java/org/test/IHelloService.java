package org.test;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author jianghm
 * @date 2015/4/1
 */
@WebService
public interface IHelloService {
    public String sayHello(@WebParam(name = "name") String name);
}
