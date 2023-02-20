package example.database_classes;

import io.micronaut.core.annotation.NonNull;

import javax.persistence.Column;
import javax.persistence.Id;

import io.micronaut.data.annotation.MappedEntity;
//import io.micronaut.data.annotation.Transient;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

//@NoArgsConstructor
@AllArgsConstructor
@MappedEntity
@Builder
@Data
@Table(name = "doctors", schema = "public")
public class Doctors implements Serializable {

    public static final String DEFAULT_ROLE = "DOC";

    @Id
    @NonNull
//    @GeneratedValue
    @Column(name = "employee_number")
    private int employee_number;

    @Column(name = "surname")
    @NotBlank
    private String surname;

    @Column(name = "name")
    @NotBlank
    private String name;

    @Column(name = "patronymic")
    @NotBlank
    private String patronymic;

    @Column(name = "cabinet")
    @NotBlank
    private String cabinet;

    @Column
    @NonNull
    private int id_s;

    @Column(name = "email")
    @NonNull
    private String email;

    @Column(name = "password")
    @NonNull
    private String password;

    @Transient
    private String token;

    @Transient
    @Builder.Default
    private String role = DEFAULT_ROLE;

    public Doctors(){

    }
    public Doctors(@NonNull int employee_number, @NonNull String surname, @NonNull String name, @NonNull String patronymic,
                   @NonNull String cabinet, @NonNull int id_s, @NonNull String email, @NonNull String password){
        this.employee_number=employee_number;
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
        this.cabinet=cabinet;
        this.id_s=id_s;
        this.email=email;
        this.password=password;
    }

    public int getEmployee_number(){return employee_number;}

    public void setEmployee_number(int employee_number){this.employee_number=employee_number;}
    public String getSurname(){return surname;}

    public void setSurname(String surname) {this.surname = surname;}
    public  String getName(){return name;}

    public void setName(String name) {this.name = name;}
    public String getPatronymic(){return  patronymic;}

    public void setPatronymic(String patronymic) {this.patronymic = patronymic;}
    public String getCabinet(){return cabinet;}

    public void setCabinet(String cabinet) {this.cabinet = cabinet;}
    public int getId_s(){return id_s;}

    public void setId_s(int id_s) {this.id_s = id_s;}
    public String getEmail(){return email;}

    public void getPassword(String password){this.password = password;}

//    public String getDocToken() {return token;}
//    public void setDocToken(String token) {this.token = token;}
//
//    public void setRole(String role) {this.role = role;}
//    public String getRole() {return role;}
}
