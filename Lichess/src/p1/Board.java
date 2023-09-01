package p1;

public class Board {
	private Piece[][] pieces;

	public Board() {
		pieces = new Piece[8][8];
		resetBoard();
	}

	public Piece getPiece(int x, int y) {
		return pieces[x][y];
	}

	private void addPiece(int x, int y, Piece piece) {
		pieces[x][y] = piece;
	}

	public void resetBoard() {
		// initialize white pieces
		addPiece(0, 0, new Rook(true));
		addPiece(0, 1, new Knight(true));
		addPiece(0, 2, new Bishop(true));
		addPiece(0, 3, new King(true));
		addPiece(0, 4, new Queen(true));
		addPiece(0, 5, new Bishop(true));
		addPiece(0, 6, new Knight(true));
		addPiece(0, 7, new Rook(true));

		int row = 1;
		for (int i = 0; i <= 7; i++) {
			addPiece(row, i, new Pawn(true));
		}

		// initialize black pieces
		addPiece(7, 0, new Rook(false));
		addPiece(7, 1, new Knight(false));
		addPiece(7, 2, new Bishop(false));
		addPiece(7, 3, new King(false));
		addPiece(7, 4, new Queen(false));
		addPiece(7, 5, new Bishop(false));
		addPiece(7, 6, new Knight(false));
		addPiece(7, 7, new Rook(false));
		row = 6;
		for (int i = 0; i <= 7; i++) {
			addPiece(row, i, new Pawn(false));
		}

		// initialize remaining boxes without any piece
		for (int i = 2; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				addPiece(i, j, null);
			}
		}
	}
	public void printBoard() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
            	Piece piece = getPiece(x,y);
            	if(piece == null) {
                	System.out.print(" ");
                }else if(piece.isWhite()) {
                	System.out.print("W" +piece.getClass().getSimpleName()+" ");
                }else {
                	System.out.print("B"+piece.getClass().getSimpleName()+" ");
                }
            }
            System.out.println();
        }
    }
}
