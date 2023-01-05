/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisaenjel.spring.core;

import marisaenjel.spring.core.service.MerchantService;
import marisaenjel.spring.core.service.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Acer
 */
public class InheritanceTest {
    
    private ConfigurableApplicationContext applicationContext;
    
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }
    
    @Test
    void testInheritance(){
        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = applicationContext.getBean(MerchantServiceImpl.class);
        
        Assertions.assertSame(merchantService, merchantServiceImpl);
    }
}
