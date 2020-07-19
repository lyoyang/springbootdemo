package com.lyoyang.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI("impl")
public interface PrintService {

    void printInfo();

}
