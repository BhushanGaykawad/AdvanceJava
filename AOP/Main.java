package mypack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("aopdemo3.xml");
        Product product=(Product)ac.getBean("p1");
System.out.println(product.getClass().getName());
product.display();
        int result=product.multiply(10,20);
        System.out.println("First Result\t"+result);
       
    }
}









