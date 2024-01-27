package com.numian.chess.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numian.chess.engine.ChessEngine;

@RestController
@RequestMapping("/api")
public class MoveController {
  @GetMapping("/move/{boardState}")
  public ResponseEntity<String> move(@PathVariable String boardState) {
    ChessEngine chessEngine = new ChessEngine();
    return ResponseEntity.ok(chessEngine.evaluate());
  }
}
