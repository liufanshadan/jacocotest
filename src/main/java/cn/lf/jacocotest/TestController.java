package cn.lf.jacocotest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test1")
    public String test1(String name){
        String str = "";
        if("韩信".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }else if("赵云".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }else if("安琪拉".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }else if("李白".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }
        return str;
    }
}
