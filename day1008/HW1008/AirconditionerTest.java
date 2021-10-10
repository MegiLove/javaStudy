class Airconditioner
{  
	private String model;
	private String company;
	private boolean onoff;
    private boolean dry;
    
	public String getModel(){
		return model;
	}
	public String getCompany(){
		return company;
	}
	public boolean getOnoff(){
		return onoff;
	}
	public boolean getDry(){
		return dry;
	}
	public void setModel(String a){
		model= a;
	}
	public void setCompany(String a){
		company= a;
	}
	public void setOnoff(boolean a){
		onoff= a;
	}
	public void setDry(boolean a){
		dry= a;
	}
  
   public void on(){
	 System.out.println("전원이 켜졌습니다");
	onoff=true;
   }
    public void off(){
	 System.out.println("전원이 꺼졌습니다");
	onoff=false;
   }
   public void dryon(){
	 System.out.println("건조기능이 있습니다");
	dry=true;
   }

   public void dryoff(){
	 System.out.println("건조기능이 없습니다");
	dry=false;
   }


}

class AirconditionerTest
{
	public static void main(String[] args) 
	{ 
		int a;
		Airconditioner air= new Airconditioner();
		air.setModel("MA67");
		air.setCompany("샘성");
		air.setOnoff(true);
		air.setDry(true);
		System.out.println(air.getModel());
		System.out.println(air.getCompany());
		System.out.println(air.getOnoff());
		System.out.println(air.getDry());
		air.off();
		air.dryoff();
		System.out.println(air.getOnoff());
		System.out.println(air.getDry());
		

	}
}
