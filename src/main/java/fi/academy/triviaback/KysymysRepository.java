package fi.academy.triviaback;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KysymysRepository extends MongoRepository <Kysymys, String> {
}
