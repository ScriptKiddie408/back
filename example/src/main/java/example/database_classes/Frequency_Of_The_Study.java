package example.database_classes;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Version;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@MappedEntity
public class Frequency_Of_The_Study {
    @Id
    @NonNull
    @GeneratedValue
    private int id_frequency;

    @NotBlank
    private String frequency;

    private Frequency_Of_The_Study(@NonNull String frequency){
        this.frequency=frequency;
    }

    public String getFrequency(){return frequency;}
    public void setFrequency(String frequency) {this.frequency = frequency;}

    public int get_Id_frequency(){return id_frequency;}
    public void set_Id_frequency(int id_frequency) {this.id_frequency = id_frequency;}
}
