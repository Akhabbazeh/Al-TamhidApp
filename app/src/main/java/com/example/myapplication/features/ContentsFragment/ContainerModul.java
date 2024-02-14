package com.example.myapplication.features.ContentsFragment;

public class ContainerModul {
    int page_num;
     int title_num;
     String titleContain;

    public ContainerModul(int title_num, String titleContain, int page_num) {
        this.page_num = page_num;
        this.title_num = title_num;
        this.titleContain = titleContain;
    }



    public int getPage_num() {
        return page_num;
    }

    public void setPage_num(int page_num) {
        this.page_num = page_num;
    }

    public int getTitle_num() {
        return title_num;
    }

    public void setTitle_num(int title_num) {
        this.title_num = title_num;
    }

    public String getTitleContain() {
        return titleContain;
    }

    public void setTitleContain(String titleContain) {
        this.titleContain = titleContain;
    }

}
