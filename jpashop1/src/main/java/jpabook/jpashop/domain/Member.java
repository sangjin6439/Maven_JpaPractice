package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member") //mappedBy는 연관관계의 주인을 나타낸다.
    private List<Order> orders = new ArrayList<>(); //관례로 리스트는 초기화 해주는 거임. 양방향 연관관계임 -> 잘못된 코드라고 생각함 맴버를 보고 맴버의 orders를 꺼내는게 아니라 중간에 끊어주는게 설계가 깔끔

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
