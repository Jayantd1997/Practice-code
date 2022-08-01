class A1  
{  
    A1 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A1");  
    }  
}  
  
  
// A2 is the child class of A1  
class A2 extends A1  
{  
    @Override  
    A1 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A2");  
    }  
}  
  
// A3 is the child class of A2  
class A3 extends A2  
{  
    @Override  
    A1 foo()  
    {  
        return this;  
    }  
      
    @Override  
    void print()  
    {  
        System.out.println("Inside the class A3");  
    }  
}  

public class Main {

	public static void main(String[] args) {
		A1 a = new A1();
		a.foo().print();
		
		A2 b = new A2();
		b.foo().print();
		
		A3 c = new A3();
		(c.foo()).print();

	}

}
