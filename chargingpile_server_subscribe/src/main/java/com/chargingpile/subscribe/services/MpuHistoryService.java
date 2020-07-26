package com.chargingpile.subscribe.services;

import com.chargingpile.subscribe.dao.MpuDao;
import com.chargingpile.subscribe.data.MpuHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MpuHistoryService {
    @Autowired
    private MpuDao mpuDao;
    public MpuHistoryService(MpuDao mpuDao) {
        this.mpuDao = mpuDao;
    }

    public void saveMpu(MpuHistory mpuHistory) {
        mpuDao.save(mpuHistory);
    }
}
