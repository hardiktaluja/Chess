public class Queen extends Piece {

    boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)) {
            return false;
        }
        if ((Math.abs(newPosition.row - this.position.row) == Math.abs(newPosition.column - this.position.column))
                || (newPosition.row == this.position.row || newPosition.column == this.position.column)) {
            return true;
        } else {
            return false;
        }
    }

}
