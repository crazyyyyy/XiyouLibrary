package com.tz.xiyoulibrary.bean;

import java.io.Serializable;

public class UserBean implements Serializable {

	private static final long serialVersionUID = -4141648451031370940L;
	private String id;// ѧ��
	private String name;// ����
	private String fromData;// ��Ч�ڿ�ʼ����
	private String toData;// ��Ч�ڽ�������
	private String readerType;// �û����
	private String department;// ������λ
	private String debt;// Ƿ�ѽ��

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFromData() {
		return fromData;
	}

	public void setFromData(String fromData) {
		this.fromData = fromData;
	}

	public String getToData() {
		return toData;
	}

	public void setToData(String toData) {
		this.toData = toData;
	}

	public String getReaderType() {
		return readerType;
	}

	public void setReaderType(String readerType) {
		this.readerType = readerType;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDebt() {
		return debt;
	}

	public void setDebt(String debt) {
		this.debt = debt;
	}

}
