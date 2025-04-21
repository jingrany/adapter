package com.shgame.studio996.sdk.manage.hotworld;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.StopWatch;

@Slf4j
@EnableAsync
@EnableRetry
@EnableDiscoveryClient
@EnableScheduling
@MapperScan(basePackages = {"com.shgame.studio996.sdk.*.mapper", "icu.mhb.mybatisplus.plugln.base.mapper"})
@SpringBootApplication(scanBasePackages = {"com.shgame.studio996.sdk.common", "com.shgame.studio996.sdk.manage.hotworld"})
@EnableFeignClients(basePackages = {"com.shgame.studio996.sdk.manage.remote.gm"})
public class ManageOpenServerApplication {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        SpringApplication.run(ManageOpenServerApplication.class, args);
        stopWatch.stop();
        log.info("项目启动完成！耗时{}秒", stopWatch.getTotalTimeSeconds());
    }
}
