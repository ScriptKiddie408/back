package example.security;

import io.micronaut.data.annotation.Transient;

import java.util.Optional;

public class DoctorServce {

    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    public DoctorServce(DoctorRepository doctorRepository, DoctorMapper doctorMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
    }

    @Transient
    public Optional<DoctorDTO> findDoctor(String email){
        return doctorRepository.findByEmail(email).map(doctorMapper::toDto);
    }

//    public Optional<DoctorDTO> findByRefreshToken(String refreshToken){
//        return doctorRepository.findBy(refreshToken).map(doctorMapper::toDto);
//    }

    public void saveRefreshToken(String email, String refreshToken){
        doctorRepository.findByEmail(email).ifPresent(
            doctors ->{
                doctors.setToken(refreshToken);
                doctorRepository.update(doctors);
            }
        );
    }
}
