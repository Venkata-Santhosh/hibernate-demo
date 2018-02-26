package client;

import configs.HibernateUtil;
import entities.Message;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MessageClient {

    public  static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction txt = session.beginTransaction();
        try {
            Message message = new Message( "Hello World with transcation stuff " );

            session.save(message);

            txt.commit();
        }catch (Exception e) {
            if(txt!=null) {
                txt.rollback();
            }
            e.printStackTrace();
        }finally {
            if (session != null) {
                session.close();
            }
        }

    }
}
