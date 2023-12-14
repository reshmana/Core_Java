package com.Xworkz2.view.reshma;

public abstract class Palace {
  private  String name;
  private String location;
  private double pincode;

  public Palace(String name, String location , double pincode){
      this.name=name;
      this.location=location;
      this.pincode=pincode;
  }
  public  Palace(String location){
      this.location=location;
  }
  public Palace(double pincode){
      this.pincode=pincode;
  }

    @Override
    public String toString() {
        return "palace name"+this.name+","+"location"+this.location+","+"pincode"+this.pincode;
    }
    public abstract void drinage();
}
