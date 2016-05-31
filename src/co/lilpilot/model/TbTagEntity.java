package co.lilpilot.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by xuzywozz on 2016/5/31.
 */
@Entity
@Table(name = "tb_tag", schema = "myblog", catalog = "")
public class TbTagEntity {
    private int tagId;
    private String name;
    private String status;
    private String remark;
    private Collection<TbArticleEntity> tbArticlesByTagId;

    @Id
    @Column(name = "tag_id", nullable = false)
    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbTagEntity that = (TbTagEntity) o;

        if (tagId != that.tagId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tagId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tbTagByTagId")
    public Collection<TbArticleEntity> getTbArticlesByTagId() {
        return tbArticlesByTagId;
    }

    public void setTbArticlesByTagId(Collection<TbArticleEntity> tbArticlesByTagId) {
        this.tbArticlesByTagId = tbArticlesByTagId;
    }
}
