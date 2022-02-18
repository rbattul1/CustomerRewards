package com.brk.retaile.rewards.service;

import com.brk.retaile.rewards.model.CustomerTrans;
import com.brk.retaile.rewards.model.RewardCustomers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class mockdata {

    private static List<CustomerTrans> transactions = new ArrayList<CustomerTrans>();
    private static long index;

    static {

        transactions.add( new CustomerTrans(index++, new RewardCustomers(1L, "Anil", 200.0,  new Date()) ,10));
        transactions.add( new CustomerTrans(index++, new RewardCustomers(2L, "Sunil", 150.0,  new Date()),1 ));
        transactions.add( new CustomerTrans(index++, new RewardCustomers(3L, "Prince", 10.0, new Date()),2 ));
        transactions.add( new CustomerTrans(index++, new RewardCustomers(4L, "Rahul", 150.0, new Date()),3 ));

    }


    public List<CustomerTrans> getAll() {
        return transactions;
    }
}
