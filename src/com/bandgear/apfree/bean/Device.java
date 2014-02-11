package com.bandgear.apfree.bean;


import java.io.Serializable;

public class Device implements Serializable{
	/**
	 * 连接设备，对应device表
	 */
	private String ip;//连接设备的ip地址
	private String mac;// mac地址
	private Integer outgoing;//上传流量 单位 b
	private Integer incoming;//下载流量 单位 b
	private Integer uprate;//上传速度
	private Integer downrate;//下载速度
	private Integer status;//状态： 1.登录请求  3.计数状态（在线）
	private String update_time;//最后更新时间
	private String netmask;//子网掩码(没使用)
	private String token;//
	private Integer id;//
	private Integer in_ipwhite;//是否白名单
	private Integer kind;//客户端类型： 1，pc 2，移动设备
	
	public Integer getKind() {
		return kind;
	}
	
	
	public void setKind(Integer kind) {
		this.kind = kind;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getUprate() {
		return uprate;
	}
	public void setUprate(Integer uprate) {
		this.uprate = uprate;
	}
	public Integer getDownrate() {
		return downrate;
	}
	public void setDownrate(Integer downrate) {
		this.downrate = downrate;
	}
	public String getNetmask() {
		return netmask;
	}
	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}
	public Integer getIn_ipwhite() {
		return in_ipwhite;
	}
	public void setIn_ipwhite(Integer in_ipwhite) {
		this.in_ipwhite = in_ipwhite;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Integer getOutgoing() {
		return outgoing;
	}
	public void setOutgoing(Integer outgoing) {
		this.outgoing = outgoing;
	}
	public Integer getIncoming() {
		return incoming;
	}
	public void setIncoming(Integer incoming) {
		this.incoming = incoming;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public String toStringTest() {
		return "设备id："+this.id+"\ntoken："+this.token+"\nmac："+this.mac+"\n下载流量："+this.incoming+"\n上传流量："+this.outgoing+"\n最后更新时间："+this.update_time;
	}
}
