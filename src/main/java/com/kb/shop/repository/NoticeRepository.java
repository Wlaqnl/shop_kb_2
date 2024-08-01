package com.kb.shop.repository;

import com.kb.shop.dto.FindNoticeRequestDto;
import com.kb.shop.dto.RequestDto;
import com.kb.shop.dto.test.TestNoticeRequestDto;
import com.kb.shop.vo.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NoticeRepository {

    //전체조회2
    List<Notice> findAllNotices(TestNoticeRequestDto requestDto);

    //전체조회
    List<Notice> findAllNotice(FindNoticeRequestDto requestDto);
    int findAllNoticeTotalCount(FindNoticeRequestDto requestDto);

    //상세조회
    List<Notice> findNotice(@Param("id") Long id);

    //공지사항 만들기
    int registerNotice(@Param("request") RequestDto request);

    //공지사항 수정하기
    int modifyNotice(@Param("request") RequestDto request);

    //공지사항 삭제하기
    int deleteNotice(@Param("id") Long id);
}
