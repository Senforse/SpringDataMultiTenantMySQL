package com.zhtangsh.SpringDataMultiTenantMySQL.tenant.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2018/12/11
 */
@Entity
public class Currency {
    @Id
    private long id;
    private String name;
    private String extras;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", extras='" + extras + '\'' +
                '}';
    }
}
