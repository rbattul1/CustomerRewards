package com.brk.retaile.rewards;


import com.brk.retaile.rewards.model.CustomerTrans;
import com.brk.retaile.rewards.model.RewardCustomers;
import com.brk.retaile.rewards.model.RewardsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Date;


@Configuration
public class loadDatabase {
    private static long index;
    @Bean
    CommandLineRunner initDatabase(RewardsRepository rewardsRepository){
        return args -> {

            rewardsRepository.save(index++, new RewardCustomers(1L, "Anil", 200.0,  new Date()) ,10));
            rewardsRepository.save(index++, new RewardCustomers(1L, "Anil", 200.0,  new Date()) ,10));


        }
    }

}
