package com.tz.xiyoulibrary.utils;

public class JsonUtils {

	public static String getErrorMsg(String errorTag) {
		String errorInfo = null;
		if (errorTag.equals("ACCOUNT_ERROR")) {
			errorInfo = "�˺Ŵ������������˻�������";
		} else if (errorTag.equals("USER_NOT_LOGIN")) {
			errorInfo = "�û�δ��½";
		} else if (errorTag.equals("NO_RECORD")) {
			errorInfo = "��¼Ϊ��";
		} else if (errorTag.equals("REMOTE_SERVER_ERROR")) {
			errorInfo = "Զ�̷���������";
		} else if (errorTag.equals("PARAM_ERROR")) {
			errorInfo = "��������";
		} else if (errorTag.equals("RENEW_FAILED")) {
			errorInfo = "����ʧ��";
		} else if (errorTag.equals("OUT_OF_RANGE")) {
			errorInfo = "������Χ";
		}
		return errorInfo;
	}
}
