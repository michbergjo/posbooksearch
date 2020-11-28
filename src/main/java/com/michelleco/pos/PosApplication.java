package com.michelleco.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.michelleco.pos.services.SpringClassicBookService;

@EnableWebMvc
@SpringBootApplication
public class PosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PosApplication.class, args);
		SpringClassicBookService service = (SpringClassicBookService) context.getBean(SpringClassicBookService.class);
		System.out.println(service.nameClassicBooks());
		
//		HardCodedDataSource codedDataSource = new HardCodedDataSource();
//		ClassicBookServiceWithDependencyInjection bookServiceWithDependencyInjection = new ClassicBookServiceWithDependencyInjection(codedDataSource);
	}

}
