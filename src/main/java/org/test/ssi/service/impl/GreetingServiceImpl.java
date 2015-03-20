package org.test.ssi.service.impl;

import org.test.ssi.service.GreetingService;

import javax.jws.WebService;
import java.util.Calendar;

/**
 * @author jianghm
 * @date 2015/3/20
 */
@WebService(endpointInterface = "org.test.ssi.service.GreetingService")
public class GreetingServiceImpl implements GreetingService {

    public String greeting(String userName){
        return "Hello " + userName + ", currentTime is " + Calendar.getInstance().getTime();
    }
}
