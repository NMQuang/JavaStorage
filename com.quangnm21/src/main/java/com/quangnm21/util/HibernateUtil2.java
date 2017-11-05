package com.quangnm21.util;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateUtil2 {

	private static final SessionFactory sessionFactory ;



    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

		/*try {
			Configuration configuration = new Configuration();
		       // Mﾃ｡ﾂｺﾂｷc ﾃ�窶佚｡ﾂｻ窶ｹnh nﾃδｳ sﾃ｡ﾂｺﾂｽ ﾃ�窶佚｡ﾂｻ�ｿｽc cﾃ｡ﾂｺﾂ･u hﾃδｬnh trong file hibernate.cfg.xml
		       // Bﾃ｡ﾂｺﾂ｡n cﾃδｳ thﾃ｡ﾂｻﾆ� chﾃ｡ﾂｻ窶ｰ ﾃ�窶佚｡ﾂｻ窶ｹnh rﾃδｵ file nﾃ｡ﾂｺﾂｿu muﾃ｡ﾂｻ窶蕨:
		       // configuration.configure("hiberante.cfg.xml");
		       configuration.configure();

		       ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
		               .applySettings(configuration.getProperties()).build();

		       // Tﾃ｡ﾂｺﾂ｡o ﾃ�窶佚｡ﾂｻ窶亙 tﾃ�ﾂｰﾃ｡ﾂｻﾂ｣ng SessionFactory
		       SessionFactory sessionFactory = configuration
		               .buildSessionFactory(serviceRegistry);
		       return sessionFactory;
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}*/

	}

	public static Session openSession() {
		return sessionFactory.openSession();
	}

	public static void shutdown() {
		// Close caches and connection pools
		sessionFactory.close();
	}

}