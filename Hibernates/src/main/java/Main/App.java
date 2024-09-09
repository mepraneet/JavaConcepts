package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.User;

public class App {

	public static void main(String[] args) {
		
		
		 
		User user = new User();
		user.setId(3);
		user.setEmail("Mukta@gmail.com");
		user.setPassword("7744");
		user.setGender("Female");
		user.setCity("Pimpri");
		user.setName("Mukta");
		
		Configuration cfg = new Configuration();
		cfg.configure("config/hibernate.cfg.xml"); // Provide path of XML file here
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
			//-------------insert operation---------------
		
//					try
//					{
//						session.save(user);
//						transaction.commit();
//						
//						System.out.println("User details added successfully !");
//					}
//					catch(Exception e)
//					{
//						transaction.rollback();
//						e.printStackTrace();
//					}
	
		
		
		
		//-------------Select operation---------------
		
//		try
//		{
//			User user1 = session.get(User.class, 1L);
//			System.out.println(user1.getId());
//			System.out.println(user1.getName());
//			System.out.println(user1.getEmail());
//			System.out.println(user1.getGender());
//			System.out.println(user1.getCity());
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
	
		
		//-------------Update operation---------------
		
//				try
//				{
//					User user1=session.get(User.class, 3L);
//					user1.setCity("Pune");
//					
//					session.saveOrUpdate(user1);
//					transaction.commit();
//					
//					System.out.println("User details Update successfully !");
//				}
//				catch(Exception e)
//				{
//					transaction.rollback();
//					e.printStackTrace();
//					
//					System.out.println("User details not Update !");
//
//				}
		
		
		//-------------Delete operation---------------
		
		try
		{
			User user1 = new User();
			user1.setId(3L);
			
			session.delete(user1);
			transaction.commit();
			
			System.out.println("User details Delete successfully !");
		}
		catch(Exception e)
		{
			transaction.rollback();
			e.printStackTrace();
			
			System.out.println("User details not Delete !");

		}
		
		
	}

}
