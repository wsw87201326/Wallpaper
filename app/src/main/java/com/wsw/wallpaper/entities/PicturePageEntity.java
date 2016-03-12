package com.wsw.wallpaper.entities;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Create By :wsw
 * 2016-03-11 16:15
 */
public class PicturePageEntity {

    @Inject
    PicturePageEntity() {
        this.list = new ArrayList<>();
    }

    private int total;
    private boolean end;
    private int lastindex;

    public List<PictureEntity> getList() {
        return list;
    }

    public void setList(List<PictureEntity> list) {
        this.list = list;
    }

    private List<PictureEntity> list;

    public void setTotal(int total) {
        this.total = total;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public void setLastindex(int lastindex) {
        this.lastindex = lastindex;
    }

    public int getTotal() {
        return total;
    }

    public boolean isEnd() {
        return end;
    }

    public int getLastindex() {
        return lastindex;
    }

    public static class PictureEntity {
        private String id;
        private boolean qqface_down_url;
        private boolean downurl;
        private boolean grpmd5;
        private int type;
        private int index;
        private String title;
        private String litetitle;
        private String width;
        private String height;
        private String imgsize;
        private String imgtype;
        private String key;
        private String dspurl;
        private String link;
        private int source;
        private String img;
        private String thumb_bak;
        private String thumb;
        private String _thumb_bak;
        private String _thumb;
        private int thumbWidth;
        private String dsptime;
        private int thumbHeight;
        private String grpcnt;
        private boolean fixedSize;

        public void setId(String id) {
            this.id = id;
        }

        public void setQqface_down_url(boolean qqface_down_url) {
            this.qqface_down_url = qqface_down_url;
        }

        public void setDownurl(boolean downurl) {
            this.downurl = downurl;
        }

        public void setGrpmd5(boolean grpmd5) {
            this.grpmd5 = grpmd5;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setLitetitle(String litetitle) {
            this.litetitle = litetitle;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public void setImgsize(String imgsize) {
            this.imgsize = imgsize;
        }

        public void setImgtype(String imgtype) {
            this.imgtype = imgtype;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setDspurl(String dspurl) {
            this.dspurl = dspurl;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setThumb_bak(String thumb_bak) {
            this.thumb_bak = thumb_bak;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public void set_thumb_bak(String _thumb_bak) {
            this._thumb_bak = _thumb_bak;
        }

        public void set_thumb(String _thumb) {
            this._thumb = _thumb;
        }

        public void setThumbWidth(int thumbWidth) {
            this.thumbWidth = thumbWidth;
        }

        public void setDsptime(String dsptime) {
            this.dsptime = dsptime;
        }

        public void setThumbHeight(int thumbHeight) {
            this.thumbHeight = thumbHeight;
        }

        public void setGrpcnt(String grpcnt) {
            this.grpcnt = grpcnt;
        }

        public void setFixedSize(boolean fixedSize) {
            this.fixedSize = fixedSize;
        }

        public String getId() {
            return id;
        }

        public boolean isQqface_down_url() {
            return qqface_down_url;
        }

        public boolean isDownurl() {
            return downurl;
        }

        public boolean isGrpmd5() {
            return grpmd5;
        }

        public int getType() {
            return type;
        }

        public int getIndex() {
            return index;
        }

        public String getTitle() {
            return title;
        }

        public String getLitetitle() {
            return litetitle;
        }

        public String getWidth() {
            return width;
        }

        public String getHeight() {
            return height;
        }

        public String getImgsize() {
            return imgsize;
        }

        public String getImgtype() {
            return imgtype;
        }

        public String getKey() {
            return key;
        }

        public String getDspurl() {
            return dspurl;
        }

        public String getLink() {
            return link;
        }

        public int getSource() {
            return source;
        }

        public String getImg() {
            return img;
        }

        public String getThumb_bak() {
            return thumb_bak;
        }

        public String getThumb() {
            return thumb;
        }

        public String get_thumb_bak() {
            return _thumb_bak;
        }

        public String get_thumb() {
            return _thumb;
        }

        public int getThumbWidth() {
            return thumbWidth;
        }

        public String getDsptime() {
            return dsptime;
        }

        public int getThumbHeight() {
            return thumbHeight;
        }

        public String getGrpcnt() {
            return grpcnt;
        }

        public boolean isFixedSize() {
            return fixedSize;
        }
    }
}
