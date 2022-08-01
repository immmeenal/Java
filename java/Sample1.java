package Exception_Handling;

public class Sample1{

public static void main(String[] args){

try{

int a=30,b=0,c;
c=a/b;
System.out.println("result = "+c);
}
catch(ArithmeticException e){
System.out.println("Can't divide a number by zero");
}

try{
int num = Integer.parseInt("Minal");
System.out.println(num);
}
catch(NumberFormatException e){
System.out.println("Number Format Exception");
}

try{
int a[] =new int[5];
a[7]=5;
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array index out of bound");
}

}
}