package com.cybersoft.demospringboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Anotation : Định nghĩa đường dẫn
 * @Controller : định nghĩa đường dẫn được dùng để trả ra nôị dung HTML
 * @ResponseBody: trả nôi dung kiểu String
 * @RestController : định nghĩa đường dẫn, nội dung trả về String chuyên dùng để viết API
 * chỉ quét những Anptation cùng cấp nhưng cái nào khác cấp thì ko quét đc
 *
 */
//hello
    @RestController
    @RequestMapping("/hello")
public class HelloController {
        @GetMapping("")
        public String hello() {

            return "Hello Spring Boot";
        }
        @GetMapping("/cybersoft")
    public String helloCybersoft() {

            return "Heloo Cybersoft";
        }
}
