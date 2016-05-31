package co.lilpilot.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by xuzywozz on 2016/5/31.
 */
@Entity
@Table(name = "tb_article", schema = "myblog", catalog = "")
public class TbArticleEntity {
    private int articleId;
    private Integer tagId;
    private String title;
    private Timestamp dateCreate;
    private Timestamp dateModify;
    private Timestamp dateDelete;
    private String content;
    private String status;
    private String remark;
    private TbTagEntity tbTagByTagId;
    private Collection<TbCommentEntity> tbCommentsByArticleId;

    @Id
    @Column(name = "article_id", nullable = false)
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "tag_id", nullable = true)
    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "date_create", nullable = false)
    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Basic
    @Column(name = "date_modify", nullable = false)
    public Timestamp getDateModify() {
        return dateModify;
    }

    public void setDateModify(Timestamp dateModify) {
        this.dateModify = dateModify;
    }

    @Basic
    @Column(name = "date_delete", nullable = false)
    public Timestamp getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Timestamp dateDelete) {
        this.dateDelete = dateDelete;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 20000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

        TbArticleEntity that = (TbArticleEntity) o;

        if (articleId != that.articleId) return false;
        if (tagId != null ? !tagId.equals(that.tagId) : that.tagId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (dateCreate != null ? !dateCreate.equals(that.dateCreate) : that.dateCreate != null) return false;
        if (dateModify != null ? !dateModify.equals(that.dateModify) : that.dateModify != null) return false;
        if (dateDelete != null ? !dateDelete.equals(that.dateDelete) : that.dateDelete != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (tagId != null ? tagId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        result = 31 * result + (dateModify != null ? dateModify.hashCode() : 0);
        result = 31 * result + (dateDelete != null ? dateDelete.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "tag_id", referencedColumnName = "tag_id")
    public TbTagEntity getTbTagByTagId() {
        return tbTagByTagId;
    }

    public void setTbTagByTagId(TbTagEntity tbTagByTagId) {
        this.tbTagByTagId = tbTagByTagId;
    }

    @OneToMany(mappedBy = "tbArticleByArticleId")
    public Collection<TbCommentEntity> getTbCommentsByArticleId() {
        return tbCommentsByArticleId;
    }

    public void setTbCommentsByArticleId(Collection<TbCommentEntity> tbCommentsByArticleId) {
        this.tbCommentsByArticleId = tbCommentsByArticleId;
    }
}
