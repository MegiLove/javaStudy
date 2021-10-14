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
        	super.showState(); // 상위 클래스의 오버라이딩 된 메소드 호출
            	System.out.println("Base size : " + baseRate);
        }
        public void setBase(int base) {
        	baseRate = base;
        }
}
class Overriding {
	public static void main(String[] args) {
    		BaseSpeaker bs = new BaseSpeaker();
       		bs.setVolume(10); // BaseSpeaker가 Speaker를 상속했으므로 가능!
       		bs.setBase(20);
       		bs.showState();
    	}
}