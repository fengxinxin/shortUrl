package com.iolo.shorturl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 跳转
 *
 * @author Fengxinxin
 * @date 2019-03-27
 */
@Controller
@Slf4j
public class RedirectController {
    /**
     * 301跳转
     * @param key
     * @return
     */
    @RequestMapping("/{key}")
    public String restoreUrl(@PathVariable("key") String key){
        return "redirect:http://www.baidu.com";
    }
}
