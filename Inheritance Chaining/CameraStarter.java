class CameraStarter {
    public static void main(String... args) {
        System.out.println("starting main method in CameraStarter");

        DigitalCamera digitalCamera=new DigitalCamera("Nikon",Colour.BLACK,164,4);
		  digitalCamera.show();
		  
		HandCamera handCamera=new HandCamera(2,"Canon",Colour.WHITE,164,5);
         handCamera.show();
        System.out.println("ending main method in CameraStarter");
    }
}
