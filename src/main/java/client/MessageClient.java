package client;

import configs.HibernateUtil;
import entities.Message;
import org.hibernate.Session;

public class MessageClient {

    public  static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Message message = new Message( "Hello World with Hibernate " );

        session.save(message);

        session.getTransaction().commit();
        session.close();
    }
}
