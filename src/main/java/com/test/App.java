package com.test;

import com.test.filter.FilterConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;


@Controller
@SpringBootApplication
@ServletComponentScan(basePackageClasses = {
        FilterConfiguration.class
})

public class App implements EmbeddedServletContainerCustomizer {

    //修改端口号
    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {

        configurableEmbeddedServletContainer.setPort(7127);
    }


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
