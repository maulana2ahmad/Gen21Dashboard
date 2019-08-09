package gen21dashboard.com.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import gen21dashboard.com.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Summny4TVFragment extends Fragment {

    private WebView wvSummry;

    private String postURL = "https://inet.detik.com/?tag_from=wp_firstnav_detiki-net&_ga=2.246958343.2004592449.1565350158-753756912.1565350158";


    public Summny4TVFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_summny_4_tv, container, false);

        wvSummry = (WebView) v.findViewById(R.id.wvSummry);

        wvSummry.getSettings().setJavaScriptEnabled(true); //active javaScriptEnabled

        wvSummry.setWebViewClient(new WebViewClient());

        wvSummry.loadUrl(postURL);

        wvSummry.setHorizontalScrollBarEnabled(false);
        return v;
    }

}
