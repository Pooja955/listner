package listiner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Demolisitiner implements ServletContextListener, ServletContextAttributeListener {
    public Demolisitiner() {
    }
    public void attributeAdded(ServletContextAttributeEvent event)  {
    	System.out.println("attribute Added");
    }
    public void attributeRemoved(ServletContextAttributeEvent event)  {
    	System.out.println("attribute Removed");
    }
    public void contextDestroyed(ServletContextEvent sce)  {
    	System.out.println("context Destroyed");
    }
    public void attributeReplaced(ServletContextAttributeEvent event)  { 
    	System.out.println("attribute Replaced");
    }
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("context Initialized");
    }
	
}
