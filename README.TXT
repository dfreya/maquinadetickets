public class TrainStation
{
	private TicketMachine machine1;
	private TicketMachine machine2;
	private int totalMoney;

	public TrainStation()
	{
		machine1 = new TicketMachine(300);
		machine2 = new TicketMachine(200);
		totalMoney = 0;
	}
  
	public void printTotalMoney()
	{
		totalMoney = machine1.getTotal();
		totalMoney = totalMoney + machine2.getTotal();
  		System.out.println(totalMoney);
	}
}