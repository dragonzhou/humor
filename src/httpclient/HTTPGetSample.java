package httpclient;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;




public class HTTPGetSample {
	private static PoolingHttpClientConnectionManager	connMgr;
	private static CloseableHttpClient					httpClient;
	private static RequestConfig						requestConfig;

	static {
		// 设置连接池
		connMgr = new PoolingHttpClientConnectionManager();
		connMgr.setMaxTotal(40);
		connMgr.setDefaultMaxPerRoute(20);
		// 设置超时时间
		Builder configBuilder = RequestConfig.custom();
		configBuilder.setSocketTimeout(500);
		configBuilder.setConnectTimeout(500);
		configBuilder.setConnectionRequestTimeout(500);
		requestConfig = configBuilder.build();
	}

	public static String doGet(String url) {
		httpClient = HttpClients.custom().setConnectionManager(connMgr).setDefaultRequestConfig(requestConfig).build();
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response = null;
		HttpEntity entity = null;
		try {
			httpGet.setConfig(requestConfig);
			response = httpClient.execute(httpGet);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != HttpStatus.SC_OK) {
				return null;
			}
			entity = response.getEntity();
			if (entity == null) {
				return null;
			}
			String result = EntityUtils.toString(entity, "utf-8");
			return result;
		} catch (Exception e) {

		} finally {
			if (entity != null) {
				try {
					entity.getContent().close();
				} catch (IllegalStateException e) {
				} catch (IOException e) {
				}

			}
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
				}
			}
			if (httpGet != null) {
				httpGet.releaseConnection();
			}
		}
		return null;
	}

	public static String doPost(String url, List<NameValuePair> params) throws IOException {
		httpClient = HttpClients.custom().setConnectionManager(connMgr).setDefaultRequestConfig(requestConfig).build();
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response = null;
		HttpEntity entity = null;
		try {
			httpPost.setConfig(requestConfig);
			httpPost.setEntity(new UrlEncodedFormEntity(params));
			response = httpClient.execute(httpPost);
			System.out.println(httpPost.getURI());
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != HttpStatus.SC_OK) {
				return null;
			}
			entity = response.getEntity();
			if (entity == null) {

				return null;
			}
			String result = EntityUtils.toString(entity, "utf-8");
			return result;
			// JSON.parseObject(result, FraudApiResponse.class);
		} catch (Exception e) {

		} finally {
			if (entity != null) {
				entity.getContent().close();

			}
			if (response != null) {
				response.close();
			}
			if (httpPost != null) {
				httpPost.releaseConnection();
			}
		}
		return null;
	}
    public static void main(String[] args) throws ClientProtocolException, IOException {
        String url = "http://blog.csdn.net/wangpeng047/article/details/19624529";
        System.out.println(doGet(url));

        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("q", "httpclient"));
        qparams.add(new BasicNameValuePair("btnG", "Google Search"));
        qparams.add(new BasicNameValuePair("aq", "f"));
        qparams.add(new BasicNameValuePair("oq", null));
       
        System.out.println(doPost(url,qparams));

    }
}
