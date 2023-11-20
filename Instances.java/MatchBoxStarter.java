class MatchBoxStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in MatchBoxStarter");

        MatchBox matchBox = new MatchBox("Home");
        System.out.println("MatchBox brand is " + matchBox.brand);
        System.out.println("MatchBox noOfStick is: " + matchBox.noOfStick);
        System.out.println("MatchBox lengthInCm is: " + matchBox.lengthInCm);
        System.out.println("MatchBox priceRs: " + matchBox.priceRs);
        System.out.println("MatchBox size is: " + matchBox.size);
        System.out.println("MatchBox weightInInch is: " + matchBox.weightInInch);
        System.out.println("MatchBox Type is: " + matchBox.Type);

        MatchBox matchBox1 = new MatchBox("Home", 50);
        System.out.println("MatchBox1 brand is: " + matchBox1.brand);
        System.out.println("MatchBox1 noOfStick is: " + matchBox1.noOfStick);
        System.out.println("MatchBox1 lengthInCm is: " + matchBox1.lengthInCm);
        System.out.println("MatchBox1 priceRs: " + matchBox1.priceRs);
        System.out.println("MatchBox1 size is: " + matchBox1.size);
        System.out.println("MatchBox1 weightInInch is: " + matchBox1.weightInInch);
        System.out.println("MatchBox1 Type is: " + matchBox1.Type);

        MatchBox matchBox2 = new MatchBox("Home", 50,10);
        System.out.println("MatchBox2 brand is: " + matchBox2.brand);
        System.out.println("MatchBox2 noOfStick is: " + matchBox2.noOfStick);
        System.out.println("MatchBox2 lengthInCm is: " + matchBox2.lengthInCm);
        System.out.println("MatchBox2 priceRs: " + matchBox2.priceRs);
        System.out.println("MatchBox2 size is: " + matchBox2.size);
        System.out.println("MatchBox2 weightInInch is: " + matchBox2.weightInInch);
        System.out.println("MatchBox2 Type is: " + matchBox2.Type);
		
		MatchBox matchBox3 = new MatchBox("Home", 50,10,100.0);
        System.out.println("MatchBox3 brand is: " + matchBox3.brand);
        System.out.println("MatchBox3 noOfStick is: " + matchBox3.noOfStick);
        System.out.println("MatchBox3 lengthInCm is: " + matchBox3.lengthInCm);
        System.out.println("MatchBox3 priceRs: " + matchBox3.priceRs);
        System.out.println("MatchBox3 size is: " + matchBox3.size);
        System.out.println("MatchBox3 weightInInch is: " + matchBox3.weightInInch);
        System.out.println("MatchBox3 Type is: " + matchBox3.Type);
		
		MatchBox matchBox4 = new MatchBox("Home", 50,10,100.0,"wide");
        System.out.println("MatchBox4 brand is: " + matchBox4.brand);
        System.out.println("MatchBox4 noOfStick is: " + matchBox4.noOfStick);
        System.out.println("MatchBox4 lengthInCm is: " + matchBox4.lengthInCm);
        System.out.println("MatchBox4 priceRs: " + matchBox4.priceRs);
        System.out.println("MatchBox4 size is: " + matchBox4.size);
        System.out.println("MatchBox4 weightInInch is: " + matchBox4.weightInInch);
        System.out.println("MatchBox4 Type is: " + matchBox4.Type);
		
		MatchBox matchBox5 = new MatchBox("Home", 50,10,100.0,"wide",2);
        System.out.println("MatchBox5 brand is: " + matchBox5.brand);
        System.out.println("MatchBox5 noOfStick is: " + matchBox5.noOfStick);
        System.out.println("MatchBox5 lengthInCm is: " + matchBox5.lengthInCm);
        System.out.println("MatchBox5 priceRs: " + matchBox5.priceRs);
        System.out.println("MatchBox5 size is: " + matchBox5.size);
        System.out.println("MatchBox5 weightInInch is: " + matchBox5.weightInInch);
        System.out.println("MatchBox5 Type is: " + matchBox5.Type);
		
		MatchBox matchBox6 = new MatchBox("Home", 50,10,100.0,"wide",2,"srick");
        System.out.println("MatchBox6 brand is: " + matchBox6.brand);
        System.out.println("MatchBox6 noOfStick is: " + matchBox6.noOfStick);
        System.out.println("MatchBox6 lengthInCm is: " + matchBox6.lengthInCm);
        System.out.println("MatchBox6 priceRs: " + matchBox6.priceRs);
        System.out.println("MatchBox6 size is: " + matchBox6.size);
        System.out.println("MatchBox6 weightInInch is: " + matchBox6.weightInInch);
        System.out.println("MatchBox6 Type is: " + matchBox5.Type);

        System.out.println("Ending main in MatchBoxStarter");
    }
}
