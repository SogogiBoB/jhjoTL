package com.study.jhjoTL.service;

import com.study.jhjoTL.model.Board;
import com.study.jhjoTL.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<Board> selectList() {
        return boardRepository.findAll();
    }

    public Board selectBoard(int id) {
        return boardRepository.findById(id).get();
    }
}
