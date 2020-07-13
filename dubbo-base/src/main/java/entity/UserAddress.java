package entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

public class UserAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String address;

    public UserAddress() {
    }

    public UserAddress(Integer id, String address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
