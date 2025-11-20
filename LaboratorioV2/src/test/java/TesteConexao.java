import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;

public class TesteConexao {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public TesteConexao() {
        emf = Persistence.createEntityManagerFactory("db_laboratorio");
        em = emf.createEntityManager();
    }
    
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }
}