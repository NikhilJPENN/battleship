// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package battleship;

public class EmptySea extends Ship {


	EmptySea(){

		this.length=1;
	}


	@Override
	boolean shootAt(int row, int column) {
		return false;	
	}

	@Override
	boolean isSunk() {
		return false;	
	}

	@Override
	public String toString() {
		return "-";	
	}


	@Override
	int getLength() {

		return length;
	}


	@Override
	String getShipType() {
		// TODO Auto-generated method stub
		return "emptySea";
	}

}
