package com.lyoyang;

import com.lyoyang.spi.PrintService;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class BootDubboProviderApplicationTests {

//    @Test
//    public void contextLoads() {
//    }

    public static void main(String[] args) {
        PrintService printService = ExtensionLoader.getExtensionLoader(PrintService.class).getDefaultExtension();
        printService.printInfo();
    }

}
