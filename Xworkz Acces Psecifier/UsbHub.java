package com.xworkz.objects.classes;

public class UsbHub {
   public int totalPorts;
   double TransferRate;
   double batteryRequired;

    public UsbHub(int totalPorts,double TransferRate,double batteryRequired){
        this.totalPorts=totalPorts;
        this.TransferRate=TransferRate;
        this.batteryRequired=batteryRequired;
    }

    @Override
    public boolean equals(Object obj) {

        UsbHub usbLeftSide=this;
        if(obj!=null){

            if(obj instanceof UsbHub) {
                UsbHub usbRightSide=(UsbHub) obj;

                System.out.println("same on both side");

                if (usbLeftSide.totalPorts == usbRightSide.totalPorts && usbLeftSide.TransferRate == usbRightSide.TransferRate && usbLeftSide.batteryRequired==usbRightSide.batteryRequired) {

                    System.out.println("usbRightSide and usbLightSide is same");
                    return true;
                } else {
                    System.err.println("usbRightSide and usbLightSide is not same");
                }
            }
        }
        else{
            System.err.println("null is passed");
        }

        return false;
    }



}
