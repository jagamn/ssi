package org.test.ssi.service;

import javax.jws.WebService;

/**
 * @author jianghm
 * @date 2015/3/20
 */
@WebService
public interface GreetingService {

    public String greeting(String userName);

}
