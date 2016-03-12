package com.wsw.wallpaper.entities;

import javax.inject.Inject;

/**
 * Create By :wsw
 * 2016-03-11 16:50
 */
public class PageEntity {
    private int totalItemNum = 0;
    private int curPage = 0;
    private PicturePageEntity picturePageEntity;

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

    public int getNextPage() {
        return curPage + 1;
    }

    public PicturePageEntity getPicturePageEntity() {
        return picturePageEntity;
    }

    public PageEntity loadNextFinish(PicturePageEntity picturePageEntity) {
        this.picturePageEntity.getList().addAll(picturePageEntity.getList());
        curPage++;
        totalItemNum = picturePageEntity.getList().size();
        return this;
    }

    public void initialPage() {
        totalItemNum = 0;
        curPage = 0;
        picturePageEntity = null;
    }
}
