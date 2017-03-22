package com.skb.stat;

import org.springframework.data.repository.CrudRepository;

import com.skb.stat.model.Stats;
public interface StatsRepository extends CrudRepository<Stats,Integer> {

}
