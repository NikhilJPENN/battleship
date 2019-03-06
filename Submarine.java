// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package battleship;

public class Submarine extends Ship {

	Submarine(){
		this.length=1;
		for(int i=0;i<this.length;i++) {
			hit[i]=true;
		}
	}

	int getLength() {
		return length; 	
	}

	@Override
	String getShipType() {
		return "submarine";	
	}


}
