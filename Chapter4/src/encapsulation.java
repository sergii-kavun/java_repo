class encapsulation {
	private String name;
	private Integer size;
	
	// to encapsulate insatanse variable we need to create seeters and geeters for all inst variables
	// to not be able to change variables directly
	// and to protect them from stupid and incorrect values and to build some validation logic inside setters and geeters
	
	// to hide date we need to use private and public acceess modifiers !
	// as an encapsulation rule: mark insatnce variables as PRIVATE and provide PUBLIC getters and setters.
	// this will protect insatance variables from inccorect values by implementing validation in methods
	// it also helps to not break someones code if you changes something and other based their code on yours
	
	
	public void setName(String eName) {
		if (eName.length() > 10) {
		name = eName;
		} else {
			name = null;
			System.out.println("That is not valid Name lenght"); // here is some validation checks in the code for method parametr
		}
	}
	
	public String getName () {
		return name;
	}
	
	public void setSize (int ss) {
		if (ss >= 5) {
			size = ss;
		} else {
			size = null;
		}
	}
	
	public Integer getSize () {
			return size;
	}	
	
	public encapsulation makeAllGood () {
		encapsulation e11 = new encapsulation();
		e11.setName("10syymbolssss");
		e11.setSize(10);
		return e11;
	}
}