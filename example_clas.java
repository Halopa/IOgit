class Lamp {
  // instance variable
  private boolean isOn;
  private int power;
  // method
  public void turnOn() {
    isOn = true;
  }
  // method
  public void turnOff() {
  	isOn = false;
  }
  public int getPower(){
	  return this.power;
  }
  public void destroy(){
	  System.out.println("Destroyed");
  }
  public void setPower(int x){
	  this.power=x;
  }
}