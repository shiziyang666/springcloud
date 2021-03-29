package com.nacos.provider.interfaces.facade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
//@RefreshScope//只需要在需要动态读取配置的类上添加此注解就可以
public class ProviderTestController {

    @Value("${aa.bb}")
    private String test;

    //test
    @RequestMapping(value = "/helloNacos", method = RequestMethod.GET)
    public String dataListLabel() {
        log.info("[LabelController]-[dataListLabel]-[/data/list/label:begin]-[request]");

        System.out.println(test);

        return "hello nacos";
    }

}
