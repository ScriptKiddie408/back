package example.database_classes;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Version;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

@MappedEntity
public class Consultation_Protocol {
    @Id
    @NonNull
    @GeneratedValue
    private int id_protocol;

    @NotBlank
    private LocalDate date_protocol;

    @NonNull
    private int employee_number;

    @NotBlank
    private String inspection_result;

    @NotBlank
    private String basic_diagnosis;

    @NotBlank
    private String basic_diagnosis_complication;

    @NotBlank
    private String concomitant_diseases;

    @NotBlank
    private String assigned_research;

    public Consultation_Protocol(@NonNull LocalDate date_protocol, @NonNull int employee_number, @NonNull String inspection_result
            , @NonNull String basic_diagnosis ,@NonNull String basic_diagnosis_complication, @NonNull String concomitant_diseases, @NonNull String assigned_research){
        this.date_protocol=date_protocol;
        this.employee_number=employee_number;
        this.inspection_result=inspection_result;
        this.basic_diagnosis=basic_diagnosis;
        this.basic_diagnosis_complication=basic_diagnosis_complication;
        this.concomitant_diseases=concomitant_diseases;
        this.assigned_research=assigned_research;
    }

    public int getId_protocol(){return id_protocol;}
    public void setId_protocol(int id_protocol){this.id_protocol=id_protocol;}

    public int getEmployee_number(){return employee_number;}
    public void setEmployee_number(int employee_number) {this.employee_number = employee_number;}

    public LocalDate getDate_protocol(){return date_protocol;}
    public void setDate_protocol(LocalDate date_protocol) {this.date_protocol = date_protocol;}

    public String getInspection_result(){return inspection_result;}
    public void setInspection_result(String inspection_result) {this.inspection_result = inspection_result;}

    public String getBasic_diagnosis(){return basic_diagnosis;}
    public void setBasic_diagnosis(String basic_diagnosis) {this.basic_diagnosis = basic_diagnosis;}

    public String getBasic_diagnosis_complication(){return basic_diagnosis_complication;}
    public void setBasic_diagnosis_complication(String basic_diagnosis_complication) {this.basic_diagnosis_complication = basic_diagnosis_complication;}

    public String getConcomitant_diseases(){return concomitant_diseases;}
    public void setConcomitant_diseases(String concomitant_diseases) {this.concomitant_diseases = concomitant_diseases;}

    public String getAssigned_research(){return assigned_research;}
    public void setAssigned_research(String assigned_research) {this.assigned_research = assigned_research;}
}
