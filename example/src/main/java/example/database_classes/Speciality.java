package example.database_classes;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.security.SecureRandom;

@MappedEntity
public class Speciality {
    @Id
    @NonNull
    @GeneratedValue
    private int id_s;

    @NotBlank
    private String speciality_name;

    public Speciality(@NotNull String speciality_name){
        this.speciality_name=speciality_name;
    }

    public int getId_s() {return id_s;}
    public void setId_s(int id_s) {this.id_s = id_s;}

    public String getSpeciality_name(){return speciality_name;}
    public void setSpeciality_name(String speciality_name) {this.speciality_name = speciality_name;}
}
