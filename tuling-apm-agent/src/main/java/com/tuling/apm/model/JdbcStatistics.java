package com.tuling.apm.model;

public class JdbcStatistics extends BaseStatistics {
	public Long begin;
	public Long end;
	public Long usrTime;
	// jdbc url
	public String jdbcUrl;
	// sql 语句
	public String sql;
	// 数据库名称
	public String databaseName;
	
	public String error;
	public String errorType;

	public JdbcStatistics() {

	}
}