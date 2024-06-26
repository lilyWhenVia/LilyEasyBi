package com.lilyVia.springbootinit.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lilyVia.springbootinit.model.dto.chart.ChartQueryRequest;
import com.lilyVia.springbootinit.model.entity.Chart;
import com.lilyVia.springbootinit.model.entity.ChartCoreData;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 22825
* @description 针对表【chart_core_data(图表核心数据表)】的数据库操作Service
* @createDate 2024-04-05 14:28:12
*/
public interface ChartCoreDataService extends IService<ChartCoreData> {


    QueryWrapper<ChartCoreData> getQueryWrapper(Long chartId);

    ChartCoreData getCoreDataById(Long chartId);
}
