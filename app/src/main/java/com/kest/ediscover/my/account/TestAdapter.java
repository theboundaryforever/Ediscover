package com.kest.ediscover.my.account;

import com.kest.ediscover.R;
import com.kest.ediscover.utils.common.BaseArrayRecyclerAdapter;
import com.kest.ediscover.utils.common.BaseRecyclerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2018/4/9 0009.
 */

public class TestAdapter extends BaseArrayRecyclerAdapter<String> {
    public TestAdapter(List<String> mDatas) {
        super(mDatas);
    }

    @Override
    public int bindView(int viewtype) {
        return R.layout.fragment_account_item;
    }

    @Override
    public void onBindHoder(RecyclerHolder holder, String s, int position) {

    }
}
