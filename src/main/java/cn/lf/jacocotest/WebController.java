package cn.lf.jacocotest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping("/test1")
    public String test1(String name){
        String str = "";
        if("贝克汉姆".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }else if("C罗".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }else if("马拉多纳".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }else if("高俅".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }
        return str;
    }
}
