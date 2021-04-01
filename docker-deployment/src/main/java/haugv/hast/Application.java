package haugv.hast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author haugv
 * @description
 * @date 2021/3/29-4:38 下午
 */
@SpringBootApplication
@MapperScan("haugv.hast.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
