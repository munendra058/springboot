package com.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.myspringboot.service.RCFansClub;
import com.myspringboot.model.RC;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		RCFansClub fansclub = context.getBean(RCFansClub.class);

		RC rc = context.getBean(RC.class);
		fansclub.areaOfClub(rc);

		// TFI tfi = context.getBean(TFI.class);
		// System.out.println(tfi.getCollections());
		// tfi.compile();
	}

}
