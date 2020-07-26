package com.chargingpile.subscribe.dao;

import com.chargingpile.subscribe.data.GPSHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GPSDao extends JpaRepository<GPSHistory, Long> {
}
