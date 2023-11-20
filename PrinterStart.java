class PrinterStart {
    public static void main(String[] args) {
        System.out.println("Main method is started");

        Printer printer = new Printer();
        System.out.println("Brand of printer is: " + printer.Brand);
        System.out.println("Type of printer is: " + printer.Type);
        System.out.println("Capacity of printer is: " + printer.Capacity);
        System.out.println("NoOFPages of printer is: " + printer.NoOFPages);
        System.out.println("Collate of printer is: " + printer.Collate);
		
		
		Printer printer1 = new Printer("Lexmark");
        System.out.println("Brand of printer is: " + printer1.Brand);
        System.out.println("Type of printer is: " + printer1.Type);
        System.out.println("Capacity of printer is: " + printer1.Capacity);
        System.out.println("NoOFPages of printer is: " + printer1.NoOFPages);
        System.out.println("Collate of printer is: " + printer1.Collate);
		
		
		Printer printer2 = new Printer("Lexmark","Ink-jet");
        System.out.println("Brand of printer is: " + printer2.Brand);
        System.out.println("Type of printer is: " + printer2.Type);
        System.out.println("Capacity of printer is: " + printer2.Capacity);
        System.out.println("NoOFPages of printer is: " + printer2.NoOFPages);
        System.out.println("Collate of printer is: " + printer2.Collate);
		
		
		Printer printer3 = new Printer("Lexmark","Ink-jet",15);
        System.out.println("Brand of printer is: " + printer3.Brand);
        System.out.println("Type of printer is: " + printer3.Type);
        System.out.println("Capacity of printer is: " + printer3.Capacity);
        System.out.println("NoOFPages of printer is: " + printer3.NoOFPages);
        System.out.println("Collate of printer is: " + printer3.Collate);
		
		Printer printer4= new Printer("Lexmark","Ink-jet",15,200,true);
        System.out.println("Brand of printer is: " + printer4.Brand);
        System.out.println("Type of printer is: " + printer4.Type);
        System.out.println("Capacity of printer is: " + printer4.Capacity);
        System.out.println("NoOFPages of printer is: " + printer4.NoOFPages);
        System.out.println("Collate of printer is: " + printer4.Collate);

        System.out.println("Main method is ended");
    }
}
