package example.database_classes;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Date;

@MappedEntity
public class Research_Results {
    @Id
    @NonNull
    @GeneratedValue
    private int id_research;

    @NotBlank
    private String research;

    @NotBlank
    private LocalDate date_research;

    @NotBlank
    private String result_research;

    @NonNull
    private BigInteger snils;

    public Research_Results(@NonNull String research, @NonNull LocalDate date_research, @NonNull String result_research, @NonNull BigInteger snils){
        this.research=research;
        this.date_research=date_research;
        this.result_research=result_research;
        this.snils=snils;
    }

    public int getId_research() {return id_research;}
    public void setId_research(int id_research) {this.id_research = id_research;}

    public String getResearch() {return research;}
    public void setResearch(String research) {this.research = research;}

    public LocalDate getDate_research() {return date_research;}
    public void setDate_research(LocalDate date_research) {this.date_research = date_research;}

    public String getResult_research() {return result_research;}
    public void setResult_research(String result_research) {this.result_research = result_research;}

    public BigInteger getSnils() {return snils;}
    public void setSnils(BigInteger snils) {this.snils = snils;}
}
