// LOCAL variables vs INSTANCE variables
// Instance variables are those whcih declared inside a class but not within a method

class LocalVsInstanceVariables {
	
		private String FishName; // This is instance variable
		private byte FishSize = 10; // This is instance variable
		
		
		// LOCAL variables are declared within a method to operate inside
		// Local variables must be declared before we can use them
		// LOCAL variables do not get a default values;
		// LOCAL variables have to be initialized before usage;
		// Methods parametrs are LOCAL variables; But compiler will not be arguying that you have not initialize this variable;
		
		
		public int getFishSize() {
			int NewSizeOfFish;
			NewSizeOfFish = FishSize*2; // THis is LOCAL variable used in getFishSize method
			return NewSizeOfFish;
		}

		//----------------------------------------------------------------------------------------//
		
				
}