package work.pengzhe.com.animationlistview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created on 2017/6/27 14:31
 *
 * @author PengZee
 */

public class RecyclerViewDemoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FishAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_recycler);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new FishAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MessageItemTouchCallback callback = new MessageItemTouchCallback();
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(recyclerView);

    }
}
