package com.study.board.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardDTO extends CommonDTO {
    private Long idx;
    private String title;
    private String content;
    private String writer;
    private int viewCnt;
    private String noticeYn;
    private String secretYn;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    public String getNoticeYn() {
        return noticeYn;
    }

    public void setNoticeYn(String noticeYn) {
        this.noticeYn = noticeYn;
    }

    public String getSecretYn() {
        return secretYn;
    }

    public void setSecretYn(String secretYn) {
        this.secretYn = secretYn;
    }
    //    public BoardDTO(long idx, String title, String content, String writer, int viewCnt, String noticeYn, String secretYn,
//                    String deleteYn, LocalDateTime insertTime, LocalDateTime updateTime, LocalDateTime deleteTime) {
//        super();
//        this.idx = idx;
//        this.title = title;
//        this.content = content;
//        this.writer = writer;
//        this.viewCnt = viewCnt;
//        this.noticeYn = noticeYn;
//        this.secretYn = secretYn;
//        this.deleteYn = deleteYn;
//        this.insertTime = insertTime;
//        this.updateTime = updateTime;
//        this.deleteTime = deleteTime;
//    }
}
