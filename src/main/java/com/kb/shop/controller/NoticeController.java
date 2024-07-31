package com.kb.shop.controller;

import com.kb.shop.dto.*;
import com.kb.shop.service.NoticeService;
import com.kb.shop.vo.Notice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/notice")
@RequiredArgsConstructor
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    //전체조회
    @PostMapping("/findAll")
    public ResponseEntity<FindNoticeResponseDto> findAllNotice(@RequestBody FindNoticeRequestDto requestDto) {
        System.out.println("hello 전체조회 할꾸얌");
        System.out.println(requestDto);

        List<Notice> noticeList = noticeService.findAllNotice(requestDto);
        int totalCount = noticeService.findAllNoticeTotalCount(requestDto);
        int totalPage = totalCount / requestDto.getPageSize();
        if (totalCount % requestDto.getPageSize() > 0) totalPage += 1;

        FindNoticePaginationDto paginationDto = FindNoticePaginationDto.builder()
                .pageNo(requestDto.getPageNo())
                .pageSize(requestDto.getPageSize())
                .totalPage(totalPage)
                .totalContents(totalCount)
                .build();
        FindNoticeResponseDto responseDto = FindNoticeResponseDto.builder()
                .contents(noticeList)
                .pagination(paginationDto)
                .build();

        return ResponseEntity.ok().body(responseDto);
    }

    //상세조회
    @GetMapping("/detail/{id}")
    public ResponseEntity<List<Notice>> findNotice(@PathVariable Long id) {
        System.out.println("hello 상세조회 할꾸얌");
        List<Notice> noticeDetail = noticeService.findNotice(id);
        return ResponseEntity.ok().body(noticeDetail);
    }

    //공지사항 만들기
    @PostMapping("/register")
    public ResponseEntity<ResponseDto> registerNotice(@RequestBody RequestDto requestDto) {
        System.out.println("hello 공지사항 만들꾸얌");
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
    @PutMapping("/modify")
    public ResponseEntity<ResponseDto> modifyNotice(@RequestBody RequestDto requestDto) {
        System.out.println("hello 공지사항 수정할꾸얌");
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
        System.out.println("hello 공지사항 삭제할꾸얌");
        System.out.println(requestDto.get공지사항일련번호());
        System.out.println("-----------------------------");
        int result = noticeService.deleteNotice(requestDto.get공지사항일련번호());

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
