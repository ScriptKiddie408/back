package example.security;

import io.micronaut.runtime.event.annotation.EventListener;
//import io.micronaut.security.authentication.UserDetails;
//import io.micronaut.security.token.event.RefreshTokenGeneratedEvent;
//import io.micronaut.security.token.refresh.RefreshTokenPersistence;
import io.reactivex.Flowable;
import ognl.TokenMgrError;
import org.reactivestreams.Publisher;

import javax.inject.Singleton;

import static java.util.Collections.singletonList;

//@Singleton
//public class RefreshTokenHandler implements RefreshTokenPersistence {
//
//    private final DoctorServce doctorServce;
//
//    public RefreshTokenHandler(DoctorServce doctorServce) {this.doctorServce = doctorServce;}
//
//    @Override
//    @EventListener
//    public void persistToken(RefreshTokenGeneratedEvent event) {
//        doctorServce.saveRefreshToken(event.getUserDetails().getUsername(), event.getRefreshToken());
//    }
//
//    @Override
//    public Publisher<UserDetails> getUserDetails(String refreshToken) {
////        return doctorServce.findByRefreshToken(refreshToken)
////                .map(doctor -> Flowable.just(new UserDetails(doctor.getEmail(), singletonList(doctor.getRole()))))
////                .orElse(Flowable.error(TokenNotFoundException::new));
//        return null;
//    }
//}
