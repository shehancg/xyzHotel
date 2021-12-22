package com.example.xyzhotel.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserObj {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 20)
    private String fName;

    @Column(nullable = false,length = 20)
    private String lName;

    @Column(nullable = false,unique = true,length = 45)
    private String email;

    @Column(nullable = false,length = 150)
    private String password;

    @Column(nullable = false,length = 40)
    private String city;

    @Column(nullable = false,length = 40)
    private String country;

    @Column(nullable = false,length =20)
    private String phonenum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
}
