package parent.guard.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import parent.guard.utility.DataTransferProtocol.AppRequest;


public class HttpRequestService {
  public void executeHttpGet(URI uri) throws Exception {
    BufferedReader in = null;
    try {
        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet();
        request.setURI(uri);
        HttpResponse response = client.execute(request);
        in = new BufferedReader
        (new InputStreamReader(response.getEntity().getContent()));
        StringBuffer sb = new StringBuffer("");
        String line = "";
        String NL = System.getProperty("line.separator");
        while ((line = in.readLine()) != null) {
            sb.append(line + NL);
        }
        in.close();
        String page = sb.toString();
        System.out.println(page);
        } finally {
        if (in != null) {
          try {
            in.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
        }
    }
  }
  public void executeHttpPost(URI uri, AppRequest appRequest) {
    // Create a new HttpClient and Post Header
    HttpClient httpclient = new DefaultHttpClient();
    HttpPost httppost = new HttpPost(uri);

    try {
        httppost.setEntity(new ByteArrayEntity(appRequest.toByteArray()));
        // Execute HTTP Post Request
        HttpResponse response = httpclient.execute(httppost);
    } catch (ClientProtocolException e) {
        // TODO Auto-generated catch block
    } catch (IOException e) {
        // TODO Auto-generated catch block
    }
} 
}
