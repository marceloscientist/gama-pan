package com.crud.implementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.json.simple.JSONObject;



@SpringBootApplication
public class JsonApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(JsonApplication.class, args);
		
		
		JSONObject jsonzinho = new JSONObject();
		jsonzinho.put("Nome", "Julio");
		jsonzinho.put("Sobrenome", "Smith");
		jsonzinho.put("idade", 25);

			System.out.println(jsonzinho);
			
			PrintWriter salvar = new PrintWriter("./src/main/java/teste2");
			salvar.write(jsonzinho.toJSONString());
			
			salvar.flush();
			salvar.close();
		
		
		
		
		
		
		
		
		
	}

}
