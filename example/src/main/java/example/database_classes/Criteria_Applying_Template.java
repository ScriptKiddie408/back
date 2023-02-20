package example.database_classes;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Version;

import javax.validation.constraints.NotBlank;

@MappedEntity
public class Criteria_Applying_Template {
    @Id
    @NonNull
    @GeneratedValue
    private int id_criteria;

    @NotBlank
    private int age;

    @NotBlank
    private String gender;

    @NotBlank
    private String diagnosis;

    @NotBlank
    private String speciality_name;

    public Criteria_Applying_Template(@NonNull int age, @NonNull String gender, @NonNull String diagnosis, @NonNull String speciality_name){
        this.age=age;
        this.gender=gender;
        this.diagnosis=diagnosis;
        this.speciality_name=speciality_name;
    }

    public int getAge(){return age;}
    public void setAge(int age) {this.age = age;}

    public String getGender(){return gender;}
    public void setGender(String gender) {this.gender = gender;}

    public String getDiagnosis(){return diagnosis;}
    public void setDiagnosis(String diagnosis) {this.diagnosis = diagnosis;}

    public String getSpeciality_name(){return speciality_name;}
    public void setSpeciality_name(String speciality_name) {this.speciality_name = speciality_name;}

    public int getId_Criteria(){return id_criteria;}
    public void setId_Criteria(int id_criteria){this.id_criteria=id_criteria;}

}
