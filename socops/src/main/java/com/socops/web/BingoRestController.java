package com.socops.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.socops.model.BingoCell;
import com.socops.service.BoardAssembler;
import com.socops.service.ScavengerHuntAssembler;

/** Serves the game page and the board-generation REST endpoint. */
@Controller
public class BingoRestController {

    @GetMapping("/")
    public String serveLobbyPage() {
        return "game";
    }

    @GetMapping("/api/bingo/fresh-board")
    @ResponseBody
    public List<BingoCell> dispenseFreshBoard() {
        return BoardAssembler.assembleNewBoard();
    }

    @GetMapping("/api/scavenger/fresh-list")
    @ResponseBody
    public List<BingoCell> dispenseFreshScavengerList() {
        return ScavengerHuntAssembler.assembleNewList();
    }
}
