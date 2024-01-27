package com.numian.chess.engine;

import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.move.Move;

import io.github.colonelparrot.jchessify.Engine;
import io.github.colonelparrot.jchessify.PieceValueEvaluator;

public class ChessEngine {

  public String evaluate() {
    Board chessBoard = new Board();
    chessBoard.loadFromFen("rnbqkbnr/pp1ppppp/8/2p5/4P3/5N2/PPPP1PPP/RNBQKB1R b KQkq - 1 2");

    Engine engine = new Engine(new PieceValueEvaluator());
    Move bestMove = engine.getBestMove(chessBoard);
    return bestMove.toString();
  }
}
