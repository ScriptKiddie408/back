package example.controller;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import example.database_classes.Doctors;
import example.database_classes.Patient;
import example.repository.DoctorRepository;
import example.repository.UserRepository;
import io.micronaut.http.annotation.*;
//import io.micronaut.security.annotation.Secured;
//import io.micronaut.security.rules.SecurityRule;

import javax.validation.constraints.Size;

//@Secured(SecurityRule.IS_ANONYMOUS)
@Controller(value="/users")
public class UserController {
    Doctors doctors = new Doctors();
    private final UserRepository userRepository;
    private final DoctorRepository doctorRepository;
    public UserController(UserRepository userRepository, DoctorRepository doctorRepository){
        this.userRepository=userRepository;
        this.doctorRepository = doctorRepository;
    }

    @Get("/gimme")
    public Iterable<Patient> gimmeUser(){
        return userRepository.findAll();
    }

    @Get("/gimmeDoc")
    public List<String> gimeDoc(){
        return doctorRepository.findEmail("el@gmail.com", "4343ffs3");
    }

    @Get("/{id}")
    public Optional<Patient> getUser(BigInteger id){
        return userRepository.findById(id);
    }

    @Post("/add")
    public Patient add(@Size(max = 1024) @Body Patient patient){
        return userRepository.save(patient);
    }

    @Delete("/delete/{id}")
    public Patient delete(@PathVariable BigInteger id){
        Optional<Patient> byId=userRepository.findById(id);
        if(byId.isEmpty())
            throw new IllegalArgumentException("Does not exist: " + id);
        userRepository.delete(byId.get());
        return byId.get();
    }

    @Put("/update/{id}")
    public Patient updateUser(BigInteger id, @Body Patient patient) throws Exception{
        if (userRepository.existsById(id)){
            patient.setSnils(id);
            userRepository.update(patient);
            return patient;
        }else {
            throw new Exception("id not found");
        }
    }
}
