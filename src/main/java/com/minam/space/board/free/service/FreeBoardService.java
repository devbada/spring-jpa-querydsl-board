package com.minam.space.board.free.service;

import com.minam.space.board.free.entity.Free;
import com.minam.space.board.free.form.FreeBoardForm;
import com.minam.space.board.free.form.FreeBoardForm.Response;
import com.minam.space.board.free.repository.FreeBoardRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static com.minam.space.board.free.mapper.FreeBoardMapper.mapper;

/**
 * @since       2021.08.12
 * @author      minam
 * @description free board service
 **********************************************************************************************************************/
@Service
@Transactional
@AllArgsConstructor
public class FreeBoardService {
    private final FreeBoardRepository freeBoardRepository;

    @Transactional(readOnly=true)
    public List<FreeBoardForm.Response.FindAll> pages() {
        return mapper.toFindAll((List<Free>) freeBoardRepository.findAll());
    }

    @Transactional(readOnly=true)
    public Response.FindOne get(Long id) {
        return mapper.toFindOne(freeBoardRepository.getById(id));
    }

    public Free add(Free entity) {
        return freeBoardRepository.save(entity);
    }

    @SneakyThrows
    public Free modify(Free entity) {
        Optional<Free> freeOne = freeBoardRepository.findById(entity.getId());

//        if (freeOne.isEmpty()) throw new Exception("업데이트 대상이 존재하지 않습니다.");

        freeOne.ifPresent(free -> {
            freeBoardRepository.save(entity);
        });

        return entity;
    }

    public void delete(Long id) {
        freeBoardRepository.deleteById(id);
    }

    public void deleteIn(List<Long> ids) {
        freeBoardRepository.deleteAllById(ids);
    }

    public void deleteAll(FreeBoardForm.Request.DeleteAll delete) {
        freeBoardRepository.deleteAllByIdInQuery(delete.getIds());
    }
}