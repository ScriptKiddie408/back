package example.database_classes;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Version;

import javax.validation.constraints.NotBlank;

@MappedEntity
public class Assignment_Group_Template {
    @Id
    @NonNull
    @GeneratedValue
    private int id;

    @NotBlank
    private String diagnosis_in_which_prescribed;

    @NotBlank
    private String mandatory;

    public Assignment_Group_Template(@NonNull String mandatory, @NonNull String diagnosis_in_which_prescribed) {
        this.mandatory=mandatory;
        this.diagnosis_in_which_prescribed=diagnosis_in_which_prescribed;
    }

    public String getMandatory(){
        return mandatory;
    }
    public void setMandatory(String mandatory){this.mandatory=mandatory;}

    public String getDiagnosis_in_which_prescribed(){
        return diagnosis_in_which_prescribed;
    }
    public void setDiagnosis_in_which_prescribed(String diagnosis_in_which_prescribed){this.diagnosis_in_which_prescribed=diagnosis_in_which_prescribed;}

    public int ID(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
}
