class ATM {
	String currency;
	int[] quantities;
	int[] denoms;

	
	public ATM(String curr, int[] denominations){
		currency = curr;
	 	denoms = new int[denominations.length];
		for (int i = 0; i < denoms.length; i = i + 1){
			denoms[i] = denominations[i];
		}
		quantities = new int[denoms.length];
		for (int i = 0; i < denoms.length; i = i + 1){
				quantities[i] = 0;

			
		}
		for (int i = 0; i < quantities.length; i = i + 1) {
			System.out.println(quantities[i]);
			
		}
		System.out.println("Initial done");
		}


	public void load(int qty, int denomination){
		for (int i = 0; i < denoms.length; i = i + 1){
			if (denoms[i] == denomination){
				quantities[i] += qty;
			}
		}
		for (int i = 0; i < quantities.length; i = i + 1) {
			System.out.println(quantities[i]);
		}
		System.out.println("load done");
		}

	public void dispense(int qty, int denomination){
		for (int i = 0; i < denoms.length; i = i + 1){
			if (denoms[i] == denomination){
				quantities[i] -= qty;
			}
		}
		for (int i = 0; i < quantities.length; i = i + 1) {
			System.out.println(quantities[i]);
		}
	}

	public int getQty(int denomination){
		for (int i = 0; i < denoms.length; i = i + 1){
			if (denoms[i] == denomination){
				return quantities[i];
			}
			}
			return 1;
		}

	public String toString(){
		String contents = "";
		for (int i = 0; i < denoms.length; i = i + 1){
			contents = contents + ( " " + quantities[i] + " " + "x" + " " + denoms[i] + " " + currency + ";");
		}
		return contents;

	}
	




	}
	
