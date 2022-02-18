package com.brk.retaile.rewards.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "customer_trans")
public class CustomerTrans {
    @Id
    @GeneratedValue
    private Long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private RewardCustomers customer;

    private int totalpurchasescount;

    public CustomerTrans() {
    }

    public CustomerTrans(Long id, RewardCustomers customer, int totalpurchasescount) {
        this.id = id;
        this.customer = customer;
        this.totalpurchasescount = totalpurchasescount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RewardCustomers getCustomer() {
        return customer;
    }

    public void setCustomer(RewardCustomers customer) {
        this.customer = customer;
    }

    public int getTotalpurchasescount() {
        return totalpurchasescount;
    }

    public void setTotalpurchasescount(int totalpurchasescount) {
        this.totalpurchasescount = totalpurchasescount;
    }

    @Override
    public String toString() {
        return "CustomerTrans{" +
                "id=" + id +
                ", customer=" + customer +
                ", totalpurchasescount=" + totalpurchasescount +
                '}';
    }
}