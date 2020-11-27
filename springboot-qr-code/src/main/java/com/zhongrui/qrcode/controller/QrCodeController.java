package com.zhongrui.qrcode.controller;

import com.zhongrui.qrcode.service.QrCodeService;
import com.zhongrui.qrcode.util.QRCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xiaoh
 * @ClassName QrCodeController
 * @Description TODO
 * @Date 2020/11/27 下午2:03
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/qr/code")
public class QrCodeController {

    private static final String ROOT_PATH = "/Users/xiaoh/Downloads/";
    private static final String FileFormat = ".png";

    private static final ThreadLocal<SimpleDateFormat> LOCAL_DATE_FORMAT = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMddHHmmss"));

    @Autowired
    private QrCodeService qrCodeService;

    //生成二维码并将其存放于本地目录
    @PostMapping("generate/v1")
    public String generateV1(@RequestParam String content) {
        try {
            final String fileName = LOCAL_DATE_FORMAT.get().format(new Date());
            QRCodeUtil.createCodeToFile(content, new File(ROOT_PATH), fileName + FileFormat);
        } catch (Exception e) {
            return "fail";
        }
        return "success";
    }

    //生成二维码并将其返回给前端调用者
    @PostMapping("generate/v2")
    public String generateV2(String content, HttpServletResponse servletResponse) {
        try {
            QRCodeUtil.createCodeToOutputStream(content, servletResponse.getOutputStream());
        } catch (Exception e) {
            return "fail";
        }
        return "success";
    }

    //生成二维码并将其返回给前端调用者_hutool
    @PostMapping("generate/v3")
    public String generateV3(@RequestParam String content, HttpServletResponse servletResponse) {
        try {
            //将生成的二维码文件存放于文件目录中
            final String fileName = LOCAL_DATE_FORMAT.get().format(new Date());
            qrCodeService.createCodeToFile(content, ROOT_PATH + File.separator + fileName + ".png");

            //将生成的二维码文件直接返回给前端响应流
//            codeService.createCodeToStream(content,servletResponse);
        } catch (Exception e) {
            return "fail";
        }
        return "success";
    }
}
