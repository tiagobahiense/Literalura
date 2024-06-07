package br.com.tiago.Literalura;

import br.com.tiago.Literalura.main.Main;
import br.com.tiago.Literalura.repositories.AuthorRepository;
import br.com.tiago.Literalura.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
    @Autowired
    AuthorRepository autorRepository;
    @Autowired
    BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Main main = new Main(autorRepository,bookRepository);
        main.principal();
    }
}