// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package battleship;

public abstract class Ship {


	int bowRow;
	int bowColumn;
	int length;
	boolean horizontal;
	boolean [] hit = new boolean[4];

	abstract int getLength();

	int getBowRow(){
		return bowRow;
	}

	int getBowColumn() {
		return bowColumn;
	}

	boolean isHorizontal() {
		return horizontal;
	}

	void setBowRow(int row) {
		this.bowRow=row;	
	}

	void setBowColumn(int column) {
		this.bowColumn=column;
	}

	void setHorizontal(boolean horizontal) {
		this.horizontal=horizontal;
	}

	abstract String getShipType();

	/*
	boolean placeNotOccupied(int row, int column,Ocean ocean) {

		 Ship[][] ships = ocean.getShipArray();

		 if((ships[row][column].getShipType()).equals("emptySea")) {

                 return true;			 
		 }
		 else {
			   return false;
		 }

	}

	 */
	boolean okToPlaceShipAt(int row, int column, boolean horizontal,Ocean ocean) {

		// zero padding to be done ********************************************************


		Ship[][] ships = ocean.getShipArray();

		if ((ships[row][column].getShipType()).equals("emptySea")) {



			if (horizontal) {

				if((column+length)<=9) {	

					int i=0;	
					while(i<length) {

						if ((column+1)<=9 && (row+1)<=9 && (row-1)>=0 && (column-1)>=0){

							if((ships[row][column-1].getShipType()).equals("emptySea")  && (ships[row-1][column-1].getShipType()).equals("emptySea") && (ships[row+1][column-1].getShipType()).equals("emptySea") && (ships[row-1][column].getShipType()).equals("emptySea") && (ships[row][column+1].getShipType()).equals("emptySea") && (ships[row-1][column+1].getShipType()).equals("emptySea") && (ships[row+1][column+1].getShipType()).equals("emptySea") && (ships[row-1][column].getShipType()).equals("emptySea") )
							{
								column=column+1;
								i++;
								if (i==length) {
									return true;
								}
							}
							else {
								return false;
							}
						}
					}

				}

				else {

					return false;
				}
			}

			else {

				if((row+length)<=9) {	

					int i=0;	
					while(i<length) {

						if ((column+1)<=9 && (row+1)<=9 && (row-1)>=0 && (column-1)>=0) {
							if((ships[row][column-1].getShipType()).equals("emptySea")  && (ships[row-1][column-1].getShipType()).equals("emptySea") && (ships[row+1][column-1].getShipType()).equals("emptySea") && (ships[row-1][column].getShipType()).equals("emptySea") && (ships[row][column+1].getShipType()).equals("emptySea") && (ships[row-1][column+1].getShipType()).equals("emptySea") && (ships[row+1][column+1].getShipType()).equals("emptySea") && (ships[row-1][column].getShipType()).equals("emptySea") )
								//if(ocean[row][column-1]==0 && ocean[row-1][column-1]==0 && ocean[row+1][column-1]==0 && ocean[row-1][column]==0 && ocean[row][column+1]==0 && ocean[row-1][column+1]==0 && ocean[row][column+1]==0 && ocean[row+1][column+1]==0 ) {
							{ 
								row=row+1;
								i++;
								if (i==length) {
									return true;
								}
							}
							else {
								return false;
							}
						}
					}
				}
				else {
					return false;
				}
			}
		}		
		else {

			return false;	
		}
		return false;


	}


	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {


		Ship[][] ships = ocean.getShipArray();

		if (okToPlaceShipAt(row,column,horizontal,ocean)) {

			//bowRow=row;
			//bowColumn=column;

			setBowRow(row);
			setBowColumn(column);
			setHorizontal(horizontal);

			//length=this.length; 

			if (isHorizontal()) {
				int i=0;
				while(i<length) {

					if(length==4) {

						//ships[row][column+i]=new Battleship(); 
						ships[row][column+i]=this;

						//System.out.println(this.getShipType());
						//System.out.print(ships[row][column+i].toString()+ " ");
						//System.out.println(ships[row][column+i].getShipType());

						System.out.println("");

					}

					if(length==3) {

						ships[row][column+i]=this; 
						//System.out.println(this.getShipType());
					}

					if(length==2) {

						ships[row][column+i]=this;
						//System.out.println(this.getShipType());
					}

					if(length==1) {                                 					
						ships[row][column+i]=this; 
						//System.out.println(this.getShipType());
					}
					i++;
				}	
			}		


			else {

				int i=0;
				while(i<length) {

					if(length==4) {

						ships[row+i][column]=this; 
					}

					if(length==3) {

						ships[row+i][column]=this; 
					}

					if(length==2) {

						ships[row+i][column]=this; 
					}

					if(length==1) {

						ships[row+i][column]=this; 
					}

					i++;
				}		

			}
		}
	}


	boolean shootAt(int row, int column) {

		length=this.getLength();


		if (isHorizontal()) {
			if(row == bowRow && bowColumn<=column && column<(bowColumn+length)) { 		

				if(hit[column-bowColumn] && !(isSunk()))
				{
					hit[column-bowColumn]=false;
					//System.out.print(hit[column-bowColumn]);
					//System.out.println("Nikhil");
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			if(column == bowColumn && bowRow<= row && row<(bowRow+length)) { 		

				if(hit[row-bowRow] && !(isSunk()))
				{
					hit[row-bowRow]=false;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;

			}
		}

	}

	boolean isSunk() {


		int i=0;
		while(i<length)

			if(hit[i] == false) {

				i++;
			}
			else {
				break;
			}

		if (i==length) {

			return true;
		}
		else {
			return false; 
		} 

	}

	@Override
	public String toString() {

		if(isSunk()) {

			return "x";
		}
		else {

			return "S";	
		}

	}



}
