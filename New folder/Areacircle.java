import java.util.*;

public class Areacircle{

double r,result;
public double area(){
result = (3.14)*r*r;
return result;
}

public static void main(String args[]){

Areacircle a = new Areacircle();
Scanner sc = new Scanner(System.in);
System.out.println("Eneter radius");
a.r = sc.nextDouble();

System.out.println("result is "+a.area());
}
}

