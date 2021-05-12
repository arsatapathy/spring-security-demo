package com.arsatapathy.spring.security.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "authorities")
public class UserAuthority implements Serializable {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    @JsonBackReference
    private User user;

    @Column(name = "AUTHORITY")
    private String authority;

    public UserAuthority() {
    }

    public UserAuthority(String id, User user, String authority) {
        this.id = id;
        this.user = user;
        this.authority = authority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "UserAuthority{" +
                "id='" + id + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }
}
