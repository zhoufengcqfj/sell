package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1(){
        String name = "是大法官的";
        String password = "2344323423434";
        log.debug("debiug...");
        log.info("name "+name+"password"+password);
        log.info("name:{},password:{}",name,password);
    }
}
