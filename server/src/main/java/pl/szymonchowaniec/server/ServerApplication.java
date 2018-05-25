package pl.szymonchowaniec.server;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.szymonchowaniec.server.domain.Picture;
import pl.szymonchowaniec.server.repository.PictureRepository;

import java.util.stream.Stream;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	ApplicationRunner init(PictureRepository repository) {
		return args -> {
			Stream.of("Mona Lisa", "Słoneczniki VanGog", "Porsche", "Lamborghini", "Bugatti",
					"AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
				Picture picture = new Picture();
				picture.setName(name);
				repository.save(picture);
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
