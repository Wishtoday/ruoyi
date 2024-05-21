//package com.ruoyi.campus.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.campus.SchedulerFactoryBean;
//import javax.sql.DataSource;
//import java.util.Properties;
//
///**
// * 定时任务配置（单机部署建议默认走内存，如需集群需要创建qrtz数据库表/打开类注释）
// * 
// * @author ruoyi
// */
//@Configuration
//public class ScheduleConfig
//{
//    @Bean
//    public SchedulerFactoryBean schedulerFactoryBean(DataSource dataSource)
//    {
//        SchedulerFactoryBean factory = new SchedulerFactoryBean();
//        factory.setDataSource(dataSource);
//
//        // quartz参数
//        Properties prop = new Properties();
//        prop.put("org.campus.scheduler.instanceName", "RuoyiScheduler");
//        prop.put("org.campus.scheduler.instanceId", "AUTO");
//        // 线程池配置
//        prop.put("org.campus.threadPool.class", "org.campus.simpl.SimpleThreadPool");
//        prop.put("org.campus.threadPool.threadCount", "20");
//        prop.put("org.campus.threadPool.threadPriority", "5");
//        // JobStore配置
//        prop.put("org.campus.jobStore.class", "org.springframework.scheduling.campus.LocalDataSourceJobStore");
//        // 集群配置
//        prop.put("org.campus.jobStore.isClustered", "true");
//        prop.put("org.campus.jobStore.clusterCheckinInterval", "15000");
//        prop.put("org.campus.jobStore.maxMisfiresToHandleAtATime", "10");
//        prop.put("org.campus.jobStore.txIsolationLevelSerializable", "true");
//
//        // sqlserver 启用
//        // prop.put("org.campus.jobStore.selectWithLockSQL", "SELECT * FROM {0}LOCKS UPDLOCK WHERE LOCK_NAME = ?");
//        prop.put("org.campus.jobStore.misfireThreshold", "12000");
//        prop.put("org.campus.jobStore.tablePrefix", "QRTZ_");
//        factory.setQuartzProperties(prop);
//
//        factory.setSchedulerName("RuoyiScheduler");
//        // 延时启动
//        factory.setStartupDelay(1);
//        factory.setApplicationContextSchedulerContextKey("applicationContextKey");
//        // 可选，QuartzScheduler
//        // 启动时更新己存在的Job，这样就不用每次修改targetObject后删除qrtz_job_details表对应记录了
//        factory.setOverwriteExistingJobs(true);
//        // 设置自动启动，默认为true
//        factory.setAutoStartup(true);
//
//        return factory;
//    }
//}
