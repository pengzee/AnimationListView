package work.pengzhe.com.animationlistview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created on 2017/6/27 14:57
 *
 * @author PengZee
 */

public class FishAdapter extends RecyclerView.Adapter<FishViewHolder> {

    private List<String> datas;
    private LayoutInflater inflater;

    public FishAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public FishViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item, parent, false);
        FishViewHolder fishViewHolder = new FishViewHolder(v);
        return fishViewHolder;
    }

    @Override
    public void onBindViewHolder(FishViewHolder holder, int position) {
        TextView tv = holder.tv;
        tv.setText(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    public void setDatas(List<String> datas) {
        this.datas = datas;
    }
}
