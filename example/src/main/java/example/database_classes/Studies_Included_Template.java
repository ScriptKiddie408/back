package example.database_classes;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Version;

import javax.validation.constraints.NotBlank;

@MappedEntity
public class Studies_Included_Template {
    @Id
    @NonNull
    @GeneratedValue
    private int id_studies_template;

    @NotBlank
    private String research;

    public Studies_Included_Template(@NonNull String research){this.research=research;}

    public String getResearch(){return research;}
    public void setResearch(String research) {this.research = research;}

    public int getId_studies_template(){return id_studies_template;}
    public void setId_studies_template(int id_studies_template){this.id_studies_template=id_studies_template;}
}
