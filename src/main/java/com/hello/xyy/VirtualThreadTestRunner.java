package com.hello.xyy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by lihao on 2023/1/29.
 *
 * @author lihao
 */
@Component
public class VirtualThreadTestRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("hello jdk");

        Thread.startVirtualThread(() -> System.out.println(Thread.currentThread() + " : say good"));
    }
}
