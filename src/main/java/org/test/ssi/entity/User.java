package org.test.ssi.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author jianghm
 * @date 2015/3/20
 */
@XmlRootElement(name = "UserInfo")
public class User implements Serializable {

    private static final long serialVersionUID = 1167180881784796418L;

    private int id;
    private String name;
    private String email;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.id + "#" + this.name + "#" + this.email + "#" + this.address;
    }
}
