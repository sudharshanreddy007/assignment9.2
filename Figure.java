package areaAndperimeter;



	abstract class Figure1{  //A class that is declared as abstract is known as abstract class.

	    double area,perimeter;  //we are taking double data type of variables 

	    abstract void findArea();//A method which is declared and not  implemented is known as abstract method

	    abstract void findPerimeter();

	    

	}

	  class Circle extends Figure1{// here this class extended the abstract 

	 	    

	 	     double pi=3.141, radius =5;

	 	               void  findArea(){ //and implemented the methods of abstract class

	 	    

					area = pi*radius*radius; // here we are showing area of circle

					System.out.println("Area of circle : "+area);

	 	     }

		

				void findPerimeter() {

					perimeter = 2*pi*radius; //perimeter of circle

					System.out.println("Perimeter of circle : "+perimeter);
					//System is a final class in java.lang package
					//out is a static member field of system class and it's type PrintStream
					//println is a method of PrintStream class and it means print in next line
					//Inside the brackets is value which to be printed		

				} 

	  }

	 	

	  class Rectangle  extends Figure1 {     //here another subclass extended the  abstract class

	 	 

	 	 double width=60,height=30;

	 	             void findArea(){  //here we are implementing the method 

	 	            	 area = width * height;

	 	            	 System.out.println("Area of Rectangle : "+area);

	 	            	 

	 	             }

	 	         void findPerimeter(){

	 	        	 perimeter = 2*(width + height);

	 	        	 System.out.println("Perimeter of Rectangle : "+perimeter);

	 	        	 

	 	             }

	  }

	    

	  class Triangle extends Figure1 {       //here another subclass extended the Figure class which is abstract     

	 	   

	 	 double  side1=10,side2=20,side3=15;

	 	 double  base = 20,height = 15;

	 	            void findArea(){ //area of triangle

	 	            	area = (base * height)/2;

	 	            	System.out.println("Area of Triangle : "+area);  

	 	            	

	 	            	

	 	            }

	 	          void findPerimeter(){ //perimeter of triangle

	 	        	   perimeter = side1 + side2 +side3;

	 	        	   System.out.println("Perimeter of Triangle : "+perimeter);

	 	        	    

	 	           }

	  }

	                                          
	  
	

	    public class Figure {//here we have created the main class

	 	   public static void main(String[]args){  //it is main method 

	 		   

	 		   Circle circle = new Circle(); //here we cannot instantiate the object of an abstract class

	 		   Rectangle rectangle = new Rectangle(); //so we created the objects of subclasses which defined methods in it 

	 		   Triangle triangle = new Triangle();

	 		   

	 	circle.findArea(); //here it display the details

	 	circle.findPerimeter();

	 	rectangle.findArea();

	 	rectangle.findPerimeter();

	 	triangle.findArea();

	 	triangle.findPerimeter();

	 		   

	 	   }



	}

