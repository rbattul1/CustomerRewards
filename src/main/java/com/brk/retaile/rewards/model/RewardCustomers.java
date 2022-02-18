package com.brk.retaile.rewards.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
public class RewardCustomers  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customername;

    @JsonIgnore
    @OneToMany
    @JoinColumn
    private Set<CustomerTrans> customer;

    @Transient
    private Long rewardpoints;

    @JsonIgnore
    @Transient
    private Double totalPurchases;

    @Temporal(TemporalType.TIMESTAMP)
    private Date TransTimeStamp;


    public RewardCustomers() {
    }

    public RewardCustomers(Long id, String customername, Double totalPurchases, Date transTimeStamp) {
        this.id = id;
        this.customername = customername;
        this.totalPurchases = totalPurchases;
        TransTimeStamp = transTimeStamp;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public Long getRewardpoints() {
        return rewardpoints;
    }

    public void setRewardpoints(Long rewardpoints) {
        this.rewardpoints = rewardpoints;
    }

    public Double getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(Double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    public Date getTransTimeStamp() {
        return TransTimeStamp;
    }

    public void setTransTimeStamp(Date transTimeStamp) {
        TransTimeStamp = transTimeStamp;
    }

    public Set<CustomerTrans> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<CustomerTrans> customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RewardCustomers{" +
                "id=" + id +
                ", customername='" + customername + '\'' +
                ", customer=" + customer +
                ", rewardpoints=" + rewardpoints +
                ", totalPurchases=" + totalPurchases +
                ", TransTimeStamp=" + TransTimeStamp +
                '}';
    }
}
