package com.test.persist.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: BaseModel
 * @anthor: shi_lin
 * @CreateTime: 2016-01-12
 */
@MappedSuperclass
public class BaseModel implements Serializable {
    private static final long serialVersionUID = 2820473684086191843L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "create_time")
    private Date create_time;

    @Column(name = "updateTime")
    private Date update_time;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
