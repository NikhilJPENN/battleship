// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package battleship;
import java.util.Scanner;
public class BattleshipGame {

	public static void main(String[] args) {


		int lengthA;
		int rowA;
		int columnA;
		Ocean ocean= new Ocean();
		ocean.print();
		Ship[][] ships = ocean.getShipArray();
		ocean.placeAllShipsRandomly();
		//ocean.print();

		Scanner sc = new Scanner(System.in);            

		String userInput = "l";   // Initialized to some random character other than command   

		while(userInput != "n") {


			if (ocean.isGameOver()) {


				System.out.println("Number of hits:");
				System.out.println(ocean.getHitCount());
				System.out.println("Number of shots fired:");
				System.out.println(ocean.getShotsFired());	
				System.out.println("\n"+"GAME OVER");
				System.out.println("\n"+"Do you want to play again");        
				userInput = sc.nextLine();

				if (userInput=="y") {
					userInput = "l";
					ocean.print();
					ocean.placeAllShipsRandomly();	 		
				}
			}

			else {

				System.out.println("Enter shot:\n");
				System.out.println("Enter the row number:\n");
				int row = sc.nextInt();
				System.out.println("Enter the coloum number:\n");
				int column = sc.nextInt();

				if(ocean.shootAt(row,column)) {


					ocean.ships[row][column].shootAt(row,column); ///****
					System.out.println("\n"+"hit"+"\n");
					if (ocean.ships[row][column].isSunk()) {

						System.out.println("You just sank a ship"+ (ocean.ships[row][column].getShipType()));	
					}
				}	  
				else {
					System.out.println("\n"+"miss"+"\n");	
				}

				//System.out.println("Number of hits:");
				//System.out.println(ocean.getHitCount());
				//System.out.println("Number of shots fired:");
				//System.out.println(ocean.getShotsFired());
				ocean.arr[row][column]=ships[row][column].toString();
				if(ocean.ships[row][column].isSunk()) {
					lengthA=ocean.ships[row][column].length;
					rowA=ocean.ships[row][column].bowRow;
					columnA=ocean.ships[row][column].bowColumn;
					for (int i=0;i<lengthA;i++) {
						ocean.arr[rowA][columnA+i]="x";
					}
				}


				ocean.print();
			}


		}

	}
}        
