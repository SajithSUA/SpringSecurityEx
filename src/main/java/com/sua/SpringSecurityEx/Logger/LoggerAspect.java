package com.sua.SpringSecurityEx.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggerAspect {
     private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAspect.class);

        @Before("execution(public * com.sua.SpringSecurityEx.controller.StudentController.getStudent())")
        public void logBefore() {
            LOGGER.info("Before method execution getStudent");
        }
}
