package Exception_Handling;

public class Sample1{

public  static void main(Strings[] args){

try{

int a=30,b=0,c;
c=a/b;
System.out.println("result = "+c);
}

catch(ArithmeticException e){
System.out.println("Can't divide a number by zero");
}

}
}