public class Person {


    int height ;
    int weight ;
 //parameterised constructor
    Person(int height, int weight){


        this.height = height;
        this.weight = weight;


}
//copy constructor
Person(Person another){


    height = another.height;
    weight= another.weight;
}






public static void main(String[] args) {
    Person obj = new Person(54,85);
    Person obj2 = new Person(obj);


    System.out.println(obj2.height);
   
}


}
