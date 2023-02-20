package example.repository;

import example.database_classes.Patient;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<Patient, BigInteger> {

}

