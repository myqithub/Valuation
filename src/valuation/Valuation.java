package valuation;
import java.io.IOException;
/**
 * @author: Veysel Dogan 
 * Date: 13-Aug-2018 
 * Console Application: Valuation
 * Main Class
 */
public class Valuation {
    public static void main(String[] args) throws IOException {
       char selected; 
        do {
            System.out.println("Welcome");
            System.out.println(" 1.Actual ");
            System.out.println(" 2.Transfer ");
            System.out.println(" 3.Send Credits ");
            System.out.println(" 4.Create New Account ");
            System.out.println(" 5.Show Limits ");
             System.out.println(" Please select menu ");//in here show my list and wait for users make a choice 
            selected = (char) System.in.read();//the user selected 
        } while (selected<'1'|| selected>'5');//my list between 1 and 5
        System.out.println("\n");
            
        switch(selected){//ı use switch because ı have a menu and this is best choice 
            case '1':
                System.out.println("chosen Actual List");
                break;
                 case '2':
                System.out.println("chosen Transfer List");
                break;
                 case '3':
                System.out.println("chosen Credits List");
                break;
                 case '4':
                System.out.println("chosen New Account");
                break;
                 case '5':
                System.out.println("chosen Limit List ");
                break;
        }
    }
}
