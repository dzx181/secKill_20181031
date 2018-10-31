package com.dzx.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author dengzhenxiang
 * @Date 2018/10/30 16:08
 * @Version
 * 启动类
 */
@SpringBootApplication
@MapperScan(basePackages = "com.dzx.seckill.dao")
public class SeckillApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeckillApplication.class, args);
	}
}
