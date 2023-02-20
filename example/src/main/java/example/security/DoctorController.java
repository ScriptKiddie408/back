package example.security;

import example.database_classes.Doctors;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Optional;

@Controller(value = "/test")
public class DoctorController {
    private final DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Get("/go/{email}")
    public Optional<Doctors> go(String email){
        return doctorRepository.findByEmail(email);
    }
}
