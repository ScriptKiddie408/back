package example.database_classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.micronaut.core.annotation.NonNull;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class Patient {
    @Id
    @NonNull
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private BigInteger snils;
    @NotBlank
    private String surname;

    @NotBlank
    private String name;

    @NotBlank
    private String patronymic;

    @NotBlank
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_of_birth;

    @NotBlank
    private String gender;

    @NotBlank
    private String Email;

    @NotBlank
    private String Password;

    public Patient() {

    }

    public Patient(@NonNull BigInteger snils, @NonNull String surname, @NonNull String name, @NonNull String patronymic,
                   @NonNull LocalDate date_of_birth, @NonNull String gender){
        this.snils=snils;
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
        this.date_of_birth=date_of_birth;
        this.gender=gender;
    }

    public BigInteger getSnils(){return snils;}
    public void  setSnils(BigInteger snils){this.snils=snils;}

    public String getSurname(){return surname;}
    public void setSurname(String surname) {this.surname = surname;}

    public String getName(){return name;}
    public void setName(String name) {this.name = name;}

    public String getPatronymic(){return patronymic;}
    public void setPatronymic(String patronymic) {this.patronymic = patronymic;}

    public LocalDate getDate_of_birth() {return date_of_birth;}
    public void setDate_of_birth(LocalDate date_of_birth) {this.date_of_birth = date_of_birth;}

    public String getGender(){return gender;}
    public void setGender(String gender) {this.gender = gender;}

    public String getEmail() {return Email;}
    public void setEmail(String email) {Email = email;}

    public String getPassword() {return Password;}
    public void setPassword(String password) {Password = password;}
}
