package ao.magnodev.develop;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PessoaController {

    PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping("/api/pessoa")
    public String getAll() {
        return "ooooo";
    }

    @PostMapping("/api/pessoa")
    public Optional<Pessoa> addPerson(
        @Validated @RequestBody PersonDTO pessoa
    ) {
        return Optional.ofNullable(
            pessoaRepository.save(new Pessoa(pessoa.getNome(), pessoa.getAltura(), pessoa.getIdade()))
        );
    }
    
}
