package com.chargingpile.subscribe.dao;

import com.chargingpile.subscribe.data.TemperatureHistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperatureDao extends JpaRepository<TemperatureHistory, Long> {
}