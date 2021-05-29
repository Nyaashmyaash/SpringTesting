package com.nyash.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.nyash.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
