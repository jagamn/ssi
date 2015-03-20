package org.test.ssi.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

/**
 * @author jianghm
 * @date 2015/3/20
 */
@XmlRootElement
public class MapBean {

    private Map<String, User> map;

    //@XmlElement(type = User.class)
    public Map<String, User> getMap() {
        return map;
    }
    public void setMap(Map<String, User> map) {
        this.map = map;
    }
}
