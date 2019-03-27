package com.iolo.shorturl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 短连接转换
 *
 * @author Fengxinxin
 * @date 2019-03-27
 */
@RestController
@Slf4j
@RequestMapping("/shortUrl")
public class ShortURLController {
    @PostMapping("/change")
    public String change(@RequestBody Map<String, String> paramMap) {
        String originUrl = paramMap.get("url");
        log.info(originUrl);
        return originUrl;
    }
}
