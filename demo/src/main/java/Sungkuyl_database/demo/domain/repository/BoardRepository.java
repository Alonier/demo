package Sungkuyl_database.demo.domain.repository;

import Sungkuyl_database.demo.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<Board,Long>{
}
