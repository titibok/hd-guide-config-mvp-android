package hd.java_mvp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by user1 on 6/13/2017.
 */

public class Product implements Serializable {
    @SerializedName("detail")
    private String detail;

    @SerializedName("imgPath")
    private String imgPath;

    @SerializedName("name")
    private String name;

    @SerializedName("path")
    private String path;

    @SerializedName("percent")
    private int percent;

    @SerializedName("point")
    private int point;

    @SerializedName("price")
    private int price;

    @SerializedName("size")
    private List<String> size;

    @SerializedName("tag")
    private List<String> tag;

    //----------------------------------------------------------------------------------------------
    public String getDetail() {
        return detail;
    }

    public String getImgPath() {
        return imgPath;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public int getPercent() {
        return percent;
    }

    public int getPoint() {
        return point;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getSize() {
        return size;
    }

    public List<String> getTag() {
        return tag;
    }

    //----------------------------------------------------------------------------------------------
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(List<String> size) {
        this.size = size;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }
}