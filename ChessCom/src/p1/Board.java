package p1;

public class Board {
	Piece[][] pieces;

	public Board() {
		pieces = new Piece[8][8];
	}

	public Piece getPiece(int x, int y) {
		return pieces[x][y];
	}
	
	public void setPiece(int x, int y, Piece piece) {
		pieces[x][y]=piece;
	}
	
	public void resetBoard() {
		setPiece(0,0, new Rook(false));
		setPiece(0,1, new Knight(false));
		setPiece(0,2, new Bishop(false));
		setPiece(0,3, new King(false));
		setPiece(0,4, new Queen(false));
		setPiece(0,5, new Bishop(false));
		setPiece(0,6, new Knight(false));
		setPiece(0,7, new Rook(false));
		
		int row=1;
		for(int i=0;i<=7;i++) {
			setPiece(row,i,new Pawn(false));
		}
		
		for(int i=2;i<=5;i++) {
			for(int j=0;j<=7;j++) {
				setPiece(i,j,null);
			}
		}
		
		setPiece(7,0, new Rook(true));
		setPiece(7,1, new Knight(true));
		setPiece(7,2, new Bishop(true));
		setPiece(7,3, new King(true));
		setPiece(7,4, new Queen(true));
		setPiece(7,5, new Bishop(true));
		setPiece(7,6, new Knight(true));
		setPiece(7,7, new Rook(true));
		
		row=6;
		for(int i=0;i<=7;i++) {
			setPiece(row,i,new Pawn(true));
		}
		
	}
	
	public void printBoard() {
		for(int i=0;i<=7;i++) {
			for(int j=0;j<=7;j++) {
				Piece piece = getPiece(i, j);
				if(piece==null) {
					System.out.print(" ");
				}else if(piece.isWhite() && piece.getClass().getSimpleName().equals("Pawn")) {
					System.out.print("W"+piece.getClass().getSimpleName()+"  ");
				}else if(piece.isWhite()){
					System.out.print("W" + piece.getClass().getSimpleName()+" ");
				}else if(!piece.isWhite() && piece.getClass().getSimpleName().equals("Pawn")) {
					System.out.print("B"+piece.getClass().getSimpleName()+"  ");
				}
				else {
					System.out.print("B"+piece.getClass().getSimpleName()+" ");
				}
				
			}
			System.out.println();
		}
	}
	
	
}
