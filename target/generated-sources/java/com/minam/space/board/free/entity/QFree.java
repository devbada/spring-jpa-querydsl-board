package com.minam.space.board.free.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFree is a Querydsl query type for Free
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFree extends EntityPathBase<Free> {

    private static final long serialVersionUID = 521723554L;

    public static final QFree free = new QFree("free");

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public final StringPath writer = createString("writer");

    public QFree(String variable) {
        super(Free.class, forVariable(variable));
    }

    public QFree(Path<? extends Free> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFree(PathMetadata metadata) {
        super(Free.class, metadata);
    }

}
