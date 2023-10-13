package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name ="ORDERS") //이름을 order로 했을때 오류가 날수도 있다.
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name="MEMBER_ID")
    private Long memberid;
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderState state;

}
