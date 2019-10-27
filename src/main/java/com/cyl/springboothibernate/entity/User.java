package com.cyl.springboothibernate.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "stu")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "pwd")
    private String pwd;
    @OneToMany(targetEntity = Coser.class,cascade = CascadeType.ALL,mappedBy = "user")

    private Set<Coser> cosers = new HashSet<Coser>();

    public Set<Coser> getCosers() {
        return cosers;
    }

    public void setCosers(Set<Coser> cosers) {
        this.cosers = cosers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
