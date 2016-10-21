
/**
 * Write a description of class EstacionTren here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionTren
{
    // instance variables - replace the example below with your own
    private MaquinaTickets maquina1;
    private MaquinaTickets maquina2;
    private int dineroTotal;

    /**
     * Constructor for objects of class EstacionTren
     */
    public EstacionTren()
    {
        // initialise instance variables
        maquina1 = new MaquinaTickets(300);
        maquina2 = new MaquinaTickets(200);
        dineroTotal = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void mostraDineroTotal()
    {
        // put your code here
        dineroTotal = maquina1.obtenerTotal();
        dineroTotal = dineroTotal + maquina2.obtenerTotal();
        System.out.println(dineroTotal);
    }
    
    public void coprarBilletes()
    {
        maquina1.introducirDinero(300);
        maquina2.introducirDinero(200);
        maquina1.imprimirTicket();
        maquina2.imprimirTicket();
     }
}
