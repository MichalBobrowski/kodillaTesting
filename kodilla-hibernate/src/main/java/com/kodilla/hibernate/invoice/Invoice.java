package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {
    private int id;
    private String number;
    private List<Item> itemList;

    public Invoice(){

    }

    public Invoice(String number, List<Item> itemList) {
        this.number = number;
        this.itemList = itemList;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "Invoice_Id")
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column (name = "Number")
    public String getNumber() {
        return number;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "JOIN_ITEM_INVOICES",
            joinColumns = {@JoinColumn(name = "Invoice_Id" , referencedColumnName = "Invoice_Id")},
            inverseJoinColumns = {@JoinColumn(name = "Item_Id" , referencedColumnName = "Item_Id")}
    )
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
