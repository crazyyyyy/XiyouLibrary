package com.tz.xiyoulibrary.bean;

import java.io.Serializable;

/**
 * 
 * @author tianzhao ͼ���
 */
public class BookBean implements Serializable {

	private static final long serialVersionUID = -5223987826917760780L;
	private String title;
	private String barCode;// ������
	private String department;// ���ڷֹ�
	private String state;// ��ǰ״̬
	private String date;// Ӧ������
	private boolean canRenew;// �Ƿ������
	private String department_id;// ���ID�ţ���������
	private String library_id;// �ֹ�ID�ţ���������

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isCanRenew() {
		return canRenew;
	}

	public void setCanRenew(boolean canRenew) {
		this.canRenew = canRenew;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getLibrary_id() {
		return library_id;
	}

	public void setLibrary_id(String library_id) {
		this.library_id = library_id;
	}

}
