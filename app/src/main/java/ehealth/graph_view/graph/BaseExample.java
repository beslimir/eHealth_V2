package ehealth.graph_view.graph;

import com.example.beslimir.ehealth.graph_view.FullscreenActivity;
import com.jjoe64.graphview.GraphView;

/**
 * Created by jonas on 10.09.16.
 */
public abstract class BaseExample {
    public abstract void onCreate(FullscreenActivity fullscreenActivity);
    public abstract void initGraph(GraphView graph);

    public void onPause() {}
    public void onResume() {}
}
