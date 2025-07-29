import java.util.*;

public class Area{

double height,base,result;
public double area(){
result = (0.5)*height*base;
return result;
}

public static void main(String args[]){

Area a = new Area();
Scanner sc = new Scanner(System.in);
System.out.println("Eneter height and base");
a.base = sc.nextDouble();
a.height=sc.nextDouble();
System.out.println("result is "+a.area());
}
}

