package mediator;
public class Mediator {
	   public static void main(String[] args) {
	      User raviteja = new User("raviteja");
	      User sivakumar = new User("sivakumar");

	      raviteja.sendMessage("Welcome to  Epam!");
	      sivakumar.sendMessage("Manikanta!");
	   }
	}