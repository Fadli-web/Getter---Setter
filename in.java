import java.util.Scanner;
public class in{
    public static void main(String[] args) {
        System.out.println(System.in);
       

       Instrument a = new Instrument("Guitar", 101.5);
       Instrument b = new Instrument("piano" , 200.0);
       Instrument c = new Instrument("Violin " ,150.0);

        a.setType("Guitar");
        a.setPrice(101.5); 
        a.setType ("piano");
        a.setPrice(200.0);
        a.setType("violin");
        a.setPrice(150.0);
        a.print();
        b.print();
        c.print();

    }

    
    }


