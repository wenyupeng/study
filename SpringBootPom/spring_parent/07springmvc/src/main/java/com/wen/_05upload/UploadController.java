package com.wen._05upload;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author: wen
 * @Date: 2019/5/28 22:40
 */
@Controller
public class UploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file){//接受上传文件
        try {
            //将文件写入磁盘
            FileUtils.writeByteArrayToFile(new File("e:/upload/"+file.getOriginalFilename()), file.getBytes());
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }
    }
}
