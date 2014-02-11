package com.bandgear.apfree.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.bandgear.apfree.bean.IPWhite;
import com.bandgear.apfree.bean.Router;
import com.bandgear.apfree.dao.Dao;
import com.bandgear.apfree.utils.Utils4DB;

public class IPWhiteDao implements Dao<IPWhite>{
	QueryRunner qr=null;
	public IPWhiteDao(){
		if(qr==null){
			qr=new QueryRunner(Utils4DB.getDataSource());
		}
	}
	/**
	 * 增加ipwhite
	 */
	@Override
	public void add(IPWhite t) throws SQLException {
		qr.update("insert into rule_ipwhite(ap_id,ip ,netmask,enable) values(?,?,?,?)", new Object[]{t.getAp_id(),t.getIp(),t.getNetmask(),t.getEnable()+""});
	}

	/**
	 * 删除ipwhite（通过id）
	 */
	@Override
	public void delete(IPWhite t) throws SQLException {
		qr.update("delete from rule_ipwhite where id=?", t.getId());
	}

	/**
	 * 获取所有ipwhite
	 */
	@Override
	public List<IPWhite> find() throws SQLException {
		return qr.query("select * from rule_ipwhite", new BeanListHandler(IPWhite.class));
	}

	@Override
	public void update(IPWhite t) throws SQLException {
		
	}
	
	/**
	 * 通过device_token获取对应的ipwhite
	 * @throws SQLException 
	 */
	public List<IPWhite> findByDeviceToken(String device_token) throws SQLException{
		return qr.query("select * from rule_ipwhite where ap_id =(select ap_id from ap where dev_md5=?)", 
				new BeanListHandler(IPWhite.class), new Object[]{device_token});
	}
	
	/**
	 * 通过device_token删除对应的ipwhite
	 * @throws SQLException 
	 */
	public void delByDeviceToken(String device_token) throws SQLException{
		qr.update("delete from rule_ipwhite where ap_id=(select ap_id from ap where dev_md5=?)", device_token);
	}
}
