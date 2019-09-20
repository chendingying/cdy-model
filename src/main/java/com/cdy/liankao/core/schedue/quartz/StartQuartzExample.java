package com.cdy.liankao.core.schedue.quartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * quartz的启动示例
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:43
 * @Version 1.0
 */
public class StartQuartzExample implements CommandLineRunner {

    @Autowired
    private Scheduler scheduler;

    @Override
    public void run(String... args) throws Exception {

        // 启动调度器
        scheduler.start();

        //构建job信息
        JobDetail jobDetail = JobBuilder.newJob(SampleQuartzJob.class).withIdentity(SampleQuartzJob.class.getName(), "aaa").build();

        //表达式调度构建器(即任务执行的时间)
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");

        //按新的cronExpression表达式构建一个新的trigger
        CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(SampleQuartzJob.class.getName(), "aaa")
                .withSchedule(scheduleBuilder).build();

        try {
            scheduler.scheduleJob(jobDetail, trigger);

        } catch (SchedulerException e) {
            System.out.println("创建定时任务失败" + e);
            throw new Exception("创建定时任务失败");
        }
    }
}
