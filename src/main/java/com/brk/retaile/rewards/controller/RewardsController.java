package com.brk.retaile.rewards.controller;

import com.brk.retaile.rewards.model.RewardCustomers;
import com.brk.retaile.rewards.model.RewardsRepository;
import com.brk.retaile.rewards.service.CustomerRewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RewardsController {

    private final RewardsRepository rewardsRepository;

    @Autowired
    private CustomerRewardService customerRewardService;


    public RewardsController(RewardsRepository rewardsRepository) {
        this.rewardsRepository = rewardsRepository;
    }


    @GetMapping("/customers")
    List<RewardCustomers> all(){
        return customerRewardService.getAllCustomers();
    }

    @GetMapping("/customers/{CustomerId}")
    ResponseEntity<RewardCustomers> getCustomer(@PathVariable Integer CustomerId){
        RewardCustomers rewardCustomers = customerRewardService.getCustomerbyId(CustomerId);

        if(rewardCustomers == null)
            return new ResponseEntity<RewardCustomers>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<RewardCustomers>(rewardCustomers, HttpStatus.OK);
    }


}
