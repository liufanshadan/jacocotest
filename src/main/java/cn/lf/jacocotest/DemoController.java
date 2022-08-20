package cn.lf.jacocotest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/demo1")
    public String demo1(String name){
        String str = "";
        if("乔丹".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }else if("科比".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }else if("罗德曼".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }else if("罗伊".equalsIgnoreCase(name)){
            str = name+"到此一游";
        }
        return str;
    }
    @RequestMapping("/demo2")
    public String demo2(String name){
        int i = 1;
        int j = 1;
        int k = i+j;
        return "1+1="+k;
    }
}
