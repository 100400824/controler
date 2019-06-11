package com.test.API;

import com.test.Assist.ThreadRun;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class Api {

    @RequestMapping("/yy")
    @ResponseBody
    public static void postToCollect(String num,String cmd) throws Exception {

        ThreadRun.xc(num,cmd);
    }


    @RequestMapping("/help")
    @ResponseBody
    public static String zaoshu() throws Exception {

        String helpInfo;

        helpInfo = "接口地址：/yy，功能说明：多现成执行CMD命令。<br/>" +
                "接口请求方式：POST<br/>" +
                "提交数据格式：FormData<br/>" +
                "接口参数：<br/>" +
                "num（启动现成的数量，例：num=10<br/>" +
                "cmd（需要执行的cmd命令,例：cmd=java -jar d:\\zaoshu\\Run.jar 888,注意JAR包写入对应的路径）<br/>";

        return helpInfo;
    }

}
