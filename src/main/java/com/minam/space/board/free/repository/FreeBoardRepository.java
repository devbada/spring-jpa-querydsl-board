package com.minam.space.board.free.repository;

import com.minam.space.board.free.entity.Free;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @since       2021.08.12
 * @author      minam
 * @description free board repository
 **********************************************************************************************************************/
public interface FreeBoardRepository extends JpaRepository<Free, Long> {
    @Modifying
    @Query("delete from Free f where f.id in :ids")
    void deleteAllByIdInQuery(List<Long> ids);
}