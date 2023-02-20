package example.security;

import example.database_classes.Doctors;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface DoctorRepository extends CrudRepository<Doctors,Integer> {

    public static ArrayList<String> ArrayList(String email, String pass){
        ArrayList<String> emailPass=new ArrayList<String>();
        emailPass.add(email);
        emailPass.add(pass);
        return emailPass;
    }

    Optional<Doctors> findByEmail(String email);
//    Optional<Doctors> findBy(String token);
//    Optional<Doctors>
}
