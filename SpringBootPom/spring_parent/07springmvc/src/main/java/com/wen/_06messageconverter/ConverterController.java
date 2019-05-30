package com.wen._06messageconverter;

import com.wen._02domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wen
 * @Date: 2019/5/28 23:53
 */
@Controller
public class ConverterController {
    @RequestMapping(value = "/convert", produces = {"application/x-wen"})//指定返回的媒体类型
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj) {
        return demoObj;
    }
}
