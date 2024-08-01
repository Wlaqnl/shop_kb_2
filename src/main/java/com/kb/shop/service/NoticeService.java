package com.kb.shop.service;

import com.kb.shop.dto.FindNoticeRequestDto;
import com.kb.shop.dto.RequestDto;
import com.kb.shop.dto.test.TestNoticeRequestDto;
import com.kb.shop.repository.NoticeRepository;
import com.kb.shop.vo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {
    @Autowired
    private NoticeRepository noticeRepository;

    //전체조회2
    public List<Notice> findAllNotices(TestNoticeRequestDto requestDto){
        System.out.println("전체조회2 가즈아");
        System.out.println("requestDto : " + requestDto);
        return noticeRepository.findAllNotices(requestDto);
    }

    //전체조회
    public List<Notice> findAllNotice(FindNoticeRequestDto requestDto){
        System.out.println("nice to meet you 전체조회할까?");
        return noticeRepository.findAllNotice(requestDto);
    }

    public int findAllNoticeTotalCount(FindNoticeRequestDto requestDto){
        System.out.println("nice to meet you 개수조회할까?");
        return noticeRepository.findAllNoticeTotalCount(requestDto);
    }

    //상세조회
    public List<Notice> findNotice(Long id) {
        System.out.println("nice to meet you 상세조회할까?");
        return noticeRepository.findNotice(id);
    }

    //공지사항 만들기
    public int registerNotice(RequestDto requestDto) {
        System.out.println("nice to meet you 공지사항 만들까?");
        return noticeRepository.registerNotice(requestDto);
    }

    //공지사항 수정하기
    public int modifyNotice(RequestDto requestDto) {
        System.out.println("nice to meet you 공지사항 수정할까?");
        return noticeRepository.modifyNotice(requestDto);
    }

    //공지사항 삭제하기
    public int deleteNotice(Long id) {
        System.out.println("nice to meet you 공지사항 삭제할까?");
        return noticeRepository.deleteNotice(id);
    }
}
