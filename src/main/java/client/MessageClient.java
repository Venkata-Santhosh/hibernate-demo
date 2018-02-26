package client;

import configs.HibernateUtil;
import entities.Message;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class MessageClient {

    private static Logger LOGGER = Logger.getLogger(MessageClient.class.getName());

    public  static void main(String[] args) {
        LOGGER.info("hey this is santhosh");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        LOGGER.info("hey this is santhosh");

        Message message = new Message( "Hello World with Hibernate " );

        session.save(message);

        session.getTransaction().commit();
        session.close();
        LOGGER.info("hey this is santhosh");

    }
}
