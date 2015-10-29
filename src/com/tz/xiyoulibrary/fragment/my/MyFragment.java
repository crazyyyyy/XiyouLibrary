package com.tz.xiyoulibrary.fragment.my;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import com.tz.xiyoulibrary.R;
import com.tz.xiyoulibrary.application.Application;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

@EFragment(R.layout.fragment_my)
public class MyFragment extends Fragment {
	@ViewById(R.id.rl_myborrow_fragment_my)
	RelativeLayout mRelativeLayoutBorrow;// �ҵĽ���
	@ViewById(R.id.rl_collection_fragment_my)
	RelativeLayout mRelativeLayoutCollection;// �ҵ��ղ�
	@ViewById(R.id.rl_foot_fragment_my)
	RelativeLayout mRelativeLayoutFoot;// �ҵ��㼣
	@ViewById(R.id.rl_ranklist_fragment_my)
	RelativeLayout mRelativeLayoutRankList;// ���а�

	@ViewById(R.id.tv_id_fragment_my)
	TextView mTextViewId;// ѧ��
	@ViewById(R.id.tv_department_fragment_my)
	TextView mTextViewDepartment;// �༶

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@AfterViews
	public void init() {
		mTextViewId.setText(Application.user.getId());
		mTextViewDepartment.setText(Application.user.getDepartment());
	}

	/**
	 * �ҵĽ���
	 */
	@Click(R.id.rl_myborrow_fragment_my)
	public void pushMyBorrow() {

	}

	/**
	 * �ҵ��ղ�
	 */
	@Click(R.id.rl_collection_fragment_my)
	public void pushCollection() {

	}

	/**
	 * �ҵ��㼣
	 */
	@Click(R.id.rl_foot_fragment_my)
	public void pushFoot() {

	}

	/**
	 * ���а�
	 */
	@Click(R.id.rl_ranklist_fragment_my)
	public void pushRankList() {

	}
}
