package com.zhongrui.qrcode.service;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeException;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import com.zhongrui.qrcode.config.QRConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaoh
 * @ClassName QrCodeService
 * @Description TODO
 * @Date 2020/11/27 下午2:21
 * @Version 1.0
 */
@Service
@Slf4j
public class QrCodeService {

    @Autowired
    private QrConfig config;

    //生成到文件
    public void createCodeToFile(String content, String filePath) {
        try {
            QrCodeUtil.generate(content, config, FileUtil.file(filePath));
        } catch (QrCodeException e) {
            e.printStackTrace();
        }
    }

    //生成到流
    public void createCodeToStream(String content, HttpServletResponse response) {
        try {

            QrCodeUtil.generate(content, config, "png", response.getOutputStream());
        } catch (QrCodeException | IOException e) {
            e.printStackTrace();
        }
    }
}
