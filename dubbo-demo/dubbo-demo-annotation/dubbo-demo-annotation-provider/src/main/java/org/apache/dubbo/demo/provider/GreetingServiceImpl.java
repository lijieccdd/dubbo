package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.GreetingService;

/**
 * @ClassName GreetingServiceImpl
 * @Description TODO
 * @Author jayli
 * @Date 2019/11/26 17:52
 **/
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String hello() {
        return "hello";
    }
}
