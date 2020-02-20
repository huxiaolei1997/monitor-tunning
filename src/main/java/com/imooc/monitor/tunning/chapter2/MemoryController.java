package com.imooc.monitor.tunning.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年02月14日 16:02 胡晓磊 Exp $
 */
@RestController
public class MemoryController {

    private List<User> userList = new ArrayList<>();

    private List<Class<?>> classList = new ArrayList<>();

    /**
     * -Xmx32M -Xms32M 设置最大最小堆内存为32M，便于测试堆内存溢出
     * @return
     */
    @GetMapping("/heap")
    public String heap() {
        int i = 0;

        while(true) {
            userList.add(new User(i++, UUID.randomUUID().toString()));
        }
    }

    /**
     * -XX:MetaspaceSize=32M -XX:MaxMetaspaceSize=32M
     * @return
     */
    @GetMapping("/nonheap")
    public String nonheap() {
        while(true) {
            classList.addAll(Metaspace.createClasses());
        }
    }

}
