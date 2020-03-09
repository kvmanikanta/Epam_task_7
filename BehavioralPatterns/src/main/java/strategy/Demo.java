package strategy;
import strategy.FacebookStrategy;
import strategy.TwitterStrategy;
public class Demo {
	    public static void main(String[] args) {
	        SocialMediaContext context = new SocialMediaContext();
	 
	        // Setting Facebook strategy.
	        context.setSocialmediaStrategy(new FacebookStrategy());
	        context.connect("Lokesh");       
	        System.out.println("====================");
	        // Setting GooglePlus strategy.
	        context.setSocialmediaStrategy(new GooglePlusStrategy());
	        context.connect("Lokesh");
	        System.out.println("====================");
	        // Setting Orkut strategy.
	        context.setSocialmediaStrategy(new OrkutStrategy());
	        context.connect("Lokesh");
	    }
	}