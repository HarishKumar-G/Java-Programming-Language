enum TrafficSignal {
	RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");
	
	private String action;
	
	public String getAction(){
		return this.action;
	}
	
	private TrafficSignal(String action){
		this.action = action;
	}
}

public class EnumConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrafficSignal[] Signals = TrafficSignal.values();
		
		for(TrafficSignal signal : Signals){
			System.out.println("Name: " + signal.name() + ", Action: " + signal.getAction());
		}
	}
}
