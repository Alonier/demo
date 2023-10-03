package Sungkuyl_database.demo.dto;
import Sungkuyl_database.demo.domain.entity.Board;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long board_id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Board toEntity() {
        Board build = Board.builder()
                .board_id(board_id)
                .writer(writer)
                .title(title)
                .content(content)
                .build();
        return build;
    }

    @Builder
    public BoardDto(Long board_id, String writer, String title, String content, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.board_id = board_id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
