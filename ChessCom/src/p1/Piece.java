package p1;

public abstract class Piece {
	private boolean isWhite;

	public boolean isWhite() {
		return isWhite;
	}

	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public Piece(boolean isWhite) {
		super();
		this.isWhite = isWhite;
	}
}
