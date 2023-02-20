package example.security;

import example.database_classes.Doctors;
import io.micronaut.http.HttpRequest;
//import io.micronaut.security.authentication.*;
//import io.micronaut.security.authentication.AuthenticationProvider;
//import io.micronaut.security.authentication.AuthenticationRequest;
//import io.micronaut.security.authentication.AuthenticationResponse;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jooq.DSLContext;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;

import java.util.Optional;

import static java.util.Collections.singletonList;

//import static io.micronaut.security.authentication.AuthenticationFailureReason.PASSWORD_EXPIRED;
//import static io.micronaut.security.authentication.AuthenticationFailureReason.USER_NOT_FOUND;

//@Singleton
//public class BasicAuthProvider implements AuthenticationProvider {
//
//    @Inject
//    DSLContext dslContext;
//    private final DoctorServce doctorServce;
//
//    public BasicAuthProvider(DoctorServce doctorServce) {this.doctorServce = doctorServce;}

//    @Override
//    public Publisher<AuthenticationResponse> authenticate(HttpRequest httpReq, AuthenticationRequest authReq) {
//
//        final String email = authReq.getIdentity().toString();
//        final String password = authReq.getIdentity().toString();
//
//        Optional<DoctorDTO> existingDoctor = doctorServce.findDoctor(email);
//
//        return Flowable.just(
//                existingDoctor.map( doctor -> {
//                    if (doctor.getPassword().equals(password)) {
//                        return new UserDetails(email,singletonList(doctor.getRole()));
//                    }
//                    return new AuthenticationFailed(PASSWORD_EXPIRED);
//                })
//                        .orElse(new AuthenticationFailed(USER_NOT_FOUND))
//        );
//    }

//}
