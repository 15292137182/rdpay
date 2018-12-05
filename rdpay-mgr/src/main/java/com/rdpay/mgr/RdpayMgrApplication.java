package com.rdpay.mgr;

import com.rdpay.mgr.datasources.DynamicDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//配置servlet的过滤器 拦截器需要添加扫描
@ServletComponentScan
@EnableTransactionManagement
@Import({DynamicDataSourceConfig.class})
public class RdpayMgrApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(RdpayMgrApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RdpayMgrApplication.class);
    }
}
