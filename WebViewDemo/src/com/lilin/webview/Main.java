package com.lilin.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		WebView webView = (WebView) findViewById(R.id.webview);
		
		// 不允许通过外部浏览器打开URL
		webView.setWebViewClient(new WebViewClient() {
			public boolean shouldOverrideUrlLoading(WebView view, String url) { 
				view.loadUrl(url);
				return true;
			}
		});

		// 设置缓存
		webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
		
		webView.getSettings().setJavaScriptEnabled(true);
		/* 打开网页 */
		 String URL="http://www.baidu.com/";
		 webView.loadUrl(URL);

		/* 加载HTML */

		// String html = "";
		// html += "<html>";
		// html += "<body>";
		// html += "<a href=http://www.baidu.com/>Baidu</a>";
		// html += "</body>";
		// html += "</html>";
		//
		// webView.loadData(html, "text/html", "utf-8");

		/* 加载SDCard中的图片资源 */

//		String htmlPath = "file:///sdcard/test/test.html";
//
//		String html = "<html xmlns=" + "http://www.w3.org/1999/xhtml" + ">";
//		html += "<head>";
//		html += "<meta http-equiv=" + "Content-Type" + " content="
//				+ "text/html; charset=utf-8" + " />";
//		html += "<title>测试</title>";
//		html += "</head>";
//		html += "测试<img src=" + "1.jpg" + ">";
//		html += "<body></body></html>";
//
//		String baseUrl = "file:///sdcard/test/";
//
//		webView.loadDataWithBaseURL(baseUrl, html, "text/html", "utf-8", null);
//		webView.loadUrl("file:///android_asset/sqxz.html"); 

		/* 加载SDCard中的HTML和图片资源文件 */

		// String htmlPath = "file:///sdcard/test/test.html";
		// String baseUrl = "file:///sdcard/test/";//图片资源所在的目录
		// webView.loadDataWithBaseURL(baseUrl, html, "text/html", "utf-8",
		// null);
		// webView.loadUrl(htmlPath);

	}
}