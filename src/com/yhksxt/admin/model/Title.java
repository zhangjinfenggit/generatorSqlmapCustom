package com.yhksxt.admin.model;

public class Title {
    private Integer id;

    private String number;

    private Integer type;

    private String level;

    private Integer xindu;

    private Integer xiaodu;

    private Integer qufen;

    private Integer subject;

    private Integer chapter;

    private Integer section;

    private String content;

    private String choose1;

    private String choose2;

    private String choose3;

    private String choose4;

    private String choose5;

    private String filepath;

    private String realfilename;

    private String answer;

    private Integer mroleid;

    private String mTime;

    private String sroleid;

    private String sTime;

    private Integer status;

    private String sydx;

    private Integer minute;

    private Double price;

    private Double score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getXindu() {
        return xindu;
    }

    public void setXindu(Integer xindu) {
        this.xindu = xindu;
    }

    public Integer getXiaodu() {
        return xiaodu;
    }

    public void setXiaodu(Integer xiaodu) {
        this.xiaodu = xiaodu;
    }

    public Integer getQufen() {
        return qufen;
    }

    public void setQufen(Integer qufen) {
        this.qufen = qufen;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public Integer getChapter() {
        return chapter;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getChoose1() {
        return choose1;
    }

    public void setChoose1(String choose1) {
        this.choose1 = choose1 == null ? null : choose1.trim();
    }

    public String getChoose2() {
        return choose2;
    }

    public void setChoose2(String choose2) {
        this.choose2 = choose2 == null ? null : choose2.trim();
    }

    public String getChoose3() {
        return choose3;
    }

    public void setChoose3(String choose3) {
        this.choose3 = choose3 == null ? null : choose3.trim();
    }

    public String getChoose4() {
        return choose4;
    }

    public void setChoose4(String choose4) {
        this.choose4 = choose4 == null ? null : choose4.trim();
    }

    public String getChoose5() {
        return choose5;
    }

    public void setChoose5(String choose5) {
        this.choose5 = choose5 == null ? null : choose5.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getRealfilename() {
        return realfilename;
    }

    public void setRealfilename(String realfilename) {
        this.realfilename = realfilename == null ? null : realfilename.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getMroleid() {
        return mroleid;
    }

    public void setMroleid(Integer mroleid) {
        this.mroleid = mroleid;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime == null ? null : mTime.trim();
    }

    public String getSroleid() {
        return sroleid;
    }

    public void setSroleid(String sroleid) {
        this.sroleid = sroleid == null ? null : sroleid.trim();
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime == null ? null : sTime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSydx() {
        return sydx;
    }

    public void setSydx(String sydx) {
        this.sydx = sydx == null ? null : sydx.trim();
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}