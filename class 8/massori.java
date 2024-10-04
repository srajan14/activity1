class hillstation{
    void location(){
        System.out.println("location is");
    } 
    void famousfor(){
        System.out.println("famous for");
    }
}
class manali extends hillstation{
void location(){
    System.out.println("manali is in himachal pradesh");
}
void famousfor(){
    System.out.println("famous for temples");
}
}

 class  massori extends hillstation {
    void location(){
        System.out.println("massori is in uttrakhand");
    }
    void famousfor(){
        System.out.println("it is famous for education institution");
    }
}
class gulmarg extends hillstation{
    void location(){
        System.out.println("gulmarg is in j&k");
    }
    void famousfor(){
        System.out.println(" it is famous for skeiing");
    }
}
class prg {
    public static void main(String[] args) {
        hillstation a= new hillstation();
        hillstation m=new manali();
        hillstation mu=new massori();
        hillstation g=new gulmarg();
        a.location();
        a.famousfor();
        m.location();
        m.famousfor(); 
        mu.location();
        mu.famousfor();
        g.location();
        g.famousfor();
    }

}