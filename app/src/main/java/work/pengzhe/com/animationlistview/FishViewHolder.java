package work.pengzhe.com.animationlistview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created on 2017/6/27 15:35
 *
 * @author PengZee
 */

public class FishViewHolder extends RecyclerView.ViewHolder {

    TextView tv;

    public FishViewHolder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.id_num);
    }

}
