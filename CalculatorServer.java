import java.rmi.registry.LocateRegistry;
import  java.rmi.registry.Registry;

public class CalculatorServer{
public static void main(String args[])
{
try{

CalculatorImpl cal = new CalculatorImpl();

Registry registry = LocateRegistry.createRegistry(1099);
registry.bind("CalculatorService" , cal);

System.out.println("Calculator server is ready");

}

catch(Wxception e){
e.printStackTrace();

}

}

}
