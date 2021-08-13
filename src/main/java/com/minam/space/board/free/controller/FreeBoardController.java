package com.minam.space.board.free.controller;

import com.minam.space.board.free.entity.Free;
import com.minam.space.board.free.form.FreeBoardForm;
import com.minam.space.board.free.form.FreeBoardForm.Response;
import com.minam.space.board.free.service.FreeBoardService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.minam.space.board.free.mapper.FreeBoardMapper.mapper;

/**
 * @since       2021.08.12
 * @author      minam
 * @description free controller
 **********************************************************************************************************************/
@Api(description="게시판 - 자유게시판")
@RestController
@RequiredArgsConstructor
@RequestMapping("${properties.api.end-point}")
public class FreeBoardController {

    private final FreeBoardService freeBoardService;

    @GetMapping("/space/boards/frees/pages")
    public List<Response.FindAll> pages() {
        return (List<Response.FindAll>) Optional.ofNullable(freeBoardService.pages()).orElse(null);
    }

    @GetMapping("/space/boards/frees/{id}")
    public Response.FindOne get(@PathVariable("id") Long id) {
        return Optional.ofNullable(freeBoardService.get(id)).orElse(null);
    }

    @PostMapping("/space/boards/frees")
    public Free add(FreeBoardForm.Request.Add add) {
        return freeBoardService.add(mapper.toEntity(add));
    }

    @PutMapping("/space/boards/frees/{freeId}")
    public Free modify(@PathVariable("freeId") Long freeId, @RequestBody FreeBoardForm.Request.Modify modify) {
        return freeBoardService.modify(mapper.toEntity(modify));
    }

    @DeleteMapping("/space/boards/frees/{id}")
    public void delete(@PathVariable("id") Long id) {
        freeBoardService.delete(id);
    }

    @DeleteMapping("/space/boards/frees/all")
    public void deleteAll(FreeBoardForm.Request.DeleteAll delete) {
        freeBoardService.deleteAll(delete);

    }

}