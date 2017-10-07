package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
   @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void invoiceWithManyItemsTest (){
        //given
        Product product1 = new Product("Młotek");
        Product product2 = new Product("Lopata");
        Product product3 = new Product("Wkrętarka");
        Item item1 = new Item(product1, new BigDecimal(30), 10);
        Item item2 = new Item(product2, new BigDecimal(150),5);
        Item item3 = new Item(product3, new BigDecimal(120), 2);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Invoice invoice = new Invoice("1/2017", itemList);

        //when
        invoiceDao.save(invoice);

        int invoiceId = invoice.getId();
        int itemNumbers = invoice.getItemList().size();

        //then
        //Assert.assertEquals(0, invoiceId);
        Assert.assertEquals(3, itemNumbers);

        //clean up

            invoiceDao.delete(invoiceId);



    }

}
