package cn.panchen.chatbot.api.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

public class ApiTest {

    @Test
    public void query_unanswered_question() throws IOException {

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/48888522184528/topics?scope=unanswered_questions&count=20");

//        get.addHeader("cookie","sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22415455851528588%22%2C%22first_id%22%3A%221918d8c9b211c2-0a059e60382fc2-4c657b58-1821369-1918d8c9b222390%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTkxOGQ4YzliMjExYzItMGEwNTllNjAzODJmYzItNGM2NTdiNTgtMTgyMTM2OS0xOTE4ZDhjOWIyMjIzOTAiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI0MTU0NTU4NTE1Mjg1ODgifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22415455851528588%22%7D%2C%22%24device_id%22%3A%221918d9b8fa1a18-095bef6cca8d73-4c657b58-1821369-1918d9b8fa2157c%22%7D; zsxqsessionid=0e4f2ff2470dd2a48e6c1337713231bb; abtest_env=product; zsxq_access_token=D8769109-8998-09EE-A07C-67B73711A2C0_125D61FDB7799A6F");
        get.addHeader("cookie","sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22415455851528588%22%2C%22first_id%22%3A%221918d8c9b211c2-0a059e60382fc2-4c657b58-1821369-1918d8c9b222390%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTkxOGQ4YzliMjExYzItMGEwNTllNjAzODJmYzItNGM2NTdiNTgtMTgyMTM2OS0xOTE4ZDhjOWIyMjIzOTAiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI0MTU0NTU4NTE1Mjg1ODgifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22415455851528588%22%7D%2C%22%24device_id%22%3A%221918d9b8fa1a18-095bef6cca8d73-4c657b58-1821369-1918d9b8fa2157c%22%7D; zsxqsessionid=0e4f2ff2470dd2a48e6c1337713231bb; abtest_env=product; zsxq_access_token=1E00BAF4-1B55-0E74-FA22-4577C6AF3421_125D61FDB7799A6F; tfstk=f2NEjK1bt6CUXn5WN2lr7fIARXhLMXjXZ7iSrz4oRDmHOQwNEz4nRYjKO7raDreCyYcha8rY03i3OYZyZzn9Z3AkZFAiz4gHq00nIFcL1JOSAMhzroGPci1fGyUKHbjfc_hvmZcmu0AHVvmgS9lfP-5fGyUhv_djzs_RlA-jD0coKDYgSc3y-BqoEP0iX43kx4Ah7Nu-jQAoEB0iI43e-bcuqPbZyAMgjoxjovbVyBP4isIihm4nxyN4sIhBplmZADFZ8ynu-KAkZ5uEK7smscmEd84xHWa5aChQuRciz7QDU0k4EWGgtGfmBY2uhYy6xwZ04Pq-O5bkKm2QAfV33UAu7Xyne2kwYGo09PVxsA1cuPVTAyFaPUfo5oigJWcPiZhEtDcZW7s9t0ygEWMKwHjr25zgt8Srh33iKoN8L3vrKV3ZcN7ahJzjQ4SLSppJeAD-7m_KELp-KjdWLSDveLHiWVofJxf..");
//        get.addHeader("cookie","");
        get.addHeader("Content_Type", "application/json;charset=utf8");

        CloseableHttpResponse response = httpClient.execute(get);

        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {// SC_OK 就是 200 回传正确
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/4844125154818848/answer");

//        post.addHeader("cookie","sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22415455851528588%22%2C%22first_id%22%3A%221918d8c9b211c2-0a059e60382fc2-4c657b58-1821369-1918d8c9b222390%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTkxOGQ4YzliMjExYzItMGEwNTllNjAzODJmYzItNGM2NTdiNTgtMTgyMTM2OS0xOTE4ZDhjOWIyMjIzOTAiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI0MTU0NTU4NTE1Mjg1ODgifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22415455851528588%22%7D%2C%22%24device_id%22%3A%221918d9b8fa1a18-095bef6cca8d73-4c657b58-1821369-1918d9b8fa2157c%22%7D; zsxqsessionid=0e4f2ff2470dd2a48e6c1337713231bb; abtest_env=product; zsxq_access_token=D8769109-8998-09EE-A07C-67B73711A2C0_125D61FDB7799A6F");
//        post.addHeader("cookie","sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22415455851528588%22%2C%22first_id%22%3A%221918d8c9b211c2-0a059e60382fc2-4c657b58-1821369-1918d8c9b222390%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTkxOGQ4YzliMjExYzItMGEwNTllNjAzODJmYzItNGM2NTdiNTgtMTgyMTM2OS0xOTE4ZDhjOWIyMjIzOTAiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI0MTU0NTU4NTE1Mjg1ODgifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22415455851528588%22%7D%2C%22%24device_id%22%3A%221918d9b8fa1a18-095bef6cca8d73-4c657b58-1821369-1918d9b8fa2157c%22%7D; zsxqsessionid=0e4f2ff2470dd2a48e6c1337713231bb; abtest_env=product; zsxq_access_token=D8769109-8998-09EE-A07C-67B73711A2C0_125D61FDB7799A6F");
//        get.addHeader("cookie","");
        post.addHeader("cookie","sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22415455851528588%22%2C%22first_id%22%3A%221918d8c9b211c2-0a059e60382fc2-4c657b58-1821369-1918d8c9b222390%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTkxOGQ4YzliMjExYzItMGEwNTllNjAzODJmYzItNGM2NTdiNTgtMTgyMTM2OS0xOTE4ZDhjOWIyMjIzOTAiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI0MTU0NTU4NTE1Mjg1ODgifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22415455851528588%22%7D%2C%22%24device_id%22%3A%221918d9b8fa1a18-095bef6cca8d73-4c657b58-1821369-1918d9b8fa2157c%22%7D; zsxqsessionid=0e4f2ff2470dd2a48e6c1337713231bb; abtest_env=product; zsxq_access_token=1E00BAF4-1B55-0E74-FA22-4577C6AF3421_125D61FDB7799A6F; tfstk=f2NEjK1bt6CUXn5WN2lr7fIARXhLMXjXZ7iSrz4oRDmHOQwNEz4nRYjKO7raDreCyYcha8rY03i3OYZyZzn9Z3AkZFAiz4gHq00nIFcL1JOSAMhzroGPci1fGyUKHbjfc_hvmZcmu0AHVvmgS9lfP-5fGyUhv_djzs_RlA-jD0coKDYgSc3y-BqoEP0iX43kx4Ah7Nu-jQAoEB0iI43e-bcuqPbZyAMgjoxjovbVyBP4isIihm4nxyN4sIhBplmZADFZ8ynu-KAkZ5uEK7smscmEd84xHWa5aChQuRciz7QDU0k4EWGgtGfmBY2uhYy6xwZ04Pq-O5bkKm2QAfV33UAu7Xyne2kwYGo09PVxsA1cuPVTAyFaPUfo5oigJWcPiZhEtDcZW7s9t0ygEWMKwHjr25zgt8Srh33iKoN8L3vrKV3ZcN7ahJzjQ4SLSppJeAD-7m_KELp-KjdWLSDveLHiWVofJxf..");
        post.addHeader("Content_Type", "application/json;charset=utf8");

        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"我也不会！\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"silenced\": true\n" +
                "  }\n" +
                "}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {// SC_OK 就是 200 回传正确
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
}
