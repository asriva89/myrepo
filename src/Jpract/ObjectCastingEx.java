package Jpract;


class Car extends Object{
    	void carMethod() {
    		System.out.println("I am Card MEthod defined in Class Car");
    		
    }
} 

class HeavyVehicle extends Object{
	
}

class Ford extends Car { 
    	void fordMethod () {
    		System.out.println("I am fordMethod defined in Class Ford");
    } 
    	void carMethod(){
    		System.out.println("HI..........");
    	}
} 

class Honda extends Car { 
	void fordMethod () {
		System.out.println("I am fordMethod defined in Class Ford");
	} 
} 




public class ObjectCastingEx{
  public static void main(
                        String[] args){
	  Ford f= new Ford();
	  f.carMethod();
	  
	  
	  Car c= new Car();
	  c.carMethod();
	  boolean x= f instanceof  Ford;
	  System.out.println(x);
	  x= f instanceof  Car;
	  System.out.println(x);
	  x= c instanceof  Ford;
	  System.out.println(x);
	  
	 Car z=new Ford();
	 System.out.println("GAME");
	 
	 z.carMethod();
	 
	 
	 
	// f =(Ford)z;
	 
	 
	  //((Ford)c).fordMethod();
	 
	  
	  Car obj = new Ford();
	 
//    Following will result in compilation error
  ((Ford)obj).fordMethod();	//As the method fordMethod is undefined for the Car Type
//  Following will result in compilation error
//    ((HeavyVehicle)obj).fordMethod();    //As the method fordMethod is undefined for the HeavyVehicle Type
//  Following will result in compilation error
    
	//((Ford)obj).fordMethod();
    
    //Following will compile and run
//	Honda hondaObj = (Ford)obj;	Cannot convert from Ford to Honda as they are sibblings

  }
}