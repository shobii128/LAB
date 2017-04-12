import model.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Shoaib
 */
public class CityDAO {

    public void save(City city) {
        // Get session factory and open a new session
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        // Begin transaction
        Transaction t = session.beginTransaction();

        // Persist city and commit changes
        session.persist(city);
        t.commit();

        // Close the session
        session.close();
    }

}
