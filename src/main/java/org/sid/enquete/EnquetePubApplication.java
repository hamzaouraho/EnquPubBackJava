package org.sid.enquete;

import org.sid.enquete.service.EnqueteServiceImp;
import org.sid.enquete.service.IEnqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnquetePubApplication implements CommandLineRunner {
	@Autowired
	private EnqueteServiceImp enqueteservice;
	public static void main(String[] args) {
		SpringApplication.run(EnquetePubApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		enqueteservice.InitEtudes();
	}

}
