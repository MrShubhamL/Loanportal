package conn;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {
	private static SessionFactory fact;
	
	public static SessionFactory getFact() {
		fact = new Configuration().configure().buildSessionFactory();
		return fact;
	}
	
}
