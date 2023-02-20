package example.security;


import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Introspected
public class DoctorDTO {

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private String role;

    private String token;
}
