package com.tz.xiyoulibrary.activity.mycollection.activity.view;

import java.util.List;
import java.util.Map;

public interface IMyCollectionView {

	/**
	 * ��ʾ�ղ�����/��ȡ���ݳɹ�
	 * 
	 * @param favoriteData
	 */
	void showFavoriteData(List<Map<String, String>> favoriteData);

	/**
	 * ��ȡ����ʧ��
	 */
	void showGetDataFaluire();

	/**
	 * ��ǰû���ղ�
	 */
	void showGetDataNoData();
	
	void showMsg(String msg);
}
