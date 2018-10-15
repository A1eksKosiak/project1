import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setFirstName("First name");
        student.setLastName("Last name");
        student.setNationality("estonian");

        Group group = new Group();
        group.setId(1L);

        SessionFactory sessionFactory = Config.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(student);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
