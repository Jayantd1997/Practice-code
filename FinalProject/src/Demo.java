class Venue{
	void boot(){
		System.out.println("My name is jayant");
	}
}
public class Demo extends Venue{
	void boot(){
		System.out.println("My name is vikas");
		}
 
public static void main(String[] args) {
	Venue venue = new Demo();
	venue.boot();
}
}
