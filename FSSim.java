public class FSSim{
	public static void main(String[] args){
		FSBoard board = new FSBoard(Integer.parseInt(args[1]),Integer.parseInt(args[1]));
		if(args[0].equals("E"))
			board.initializeE();
		else
			board.initializeF();
		if(args[2] != null && args[3] != null)
			board.makeEmptySpot(Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		else
			board.makeEmptySpot();
		board.printBoard();
	}
}