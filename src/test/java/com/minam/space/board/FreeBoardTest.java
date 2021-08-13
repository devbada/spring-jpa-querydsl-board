package com.minam.space.board;

import com.minam.common.engine.test.SuperTest;
import com.minam.space.board.free.entity.Free;
import com.minam.space.board.free.form.FreeBoardForm;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @since       2021.08.12
 * @author      minam
 * @description free board test
 **********************************************************************************************************************/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Transactional
@Slf4j
public class FreeBoardTest extends SuperTest {

    @Test
    public void t01_pages() {
        FreeBoardHelper.pages();
    }

    @Test
    public void t02_get() {
        FreeBoardHelper.get(FreeBoardHelper.addFree());
    }

    @Test
    public void t03_add() {
        FreeBoardHelper.addFree();
    }

    @Test
    public void t04_modify() {
        FreeBoardForm.Response.FindOne findOne = FreeBoardHelper.get(FreeBoardHelper.addFree());

        FreeBoardHelper.modify(FreeBoardForm.Request.Modify.builder()
                .id(findOne.getId())
                .title("modified Title")
                .updatedAt(LocalDateTime.now()).build());

    }

    @Test
    public void t05_delete() {
        FreeBoardHelper.delete(FreeBoardHelper.addFree());
    }
}