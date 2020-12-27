package com.lyoyang.controller;


import com.lyoyang.cron.CronTaskRegistrar;
import com.lyoyang.cron.SchedulingRunnable;
import com.lyoyang.entity.SysJob;
import com.lyoyang.mapper.SysJobMapper;
import com.lyoyang.utils.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/cron")
public class CronController {

    @Resource
    private SysJobMapper sysJobMapper;

    @Resource
    private CronTaskRegistrar cronTaskRegistrar;

    @RequestMapping("/addCron")
    public String addCron(SysJob sysJob) {
//        sysJobMapper.insertSelective(sysJob);
        SchedulingRunnable schedulingRunnable = new SchedulingRunnable("cronService", "printInfo");
        String format = LocalDateTime.parse(sysJob.getStartTime(), DateTimeFormatter.ofPattern(DateUtil.FORMAT_DATETIME)).format(DateTimeFormatter.ofPattern(DateUtil.FORMAT_CRON));
        cronTaskRegistrar.addCronTask(schedulingRunnable, format);
        return "success";
    }


    @GetMapping("/cancelJob")
    public String cancelJob() {
        SchedulingRunnable task = new SchedulingRunnable("cronService", "printInfo");
        cronTaskRegistrar.removeCronTask(task);
        return "SUCCESS";
    }



}
