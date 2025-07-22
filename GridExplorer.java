public class GridExplorer {
    public static void main(String[] args) {
        char[][] ticTacToeBoard={{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        ticTacToeBoard[0][0]='X';
        ticTacToeBoard[1][1]='O';
        ticTacToeBoard[0][2]='X';

        System.out.println("\n---Tic-Tac-Board---");
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                
                System.out.print(" "+ticTacToeBoard[i][j]);

                if(j<ticTacToeBoard[i].length-1){
                    System.out.print(" |");
                }
            }
            System.out.println();
            if(i<ticTacToeBoard.length-1){
                System.out.println("---+---+---");
            }

        }

        System.out.println("\nValue at (1,1:)"+ticTacToeBoard[1][1]);
       


    }
}
