package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class Item {
        private int id;
        private Product product;
        private BigDecimal price;
        private int quantity;
        private BigDecimal value;
        private List<Invoice> invoiceList;

        public Item(){

        }

        public Item(Product product, BigDecimal price, int quantity) {
            this.product = product;
            this.price = price;
            this.quantity = quantity;
            this.value = price.multiply(BigDecimal.valueOf(quantity));
        }

        @Id
        @GeneratedValue
        @NotNull
        @Column(name = "Item_Id")
        public int getId() {
            return id;
        }

        private void setId(int id) {
            this.id = id;
        }

        @ManyToOne
        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        @NotNull
        @Column(name = "Price")
        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        @NotNull
        @Column(name = "Quantity")
        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        @Column(name = "Value")
        public BigDecimal getValue() {
            return value;
        }

        private void setValue(BigDecimal value) {
            this.value = value;
        }

        @ManyToMany(cascade =  CascadeType.ALL)
        @JoinTable(
               name = "JOIN_ITEM_INVOICES",
               joinColumns = {@JoinColumn(name = "Item_Id" , referencedColumnName = "Item_Id")},
               inverseJoinColumns = {@JoinColumn(name = "Invoice_Id" , referencedColumnName = "Invoice_Id")}
        )
        public List<Invoice> getInvoice() {
        return invoiceList;
        }

        private void setInvoice(List<Invoice> invoiceList) {
            this.invoiceList = invoiceList;
        }
}
