package com.cyl.springboothibernate.entity;

import javax.naming.Name;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "coser")
public class Coser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "cname")
    private String cname;
    @Column(name = "cstr")
    private String cstr;
    @ManyToOne(targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "uid",nullable = false,referencedColumnName = "id")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCstr() {
        return cstr;
    }

    public void setCstr(String cstr) {
        this.cstr = cstr;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Coser{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", cstr='" + cstr + '\'' +
                '}';
    }
}
