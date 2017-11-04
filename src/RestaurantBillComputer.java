
public class RestaurantBillComputer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		double totalBill;
		double billSubtotal=20;
		double taxRate=5;
		double taxAmount;
		double tipPercentage;
		double tipAmount;
		taxAmount=billSubtotal*(taxRate/100);
		
		//calculate total bill for 15% tip percentage
		tipPercentage=15;
		tipAmount=billSubtotal*(tipPercentage/100);
		totalBill=billSubtotal+taxAmount+tipAmount;
		System.out.println("With a 15% tip your total would be $"+ totalBill);
		
		//calculate total bill for 18% tip percentage
		tipPercentage=18;
		tipAmount=billSubtotal*(tipPercentage/100);
		totalBill=billSubtotal+taxAmount+tipAmount;
		System.out.println("With a 18% tip your total would be $"+ totalBill);
		
		//calculate total bill for 20% tip percentage
		tipPercentage=20;
		tipAmount=billSubtotal*(tipPercentage/100);
		totalBill=billSubtotal+taxAmount+tipAmount;
		System.out.println("With a 20% tip your total would be $"+ totalBill);
		
		}
	
	}
