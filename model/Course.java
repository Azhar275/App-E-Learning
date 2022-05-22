
package com.example.e_learning.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Course {

    @SerializedName("lessonid")
    @Expose
    private Integer lessonid;
    @SerializedName("namaBab")
    @Expose
    private String namaBab;
    @SerializedName("kelas")
    @Expose
    private String kelas;
    @SerializedName("daftarBab")
    @Expose
    private List<DaftarBab> daftarBab = null;

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public String getNamaBab() {
        return namaBab;
    }

    public void setNamaBab(String namaBab) {
        this.namaBab = namaBab;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public List<DaftarBab> getDaftarBab() {
        return daftarBab;
    }

    public void setDaftarBab(List<DaftarBab> daftarBab) {
        this.daftarBab = daftarBab;
    }

}
