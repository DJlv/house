package com.zzbq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzbq.entity.House;
import com.zzbq.mapper.HouseMapper;
import com.zzbq.service.HouseService;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements HouseService {
}
