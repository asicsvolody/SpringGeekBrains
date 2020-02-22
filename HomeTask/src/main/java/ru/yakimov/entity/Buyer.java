package ru.yakimov.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Entity
@Table(name = "BUYER")
public class Buyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BUYER_ID")
    private int id;

    @Column(name = "BUYER_NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "CART",
            joinColumns = @JoinColumn (name = "BUYER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEAM_ID")
    )
    private List<Iteam> iteams;

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


    public List<Iteam> getIteams() {
        return iteams;
    }

    public void setIteams(List<Iteam> iteams) {
        this.iteams = iteams;
    }
}
