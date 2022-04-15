package pl.manczak.ksb2mongodb;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyRepo extends MongoRepository<Toy, String> {
}
