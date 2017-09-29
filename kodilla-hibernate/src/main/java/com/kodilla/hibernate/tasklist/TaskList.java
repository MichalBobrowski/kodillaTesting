package com.kodilla.hibernate.tasklist;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLIST")
public class TaskList {

    private int id;
    private String listName;
    private String desricption;

    public TaskList (){

    }

    public TaskList(String listName, String desricption) {
        this.listName = listName;
        this.desricption = desricption;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name ="ID")
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Column(name ="LISTNAME")
    public String getListName() {
        return listName;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    @Column(name ="DURATION")
    public String getDesricption() {
        return desricption;
    }

    private void setDesricption(String desricption) {
        this.desricption = desricption;
    }
}
