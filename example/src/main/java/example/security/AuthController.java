package example.security;

import example.database_classes.Doctors;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
//import io.micronaut.security.annotation.Secured;
//import io.micronaut.security.rules.SecurityRule;

import java.util.ArrayList;
import java.util.Optional;

//@Secured(SecurityRule.IS_ANONYMOUS)
@Controller(value = "/login")
public class AuthController {

    private final DoctorRepository doctorRepository;

    public AuthController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Get("/{email}")
    public Optional<Doctors> findDoc(String email){
        return doctorRepository.findByEmail(email);
    }

    @Post
    public ArrayList<String> login(String Email, String Password){
        return DoctorRepository.ArrayList(Email,Password);
    }
}
