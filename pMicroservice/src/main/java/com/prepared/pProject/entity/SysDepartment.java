package com.prepared.pProject.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 机构表
 * </p>
 *
 * @author Gensokyo V.L.
 * @since 2017-07-31
 */
@TableName("T_SYS_DEPARTMENT")
public class SysDepartment extends Model<SysDepartment> {

	private static final long serialVersionUID = 1L;

	/**
	 * 机构类型
	 */
	@TableField("JGLX")
	private String jglx;
	/**
	 * 业务描述
	 */
	@TableField("YWMS")
	private String ywms;
	/**
	 * 机构职能
	 */
	@TableField("JGZN")
	private String jgzn;
	/**
	 * 行政级别
	 */
	@TableField("XZJB")
	private String xzjb;
	/**
	 * 机构层次编码
	 */
	@TableField("JGCCBM")
	private String jgccbm;
	/**
	 * 机构名称
	 */
	@TableField("JGMC")
	private String jgmc;
	/**
	 * 机构ID
	 */
	@TableId("JGID")
	private String jgid;
	/**
	 * 机构编码，取值与JGID一致。
	 */
	@TableField("JGCODE")
	private String jgcode;

	/**
	 * 机构显示顺序
	 */
	@TableField("COMMANDORDER")
	private String commandorder;
	/**
	 * 机构父节点ID
	 */
	@TableField("JGPARENTID")
	private String jgparentid;
	/**
	 * 传真
	 */
	@TableField("CZDH")
	private String czdh;
	/**
	 * 值班电话3
	 */
	@TableField("ZBDH3")
	private String zbdh3;
	/**
	 * 值班电话2
	 */
	@TableField("ZBDH2")
	private String zbdh2;
	/**
	 * 值班电话1
	 */
	@TableField("ZBDH1")
	private String zbdh1;
	/**
	 * 负责人手机
	 */
	@TableField("FZRSJ")
	private String fzrsj;
	/**
	 * 负责人电话
	 */
	@TableField("FZRDH")
	private String fzrdh;
	/**
	 * 负责人
	 */
	@TableField("FZR")
	private String fzr;
	/**
	 * 其他人数
	 */
	@TableField("QTRS")
	private String qtrs;
	/**
	 * 在编职工数
	 */
	@TableField("ZBZGS")
	private String zbzgs;
	/**
	 * 在编民警数
	 */
	@TableField("ZBMJS")
	private String zbmjs;
	/**
	 * 编制人数
	 */
	@TableField("BZRS")
	private String bzrs;
	/**
	 * 邮政编码
	 */
	@TableField("YZBM")
	private String yzbm;
	/**
	 * 所处地址
	 */
	@TableField("SCDZ")
	private String scdz;
	/**
	 * 更新时间
	 */
	@TableField("GXSJ")
	private Date gxsj;

	public String getJglx() {
		return jglx;
	}

	public void setJglx(String jglx) {
		this.jglx = jglx;
	}

	public String getYwms() {
		return ywms;
	}

	public void setYwms(String ywms) {
		this.ywms = ywms;
	}

	public String getJgzn() {
		return jgzn;
	}

	public void setJgzn(String jgzn) {
		this.jgzn = jgzn;
	}

	public String getXzjb() {
		return xzjb;
	}

	public void setXzjb(String xzjb) {
		this.xzjb = xzjb;
	}

	public String getJgccbm() {
		return jgccbm;
	}

	public void setJgccbm(String jgccbm) {
		this.jgccbm = jgccbm;
	}

	public String getJgmc() {
		return jgmc;
	}

	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}

	public String getJgid() {
		return jgid;
	}

	public void setJgid(String jgid) {
		this.jgid = jgid;
	}

	public String getJgcode() {
		return jgcode;
	}

	public void setJgcode(String jgcode) {
		this.jgcode = jgcode;
	}

	public String getCommandorder() {
		return commandorder;
	}

	public void setCommandorder(String commandorder) {
		this.commandorder = commandorder;
	}

	public String getJgparentid() {
		return jgparentid;
	}

	public void setJgparentid(String jgparentid) {
		this.jgparentid = jgparentid;
	}

	public String getCzdh() {
		return czdh;
	}

	public void setCzdh(String czdh) {
		this.czdh = czdh;
	}

	public String getZbdh3() {
		return zbdh3;
	}

	public void setZbdh3(String zbdh3) {
		this.zbdh3 = zbdh3;
	}

	public String getZbdh2() {
		return zbdh2;
	}

	public void setZbdh2(String zbdh2) {
		this.zbdh2 = zbdh2;
	}

	public String getZbdh1() {
		return zbdh1;
	}

	public void setZbdh1(String zbdh1) {
		this.zbdh1 = zbdh1;
	}

	public String getFzrsj() {
		return fzrsj;
	}

	public void setFzrsj(String fzrsj) {
		this.fzrsj = fzrsj;
	}

	public String getFzrdh() {
		return fzrdh;
	}

	public void setFzrdh(String fzrdh) {
		this.fzrdh = fzrdh;
	}

	public String getFzr() {
		return fzr;
	}

	public void setFzr(String fzr) {
		this.fzr = fzr;
	}

	public String getQtrs() {
		return qtrs;
	}

	public void setQtrs(String qtrs) {
		this.qtrs = qtrs;
	}

	public String getZbzgs() {
		return zbzgs;
	}

	public void setZbzgs(String zbzgs) {
		this.zbzgs = zbzgs;
	}

	public String getZbmjs() {
		return zbmjs;
	}

	public void setZbmjs(String zbmjs) {
		this.zbmjs = zbmjs;
	}

	public String getBzrs() {
		return bzrs;
	}

	public void setBzrs(String bzrs) {
		this.bzrs = bzrs;
	}

	public String getYzbm() {
		return yzbm;
	}

	public void setYzbm(String yzbm) {
		this.yzbm = yzbm;
	}

	public String getScdz() {
		return scdz;
	}

	public void setScdz(String scdz) {
		this.scdz = scdz;
	}

	public Date getGxsj() {
		return gxsj;
	}

	public void setGxsj(Date gxsj) {
		this.gxsj = gxsj;
	}

	@Override
	protected Serializable pkVal() {
		return this.jgid;
	}

	@Override
	public String toString() {
		return "SysDepartment{" +
				"jglx='" + jglx + '\'' +
				", ywms='" + ywms + '\'' +
				", jgzn='" + jgzn + '\'' +
				", xzjb='" + xzjb + '\'' +
				", jgccbm='" + jgccbm + '\'' +
				", jgmc='" + jgmc + '\'' +
				", jgid='" + jgid + '\'' +
				", jgcode='" + jgcode + '\'' +
				", commandorder='" + commandorder + '\'' +
				", jgparentid='" + jgparentid + '\'' +
				", czdh='" + czdh + '\'' +
				", zbdh3='" + zbdh3 + '\'' +
				", zbdh2='" + zbdh2 + '\'' +
				", zbdh1='" + zbdh1 + '\'' +
				", fzrsj='" + fzrsj + '\'' +
				", fzrdh='" + fzrdh + '\'' +
				", fzr='" + fzr + '\'' +
				", qtrs='" + qtrs + '\'' +
				", zbzgs='" + zbzgs + '\'' +
				", zbmjs='" + zbmjs + '\'' +
				", bzrs='" + bzrs + '\'' +
				", yzbm='" + yzbm + '\'' +
				", scdz='" + scdz + '\'' +
				", gxsj=" + gxsj +
				'}';
	}
}
