package com.minam.space.board.free.repository;

import com.minam.space.board.free.entity.Free;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @since       2021.08.12
 * @author      minam
 * @description free board repository
 **********************************************************************************************************************/
public interface FreeBoardRepository extends JpaRepository<Free, Long> {
}