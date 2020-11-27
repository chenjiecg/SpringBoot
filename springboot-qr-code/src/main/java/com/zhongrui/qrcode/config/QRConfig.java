package com.zhongrui.qrcode.config;

import cn.hutool.extra.qrcode.QrConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

/**
 * @author xiaoh
 * @ClassName QRConfig
 * @Description TODO
 * @Date 2020/11/27 下午2:18
 * @Version 1.0
 */
@Configuration
public class QRConfig {

    /**
     * 功能描述 采用JavaConfig的方式显示注入hutool中 生成二维码
     *
     * @param []
     * @return cn.hutool.extra.qrcode.QrConfig
     */
    @Bean
    public QrConfig qrConfig() {
        // 初始宽度和高度
        QrConfig qrConfig = new QrConfig(300, 300);

        // 设置边距，即二维码和边框的距离
        qrConfig.setMargin(2);
        // 设置前景色
        qrConfig.setForeColor(Color.BLACK.getRGB());
        // 设置背景色
        qrConfig.setBackColor(Color.WHITE.getRGB());

        return qrConfig;
    }
}
