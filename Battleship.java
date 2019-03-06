// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package battleship;

public class Battleship extends Ship {
	
	Battleship(){
		this.length=4;
		for(int i=0;i<this.length;i++) {
			hit[i]=true;
		}
	}
	
	int getLength() {
	 return length; 	
	}
	
	@Override
	String getShipType() {
	 return "battleship";	
	}
}
