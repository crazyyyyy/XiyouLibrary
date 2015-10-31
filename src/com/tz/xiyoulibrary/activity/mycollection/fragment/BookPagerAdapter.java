package com.tz.xiyoulibrary.activity.mycollection.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * User: shine
 * Date: 2015-03-13
 * Time: 09:21
 * Description:
 */
@SuppressWarnings("unchecked")
public class BookPagerAdapter extends FragmentStatePagerAdapter {

    private List<Map<String, String>> mCardList;
	@SuppressWarnings("rawtypes")
	private List<Fragment> mFragments = new ArrayList();

    public BookPagerAdapter(FragmentManager fragmentManager, List<Map<String, String>> cardList) {
        super(fragmentManager);
        //ʹ�õ���������List,
        @SuppressWarnings("rawtypes")
		Iterator iterator = cardList.iterator();
        while (iterator.hasNext()) {
        	Map<String, String> book = (Map<String, String>) iterator.next();
            //ʵ������Ӧ��Fragment����ӵ�List��
            mFragments.add(MyBorrowFragment.getInstance(book));
        }
        mCardList = cardList;
    }

    public int getCount() {
        return mFragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    public List<Map<String, String>> getCardList() {
        return mCardList;
    }

    public List<Fragment> getFragments() {
        return mFragments;
    }
}
