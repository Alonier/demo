package Sungkuyl_database.demo.service;

import Sungkuyl_database.demo.domain.repository.BoardRepository;
import Sungkuyl_database.demo.dto.BoardDto;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getBoard_id();
    }



}
