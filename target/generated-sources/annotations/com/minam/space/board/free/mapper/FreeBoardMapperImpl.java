package com.minam.space.board.free.mapper;

import com.minam.space.board.free.entity.Free;
import com.minam.space.board.free.form.FreeBoardForm.Request.Add;
import com.minam.space.board.free.form.FreeBoardForm.Request.Find;
import com.minam.space.board.free.form.FreeBoardForm.Request.Modify;
import com.minam.space.board.free.form.FreeBoardForm.Response.FindAll;
import com.minam.space.board.free.form.FreeBoardForm.Response.FindOne;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class FreeBoardMapperImpl implements FreeBoardMapper {

    @Override
    public FindAll toFindAll(Free entity) {
        if ( entity == null ) {
            return null;
        }

        FindAll findAll = new FindAll();

        return findAll;
    }

    @Override
    public List<FindAll> toFindAll(List<Free> entity) {
        if ( entity == null ) {
            return null;
        }

        List<FindAll> list = new ArrayList<FindAll>( entity.size() );
        for ( Free free : entity ) {
            list.add( toFindAll( free ) );
        }

        return list;
    }

    @Override
    public FindOne toFindOne(Free entity) {
        if ( entity == null ) {
            return null;
        }

        FindOne findOne = new FindOne();

        return findOne;
    }

    @Override
    public Free toEntity(Find find) {
        if ( find == null ) {
            return null;
        }

        Free free = new Free();

        return free;
    }

    @Override
    public Free toEntity(Add add) {
        if ( add == null ) {
            return null;
        }

        Free free = new Free();

        return free;
    }

    @Override
    public Free toEntity(Modify modify) {
        if ( modify == null ) {
            return null;
        }

        Free free = new Free();

        return free;
    }
}
