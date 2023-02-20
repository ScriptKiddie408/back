package example.security;

import example.database_classes.Doctors;

public class DoctorMapper {
    public DoctorDTO toDto(Doctors doctors){
        return DoctorDTO.builder().email(doctors.getEmail()).password(doctors.getPassword()).role(doctors.getRole()).build();
    }
}
