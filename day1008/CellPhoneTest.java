class CellPhone
{  
	private String model;
	private String company;
	private String color;
	private boolean onoff;
    private boolean camera;
    
	public String getModel(){
		return model;
	}
	public String getCompany(){
		return company;
	}
	public String getColor(){
		return color;
	}
	public boolean getOnoff(){
		return onoff;
	}
	public boolean getCamera(){
		return camera;
	}
	public void setModel(String a){
		model= a;
	}
	public void setCompany(String a){
		company= a;
	}
	public void setColor(String a){
		color= a;
	}
	public void setOnoff(boolean a){
		onoff= a;
	}
	public void setCamera(boolean a){
		camera= a;
	}
  
   public void on(){
	 System.out.println("전원이 켜졌습니다");
	onoff=true;
   }
    public void off(){
	 System.out.println("전원이 꺼졌습니다");
	onoff=false;
   }
   public void camon(){
	 System.out.println("카메라가 있습니다");
	camera=true;
   }

   public void camoff(){
	 System.out.println("카메라가 없습니다");
	camera=false;
   }


}

class CellPhoneTest 
{
	public static void main(String[] args) 
	{ 
		int a;
		CellPhone cell= new CellPhone();
		cell.setModel("아이펀13");
		cell.setCompany("애뿔");
		cell.setColor("화이트");
		cell.setOnoff(true);
		cell.setCamera(true);
		System.out.println(cell.getModel());
		System.out.println(cell.getCompany());
		System.out.println(cell.getColor());
		System.out.println(cell.getOnoff());
		System.out.println(cell.getCamera());
		cell.off();
		cell.camoff();
		System.out.println(cell.getOnoff());
		System.out.println(cell.getCamera());
		

	}
}
