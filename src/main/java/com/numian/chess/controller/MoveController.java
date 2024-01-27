package com.numian.chess.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MoveController {
  @GetMapping("/move/{boardState}")
  public ResponseEntity<String> move(@PathVariable String boardState) {
    return ResponseEntity.ok("<" + boardState + ">");
  }
}
