package com.brk.retaile.rewards.service;

import com.brk.retaile.rewards.model.RewardCustomers;
import com.brk.retaile.rewards.model.RewardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerRewardService {

    @Autowired
    private RewardsRepository rewardsRepository;

    public List<RewardCustomers> getAllCustomers(){
            return rewardsRepository.findAll();
    }

    public RewardCustomers getCustomerbyId(Integer CustomerId){
        return rewardsRepository.findById(CustomerId).orElse(null);
    }

}
