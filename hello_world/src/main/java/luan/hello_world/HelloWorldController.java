package luan.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")

public class HelloWorldController {

	@GetMapping("Hello")
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping("bsm")
	public List<String> bsmList() {
		return List.of("Trabalho em Equipe", "Orientação ao Futuro", "Proatividade", "Responsabilidade Pessoal",
				"Mentalidade de Crescimento");
	}

	@GetMapping("objetivos")
	public List<String> listaObjetivoDeAprendizagem() {
		return List.of("Usar as boas práticas de desenvolvimento", "Estudar mais sobre Spring Web",
				"Colocar as atividades de dia", "Criar endpoints", "Configurar o git");

	}

}
