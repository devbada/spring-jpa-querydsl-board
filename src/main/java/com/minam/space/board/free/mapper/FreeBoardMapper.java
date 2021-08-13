package com.minam.space.board.free.mapper;

import com.minam.space.board.free.entity.Free;
import com.minam.space.board.free.form.FreeBoardForm;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @since       2021.08.12
 * @author      minam
 * @description free board mapper
 **********************************************************************************************************************/
@Mapper(unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface FreeBoardMapper {
    FreeBoardMapper mapper = Mappers.getMapper(FreeBoardMapper.class);

    @Mapping(target="id", source="id")
    FreeBoardForm.Response.FindAll       toFindAll(Free entity);
    List<FreeBoardForm.Response.FindAll> toFindAll(List<Free> entity);

    FreeBoardForm.Response.FindOne      toFindOne(Free entity);

    Free toEntity(FreeBoardForm.Request.Find find);
    Free toEntity(FreeBoardForm.Request.Add add);
    Free toEntity(FreeBoardForm.Request.Modify modify);
}