package com.wsw.wallpaper.entities;

import javax.inject.Inject;

/**
 * Create By :wsw
 * 2016-03-11 16:50
 */
public class PageEntity {
    private static int defaultPageSize = 20;
    private int totalItemNum = 0;
    private int curPage = 1;
    PicturePageEntity picturePageEntity;

    @Inject
    public PageEntity(PicturePageEntity picturePageEntity) {
        this.picturePageEntity = picturePageEntity;
        totalItemNum += picturePageEntity.getList().size();
    }

    public int getTotalItemNum() {
        return totalItemNum;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public PicturePageEntity getPicturePageEntity() {
        return picturePageEntity;
    }
}
