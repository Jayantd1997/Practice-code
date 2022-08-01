import java.awt.print.Printable;

public class Mobile {
	String name;
	Type type;
	
	Mobile( String name, Type type){
		this.name= name;
		this.type= type;	
	}
	void print() {
		System.out.println("mobile name = "+name+" and"+" mobile type = " +type.getType());
	}
	void boot() {
		int i;
		for(i=0;i<10;i++){
		System.out.println("starting...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Mobile mobile = new Mobile("samsung",Type.FIVE_G );

   System.out.println(mobile.name+ " " +mobile.type.getType());
   mobile.print();
   mobile.boot();
	}
}
