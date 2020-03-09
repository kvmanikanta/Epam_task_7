package Factory;

public class Mainfactory {

public static void main(String[] args) {

		
		SmartWorker sw = new SmartWorker();
		Factory mn = new Factory(sw);
		mn.ManageWork();
		
		LazyWorker lw = new LazyWorker();
		Factory mn2 = new Factory(lw);
		mn2.ManageWork();
		
		ExtraordinaryWorker ew = new ExtraordinaryWorker();
		Factory mn3 = new Factory(ew);
		mn3.ManageWork();

	}

}