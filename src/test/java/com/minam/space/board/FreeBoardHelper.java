package com.minam.space.board;

import com.minam.common.engine.test.TestHelper;
import com.minam.space.board.free.entity.Free;
import com.minam.space.board.free.form.FreeBoardForm;
import com.minam.space.board.free.form.FreeBoardForm.Request;
import com.minam.space.board.free.form.FreeBoardForm.Response;
import com.minam.space.member.entity.Member;
import lombok.SneakyThrows;

import java.time.LocalDateTime;

import static com.minam.common.engine.helper.model.ObjectHelper.toInstance;
import static com.minam.common.engine.helper.model.ObjectHelper.toJson;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * @since       2021.08.12
 * @author      minam
 * @description free board helper
 **********************************************************************************************************************/
public class FreeBoardHelper extends TestHelper {

    @SneakyThrows
    public static void pages() {
        mock.perform(get("/api/space/boards/frees/pages")).andDo(print()).andExpect(status().isOk());
    }

    @SneakyThrows
    public static Free add(Request.Add add) {
        // FIXME 사실 return이 Integer 면 될 거 같은데, 뭐 암튼 천천히 수정해보자.
        return toInstance(Free.class, mock.perform(post("/api/space/boards/frees")
                                                .content(toJson(add)))
                                                .andExpect(status().isOk())
                                                .andDo(print()));
    }

    @SneakyThrows
    public static Response.FindOne get(Long newFreeId) {
        return toInstance(Response.FindOne.class, mock.perform(get("/api/space/boards/frees/{id}", newFreeId)).andDo(print()).andExpect(status().isOk()));
    }

    @SneakyThrows
    public static Long addFree() {
        return add(FreeBoardForm.Request.Add.builder()
                                                .title("testIam")
                                                .content("test Content")
                                                .writer(new Member())
                                                .createdAt(LocalDateTime.now())
                                                .build()).getId();
    }

    @SneakyThrows
    public static void modify(Request.Modify modify) {
        mock.perform(put("/api/space/boards/frees/{freeId}", modify.getId())
                .content(toJson(modify)))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @SneakyThrows
    public static void delete(Long id) {
        mock.perform(delete("/api/space/boards/frees/{freeId}", id))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
