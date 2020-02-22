package ru.yakimov.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */
@Entity
@Table(name = "ITEAMS")
public class Iteam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEAM_ID")
    private int id;

    @Column(name = "ITEAM_NAME")
    private String name;

    @Column(name = "ITEAM_PRICE")
    private int price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "CART",
            joinColumns = @JoinColumn (name = "ITEAM_ID"),
            inverseJoinColumns = @JoinColumn(name = "BUYER_ID")
    )
    private List<Buyer> buyers;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Buyer> buyers) {
        this.buyers = buyers;
    }
}
