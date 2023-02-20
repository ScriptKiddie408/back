package example.repository;

import example.database_classes.Doctors;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.jpa.annotation.EntityGraph;
import io.micronaut.data.jpa.repository.JpaRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

//@JdbcRepository(dialect = Dialect.POSTGRES)
@Repository
@Transactional
public abstract class DoctorRepository implements CrudRepository<Doctors, Integer> {

//    @EntityGraph(attributePaths = {"entries"})
//    @Query("from doctors d where d.email = :Email and d.password = :Password")
//    Optional findEmail(String Email,String Password);

    private final EntityManager entityManager;

    public DoctorRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<String> findEmail(String email, String password){
        return entityManager.createQuery("SELECT email FROM Doctors WHERE email LIKE :email AND password LIKE :password", String.class)
                .setParameter("email",email)
                .setParameter("password",password)
                .getResultList();
    }
//    @Query("SELECT email FROM Doctors WHERE email LIKE :email")
//    public List<String> findEmail(String email) {
//        return null;
//    }
}
