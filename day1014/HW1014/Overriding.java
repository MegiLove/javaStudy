class Speaker {
	private int volume;
    	public void showState() {
    		System.out.println("Volume size : " + volume);
    	}
    	public void setVolume(int vol) {
    		volume = vol;
    	}
}
class BaseSpeaker extends Speaker {
	private int baseRate;
    	public void showState() {
        	super.showState(); // ���� Ŭ������ �������̵� �� �޼ҵ� ȣ��
            	System.out.println("Base size : " + baseRate);
        }
        public void setBase(int base) {
        	baseRate = base;
        }
}
class Overriding {
	public static void main(String[] args) {
    		BaseSpeaker bs = new BaseSpeaker();
       		bs.setVolume(10); // BaseSpeaker�� Speaker�� ��������Ƿ� ����!
       		bs.setBase(20);
       		bs.showState();
    	}
}