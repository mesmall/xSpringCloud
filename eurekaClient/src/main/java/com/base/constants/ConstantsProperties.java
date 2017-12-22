package com.base.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by root on 2017/9/26.下午5:02
 *
 * @Author : lz
 * @Description:
 */
@Component
public class ConstantsProperties {

    @Value("${spring.profiles.active}")
    private String dev;

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }
}
