import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.Config;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setFirstName("Aleks");
        student.setLastName("Kosiak");
        student.setDateOfBirth(LocalDate.of(1988, 1, 5));
        student.setNationality("UA");

        StudentGroup studentGroup = new StudentGroup();

        Set<StudentGroup> groups = new HashSet<>();
        groups.add(studentGroup);
        student.setStudentGroups(groups);

        SessionFactory sessionFactory = Config.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(student);
        session.persist(studentGroup);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
