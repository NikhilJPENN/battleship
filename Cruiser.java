// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package battleship;

public class Cruiser extends Ship {

	Cruiser(){
		this.length=3;
		for(int i=0;i<this.length;i++) {
			hit[i]=true;
		}
	}

	int getLength() {
		return length; 	
	}

	@Override
	String getShipType() {
		return "cruiser";	
	}
}
