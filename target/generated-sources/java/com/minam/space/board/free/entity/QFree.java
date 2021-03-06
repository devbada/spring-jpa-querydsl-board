package com.minam.space.board.free.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFree is a Querydsl query type for Free
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFree extends EntityPathBase<Free> {

    private static final long serialVersionUID = 521723554L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFree free = new QFree("free");

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public final com.minam.space.member.entity.QMember writer;

    public QFree(String variable) {
        this(Free.class, forVariable(variable), INITS);
    }

    public QFree(Path<? extends Free> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFree(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFree(PathMetadata metadata, PathInits inits) {
        this(Free.class, metadata, inits);
    }

    public QFree(Class<? extends Free> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.writer = inits.isInitialized("writer") ? new com.minam.space.member.entity.QMember(forProperty("writer")) : null;
    }

}

