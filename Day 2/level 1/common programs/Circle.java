class Circle {


    float radius ;
    //creating parameterised constructor
     Circle (float radius){
        this();       //constructor chaining
        this.radius = radius;
    }
     


    //default constructor
    Circle(){
       
    }
    //method to calculate and display area
    void calculateArea(){
      System.out.println("circumference of circle is " + 2*Math.PI*radius)    ;    
      System.out.println("area of circle is " + Math.PI*radius*radius)    ;  
    }
    public static void main (String args[] ){
        float radius = 2 ;
        //creating object for circle class
        Circle obj = new Circle(radius);
        obj.calculateArea();


    }


}
