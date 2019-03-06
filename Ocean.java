// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791 
package battleship;

import java.util.Random;


public class Ocean {

	Random rn = new Random();
	Ship[][] ships = new Ship[10][10];
	static String[][] arr = new String[10][10];

	int shotsFired;
	int hitCount;

	Ocean() {

		int shotsFired=0;
		int hitCount=0;
		for(int i=0;i<10;i++) {

			for(int j=0;j<10;j++) {
				ships[i][j]=new EmptySea(); 
				arr[i][j]=".";
			}
		}
	}

	void placeAllShipsRandomly() {

		//Ocean ocean=new Ocean();

		boolean horizontal=true;
		int i=0;
		int shipNumber=0;
		int row;
		int column;

		while(i<1) {
			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=3;	
			column=5;		
			Battleship B1=new Battleship();
			if (B1.okToPlaceShipAt(row,column,horizontal,this)){
				B1.placeShipAt(row,column,horizontal,this);
				i++;
			}
		}

		i=0;
		while(i<1) {
			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=5;	
			column=1;	
			Cruiser C1=new Cruiser();
			if (C1.okToPlaceShipAt(row,column,horizontal,this)){
				C1.placeShipAt(row,column,horizontal,this);
				i++;
			}   
		}

		i=0;
		while(i<1) {
			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=5;	
			column=5;	
			Cruiser C2=new Cruiser();
			if (C2.okToPlaceShipAt(row,column,horizontal,this)){
				C2.placeShipAt(row,column,horizontal,this);
				i++;
			}   
		}

		i=0; 
		while(i<1) {
			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=7;	
			column=1;	
			Destroyer D1=new Destroyer();
			if (D1.okToPlaceShipAt(row,column,horizontal,this)){

				D1.placeShipAt(row,column,horizontal,this);
				i++;
			}   

		}

		i=0; 
		while(i<1) {
			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=7;	
			column=4;	
			Destroyer D2=new Destroyer();
			if (D2.okToPlaceShipAt(row,column,horizontal,this)){

				D2.placeShipAt(row,column,horizontal,this);
				i++;
			}   

		}

		i=0; 
		while(i<1) {
			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=7;	
			column=7;	
			Destroyer D3=new Destroyer();
			if (D3.okToPlaceShipAt(row,column,horizontal,this)){

				D3.placeShipAt(row,column,horizontal,this);
				i++;
			}   

		}

		i=0;
		while(i<1) {

			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=1;	
			column=2;	
			Submarine S1=new Submarine();
			if (S1.okToPlaceShipAt(row,column,horizontal,this)){

				S1.placeShipAt(row,column,horizontal,this);
				i++;
			}   

		}

		i=0;
		while(i<1) {

			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=1;	
			column=4;	
			Submarine S2=new Submarine();
			if (S2.okToPlaceShipAt(row,column,horizontal,this)){

				S2.placeShipAt(row,column,horizontal,this);
				i++;
			}   

		}
		i=0;
		while(i<1) {

			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=1;	
			column=7;	
			Submarine S3=new Submarine();
			if (S3.okToPlaceShipAt(row,column,horizontal,this)){

				S3.placeShipAt(row,column,horizontal,this);
				i++;
			}   

		}
		i=0;
		while(i<1) {

			row=rn.nextInt(10) + 0;
			column=rn.nextInt(10) + 0;
			row=3;	
			column=2;	
			Submarine S4=new Submarine();
			if (S4.okToPlaceShipAt(row,column,horizontal,this)){

				S4.placeShipAt(row,column,horizontal,this);
				i++;
			}   

		}

	}

	boolean isOccupied(int row, int column) {

		if((ships[row][column].getShipType()).equals("emptySea")) {

			return false;			 
		}
		else {
			return true;
		}

	}

	boolean shootAt(int row, int column) {

		int lengthA;
		int rowA;
		int columnA;
		shotsFired++;   


		if ((ships[row][column].getShipType()).equals("emptySea")){
			return false;    

		}
		else {

			if(ships[row][column].isSunk()) {

				return false;
			}
			else {


				hitCount++; 
				return true;	
			}

		}
	}
	;
	int getShotsFired() {

		return shotsFired;
	}

	int getHitCount() {

		return hitCount;
	}

	boolean isGameOver() {

		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if((isOccupied(i,j))) {

					if (!(ships[i][j].isSunk())) {

						return false;
					}
				}

			}
		}
		return true;  
	}

	Ship[][] getShipArray(){

		return ships;
	}

	void print() {

		System.out.print("  ");
		for(int i=0;i<10;i++) {

			System.out.print(i +" ");
		}

		System.out.println("");
		for(int i=0;i<10;i++) {

			System.out.print(i + " ");

			for(int j=0;j<10;j++) {

				System.out.print(arr[i][j]+" ");

			}
			System.out.println("");
		}


	}	 
}
