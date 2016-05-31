package co.lilpilot.model;

import javax.persistence.*;

/**
 * Created by xuzywozz on 2016/5/31.
 */
@Entity
@Table(name = "tb_log", schema = "myblog", catalog = "")
public class TbLogEntity {
    private int logId;
    private int userId;
    private String userOption;
    private String status;
    private String remark;
    private TbUserEntity tbUserByUserId;

    @Id
    @Column(name = "log_id", nullable = false)
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_option", nullable = true, length = 255)
    public String getUserOption() {
        return userOption;
    }

    public void setUserOption(String userOption) {
        this.userOption = userOption;
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

        TbLogEntity that = (TbLogEntity) o;

        if (logId != that.logId) return false;
        if (userId != that.userId) return false;
        if (userOption != null ? !userOption.equals(that.userOption) : that.userOption != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logId;
        result = 31 * result + userId;
        result = 31 * result + (userOption != null ? userOption.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    public TbUserEntity getTbUserByUserId() {
        return tbUserByUserId;
    }

    public void setTbUserByUserId(TbUserEntity tbUserByUserId) {
        this.tbUserByUserId = tbUserByUserId;
    }
}
