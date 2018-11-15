package fi.academy.triviaback;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin("*")
@RestController
public class KysymysController {

    private KysymysRepository kysymysRepository;

    @Autowired
    public KysymysController(KysymysRepository kysymysRepository) {
        this.kysymysRepository = kysymysRepository;
    }

    @GetMapping("/kysymys/")
    public List<Kysymys> getAllMessages() {
        return kysymysRepository.findAll();
    }

}
