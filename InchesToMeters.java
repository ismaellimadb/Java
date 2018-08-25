class InchesToMeters{
	
	public static void main(String args[]){
		double meter, inche;
		int counter;
		
		counter = 0;
		for(meter = 1; meter <= 120; meter++)
		{
			inche = meter * 39.37;
			System.out.println(meter + " meter is " + inche + " inches. ");
			counter++;
			
		if (counter == 12){
			System.out.println();
			counter = 0;
		}
		}
	}

}