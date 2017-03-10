package io.github.vftdan.customvk;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 10.03.2017.
 */

public class VH extends RecyclerView.ViewHolder {
    public VH(View itemView) {
        super(itemView);

        btn = (Button) itemView.findViewById(R.id.item_lbutton);
    }
    private Button btn;
    public void  updUI(ItemData idata) {
        btn.setText(idata.title);
    }
}
