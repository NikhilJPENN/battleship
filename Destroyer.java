// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package battleship;

public class Destroyer extends Ship {
	
	Destroyer(){
		this.length=2;
		for(int i=0;i<length;i++) {
			hit[i]=true;
		}
	}
	
	int getLength() {
	      return length; 	
	}
	
	@Override
	String getShipType() {
		
	 return "destroyer";	
	}

}
