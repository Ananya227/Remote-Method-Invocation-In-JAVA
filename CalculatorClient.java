import jva.rmi.Registry.LocateRegistry;
import java,rmi.registry.Registry;
import java.io.*;

public class CalculatorClient{
public static void main(String args[]) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

double a = 5;
double b =5;

try{

Registry registry = LocateRegistry.getRegistry("LocalHost" , 1099);
Calculator cal = (Calculator)registry.lookUp("CalculatorServer");
System.out.println("sum of" +a+" and "+b+" is: "+cal.add(a,b));
System.out.println("sub of" +a+" and "+b+" is: "+cal.sub(a,b));

System.out.println("mul of" +a+" and "+b+" is: "+cal.mul(a,b));
System.out.println("div of" +a+" and "+b+" is: "+cal.div(a,b));

}
catch(Exception e)
{


}
}

}

