package com.imooc.monitor.tunning.chapter5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年03月08日 16:54 胡晓磊 Exp $
 */
@RestController
@RequestMapping("/ch5")
public class Ch5Controller {
    @RequestMapping("/hello")
    public String hello() {
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i;
        }
        return str;
    }
}
