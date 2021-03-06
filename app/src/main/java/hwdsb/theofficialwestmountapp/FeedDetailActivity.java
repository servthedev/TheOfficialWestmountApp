package hwdsb.theofficialwestmountapp;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;

public class FeedDetailActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_detail);
        webView = (WebView) findViewById(R.id.webView);
        String summary = "<html><head><style>html{box-sizing:border-box;font-size:62.5%;white-space:pre-wrap;word-wrap:break-word}body{color:#606c76;font-family:'Roboto', 'Helvetica Neue', 'Helvetica', 'Arial', sans-serif;font-size:1.6em;font-weight:300;letter-spacing:.01em;line-height:1.6}hr{border:0;border-top:0.1rem solid #f4f5f6;margin:3.0rem 0}a{width:20px;height:20px;color:#9b4dca;text-decoration:none}a:focus,a:hover{color:#606c76}dl,ol,ul{list-style:none;margin-top:0;padding-left:0}dl dl,dl ol,dl ul,ol dl,ol ol,ol ul,ul dl,ul ol,ul ul{font-size:90%;margin:1.5rem 0 1.5rem 3.0rem}ol{list-style:decimal inside}ul{list-style:circle inside}dl,form,ol,p,table,ul{margin-bottom:2.5rem}table{width:100%}td,th{border-bottom:0.1rem solid #e1e1e1;padding:1.2rem 1.5rem;text-align:left}td:first-child,th:first-child{padding-left:0}td:last-child,th:last-child{padding-right:0}b,strong{font-weight:bold}p{margin-top:0}h1,h2,h3,h4,h5,h6{font-weight:300;letter-spacing:-.1rem;margin-bottom:2.0rem;margin-top:0}h1{font-size:4.0rem;line-height:1.2}h2{font-size:3.6rem;line-height:1.25}h3{font-size:3.0rem;line-height:1.3}h4{font-size:2.4rem;letter-spacing:-.08rem;line-height:1.35}h5{font-size:1.8rem;letter-spacing:-.05rem;line-height:1.5}h6{font-size:1.6rem;letter-spacing:0;line-height:1.4}</style></head><body><h4>" + String.valueOf(getIntent().getExtras().get("title")) + "</h4><p>" + String.valueOf(getIntent().getExtras().get("link")).replaceAll("</(?!a)(.*?)>", "").replaceAll("<(?!/)(?!a)(.*?)>", "").replaceAll("<a(.*?)></a>", "").replace("\n", " ") + "</p><p align=\"right\"><em>" + String.valueOf(getIntent().getExtras().get("pubDate")) + "</em></p></body></html>";
        webView.loadDataWithBaseURL(null, summary, "text/html", "utf-8", null);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
