

class Student{
    int m1,m2;
    void getmarks(int x,int y){
        m1=x;
        m2=y;
    }
    void putmarks(){
        System.out.println("M1: "+m1);
        System.out.println("M2: "+m2);
    }
}
interface Sport{
    int sp=6;
    void spmarks();
}
class Result extends Student implements Sport{
    public void spmarks(){
        System.out.println("Sport marks "+sp);
    }
    void display(){
        putmarks();
        spmarks();
        int total = m1+m2+sp;
        System.out.println("Total : "+total);
    }
}
class Interface_pg  {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.getmarks(80,60);
        obj.display();
    }
    
}
