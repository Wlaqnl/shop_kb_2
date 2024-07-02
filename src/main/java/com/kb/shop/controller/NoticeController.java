package com.kb.shop.controller;

import com.kb.shop.dto.RequestDto;
import com.kb.shop.dto.ResponseDto;
import com.kb.shop.service.NoticeService;
import com.kb.shop.vo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    //전체조회
    @GetMapping("/findAll")
    public ResponseEntity<List<Notice>> findAllNotice() {
        System.out.println("hello 호동 전체조회 할꾸얌");
        List<Notice> noticeList = noticeService.findAllNotice();
        return ResponseEntity.ok().body(noticeList);
    }

    //상세조회
    @GetMapping("/detail/{id}")
    public ResponseEntity<List<Notice>> findNotice(@PathVariable Long id) {
        System.out.println("hello 호동 상세조회 할꾸얌");
        List<Notice> noticeDetail = noticeService.findNotice(id);
        return ResponseEntity.ok().body(noticeDetail);
    }

    //공지사항 만들기
    @PostMapping("/register")
    public ResponseEntity<ResponseDto> registerNotice(@RequestBody RequestDto requestDto) {
        System.out.println("hello 호동 공지사항 만들꾸얌");
        int result = noticeService.registerNotice(requestDto);

        String msg;
        String state;
        if (result > 0) {
            msg = "생성 성공";
            state = "S";
        } else {
            msg = "생성 실패";
            state = "F"; // 에러는 "E"
        }
        return ResponseEntity.ok().body(ResponseDto.builder().msg(msg).state(state).build());
    }

    //공지사항 수정하기
    @PostMapping("/modify")
    public ResponseEntity<ResponseDto> modifyNotice(@RequestBody RequestDto requestDto) {
        System.out.println("hello 호동 공지사항 수정할꾸얌");
        int result = noticeService.modifyNotice(requestDto);

        String msg;
        String state;
        if (result > 0) {
            msg = "수정 성공";
            state = "S";
        } else {
            msg = "수정 실패";
            state = "F"; // 에러는 "E"
        }

        return ResponseEntity.ok().body(ResponseDto.builder().msg(msg).state(state).build());
    }

    //공지사항 삭제하기
    @PostMapping("/delete")
    public ResponseEntity<ResponseDto> deleteNotice(@RequestBody RequestDto requestDto) {
        System.out.println("hello 호동 공지사항 삭제할꾸얌");
        int result = noticeService.deleteNotice(requestDto.getId());

        String msg;
        String state;
        if (result > 0) {
            msg = "삭제 성공";
            state = "S";
        } else {
            msg = "삭제 실패";
            state = "F"; // 에러는 "E"
        }

        return ResponseEntity.ok().body(ResponseDto.builder().msg(msg).state(state).build());
    }
}
