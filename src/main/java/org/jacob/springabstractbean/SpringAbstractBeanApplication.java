package org.jacob.springabstractbean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringAbstractBeanApplication implements ApplicationRunner {


    @Autowired
    private BallService ballService;

    public static void main(String[] args) {
        SpringApplication.run(SpringAbstractBeanApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Hello");
        ballService.printer();
    }
}
