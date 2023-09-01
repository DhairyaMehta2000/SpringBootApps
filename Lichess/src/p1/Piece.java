package p1;

public abstract class Piece {
	private boolean isWhite;

	public abstract boolean canMove();

	public Piece(boolean isWhite) {
		super();
		this.isWhite = isWhite;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}
}
