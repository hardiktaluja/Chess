public class Rock extends Piece {

    boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)) {
            return false;
        }
        if (newPosition.row == this.position.row || newPosition.column == this.position.column) {
            return true;
        } else {
            return false;
        }
    }
}
