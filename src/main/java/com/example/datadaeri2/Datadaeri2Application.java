package com.example.datadaeri2;

import com.example.datadaeri2.db.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Datadaeri2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Datadaeri2Application.class, args);
	}

	@Override
  public void run(String... args) throws Exception {

    System.out.println("NEED IMPLEMENT");
  }
}
