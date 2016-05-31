package co.lilpilot.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by xuzywozz on 2016/5/31.
 */
@Entity
@Table(name = "tb_comment", schema = "myblog", catalog = "")
public class TbCommentEntity {
    private int commentId;
    private int articleId;
    private String name;
    private String cotent;
    private Timestamp dateCreate;
    private Timestamp dateModify;
    private Timestamp dateDelete;
    private String status;
    private String remark;
    private TbArticleEntity tbArticleByArticleId;

    @Id
    @Column(name = "comment_id", nullable = false)
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "article_id", nullable = false)
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
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
    @Column(name = "cotent", nullable = true, length = 3000)
    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent;
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

        TbCommentEntity that = (TbCommentEntity) o;

        if (commentId != that.commentId) return false;
        if (articleId != that.articleId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (cotent != null ? !cotent.equals(that.cotent) : that.cotent != null) return false;
        if (dateCreate != null ? !dateCreate.equals(that.dateCreate) : that.dateCreate != null) return false;
        if (dateModify != null ? !dateModify.equals(that.dateModify) : that.dateModify != null) return false;
        if (dateDelete != null ? !dateDelete.equals(that.dateDelete) : that.dateDelete != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + articleId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cotent != null ? cotent.hashCode() : 0);
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        result = 31 * result + (dateModify != null ? dateModify.hashCode() : 0);
        result = 31 * result + (dateDelete != null ? dateDelete.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "article_id", nullable = false)
    public TbArticleEntity getTbArticleByArticleId() {
        return tbArticleByArticleId;
    }

    public void setTbArticleByArticleId(TbArticleEntity tbArticleByArticleId) {
        this.tbArticleByArticleId = tbArticleByArticleId;
    }
}
