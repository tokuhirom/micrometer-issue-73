package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Meters;
import io.micrometer.core.instrument.Tag;

@SpringBootApplication
public class MicrometerIssue73Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrometerIssue73Application.class, args);
    }

    @Configuration
    public static class MyConfiguration {
        @Bean("sending-mails-executor-service")
        public ExecutorService executorService(MeterRegistry registry) {
            return Meters.monitor(registry,
                                  Executors.newCachedThreadPool(),
                                  "worker_pool",
                                  Tag.of("type", "sending-mails"));
        }
    }
}
