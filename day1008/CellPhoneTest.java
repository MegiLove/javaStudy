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
	 System.out.println("������ �������ϴ�");
	onoff=true;
   }
    public void off(){
	 System.out.println("������ �������ϴ�");
	onoff=false;
   }
   public void camon(){
	 System.out.println("ī�޶� �ֽ��ϴ�");
	camera=true;
   }

   public void camoff(){
	 System.out.println("ī�޶� �����ϴ�");
	camera=false;
   }


}

class CellPhoneTest 
{
	public static void main(String[] args) 
	{ 
		int a;
		CellPhone cell= new CellPhone();
		cell.setModel("������13");
		cell.setCompany("�ֻ�");
		cell.setColor("ȭ��Ʈ");
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