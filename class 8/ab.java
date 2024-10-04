abstract class objects {
abstract void showshape();
public void shape(){
    System.out.println("i am from abstract class");
}

    
}
class sphere extends objects{
void showshape(){
    System.out.println("object type is sphere");
}
}
class cubiod extends objects{
void showshape(){
    System.out.println("object type is cuboid");
}
}
class prism extends objects{
void showshape(){
    System.out.println("object type is prism");
}
}
public class ab {
    public static void main(String[] args) {
       objects a=new sphere();
       a.showshape();
       a=new cubiod();
       a.showshape();
       a=new prism();
       a.showshape();
       a.shape(); 
    }
}
