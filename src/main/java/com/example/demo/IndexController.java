package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@CrossOrigin
@RestController
public class IndexController {

    @RequestMapping("/js/getentry")
    public String getentry(HttpServletResponse response){
        String data = "location.href='http://www.baidu.com'";
        return data;
//        try {
//            response.setContentType("text/html; charset=UTF-8");
//            ServletOutputStream output = response.getOutputStream();
//            output.write(data.getBytes("UTF-8"));
//            output.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
