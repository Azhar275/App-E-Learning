
package com.example.e_learning.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Category {

    @SerializedName("lessonid")
    @Expose
    private Integer lessonid;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("jumlah_bab")
    @Expose
    private Integer jumlahBab;

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getJumlahBab() {
        return jumlahBab;
    }

    public void setJumlahBab(Integer jumlahBab) {
        this.jumlahBab = jumlahBab;
    }

}
