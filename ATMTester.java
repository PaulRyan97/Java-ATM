class ATMTester {
	
	public static void main(String[] args) {

		int[] euroDenoms = {5, 10, 20, 50}; // denominations, i.e. what kinds of notes we use
		ATM atm1 = new ATM("euro", euroDenoms); // create an ATM

		int[] dollarDenoms = {1, 5, 10, 20, 50, 100}; // denominations, i.e. what kinds of notes we use
		ATM atm2 = new ATM("dollar", dollarDenoms); // create an ATM

		int[] kronurDenoms = {1000, 5000, 500, 2000, 10000}; // note: don't assume the notes are in a particular order
		ATM atm3 = new ATM("Icelandic kronur", kronurDenoms); // create another ATM for a different currency

		atm1.load(1, 5); // load it with 1 x 5 euro notes
		atm1.load(3, 20); // load it with 3 x 20 euro notes
		atm1.load(2, 50); // load it with 2 x 50 euro notes
		atm2.load(7, 100); // load it with 7 x 100 dollar notes
		atm2.load(34, 1); // load it with 34 x 1 dollar notes
		atm3.load(2, 1000); // load it with 2 x 1000 kronur notes
		atm3.load(9, 500); // load it with 9 x 500 euro notes
		System.out.println(atm1.getQty(20)); // print how many 20 euro notes the ATM contains
		System.out.println(atm2.getQty(1)); // print how many 1 dollar notes the ATM contains
		System.out.println(atm3.getQty(2000)); // print how many 2000 kronur notes the ATM contains
		System.out.println(atm1); // display the contents
		System.out.println(atm2); // display the contents
		System.out.println(atm3); // display the contents
		atm1.dispense(1, 50); // dispense 1 x 50 euro note to a customer
		atm2.dispense(6, 1); // dispense 6 x 1 dollar note to a customer
		atm2.dispense(1, 100); // dispense 1 x 100 dollar note to a customer
		atm3.dispense(1, 500); // dispense 1 x 500 kronur note to a customer
		System.out.println(atm1.getTotal() + " " + atm1.getCurrency()); // print total and currency
		System.out.println(atm2.getTotal() + " " + atm2.getCurrency()); // print total and currency
		System.out.println(atm3.getTotal() + " " + atm3.getCurrency()); // print total and currency
            






	}
}