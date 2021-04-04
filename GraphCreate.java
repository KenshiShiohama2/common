package com.example.demo.repository;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Repository;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.WritableImage;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
@Repository
public class GraphCreate extends Application{

//	@Autowired
//	Item Item;

//	Item item = new Item();



	@Override
	 public void start(Stage stage) {

		final String HOST = "localhost";
	    final int PORT = 9200;
	    final String SCHEME = "http";
	    final String INDEX = "demo4";
	    final String TYPE = "_doc";



//	    SearchRequest searchRequest = new SearchRequest().indices(INDEX).types(TYPE);
//
//	    SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
//
//	    //検索条件設定
//	    sourceBuilder.size(0);
//	    TermsAggregationBuilder aggregation = AggregationBuilders.terms("my_name_term")
//	            .field("name.keyword")
//	            .size(10)
//	            .order(BucketOrder.count(true));
//	    sourceBuilder.aggregation(aggregation);
//
//	    //設定した検索条件をリクエストに追加
//       searchRequest.source(sourceBuilder);
//
//       //結果を格納するマップ用意
//       Map<String, Long> countMap = new HashMap<>();
//
//       // 検索実行
//       try (RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost(HOST, PORT, SCHEME)))) {
//           SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);
//
//           //検索結果を取得
//           Aggregations aggregations = response.getAggregations();
//           Terms agg = aggregations.get("my_name_term");
//
//           for (Terms.Bucket entry : agg.getBuckets()) {
//        	    String key = entry.getKeyAsString();            // bucket key
//        	    long docCount = entry.getDocCount();            // Doc count
////        	    System.out.println("key:" + key + " count:" + docCount);
//        	    countMap.put(key,docCount);
//        	}
//
//           client.close();
//
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//
//        Scene scene = new Scene(new Group());
//        stage.setTitle("検索ヒット文字列_件数");
//        stage.setWidth(500);
//        stage.setHeight(500);
//
////        ObservableList<PieChart.Data> pieChartData = null;
//
//        List<PieChart.Data> contents = new ArrayList<>();
//        for(Map.Entry<String, Long> entry : countMap.entrySet()) {
//        	System.out.println(entry.getKey() + " : " + entry.getValue());
//
//        	contents.add(new PieChart.Data(entry.getKey(), entry.getValue().doubleValue()));
//
//        }
//        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(contents);
//
//
////        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
////	        new PieChart.Data("中", 4),
////	        new PieChart.Data("123456789", 10),
////	        new PieChart.Data("田", 10));
//        final PieChart chart = new PieChart(pieChartData);
//        chart.setTitle("検索ヒット文字列_件数");
//
//        ((Group) scene.getRoot()).getChildren().add(chart);
//        stage.setScene(scene);
//
//        WritableImage image = chart.snapshot(new SnapshotParameters(), null);
//        try {
//			saveImage(image, "D:\\pleiades\\workspace\\rest-api\\src\\main\\resources\\static\\images\\", "jpg");
//		} catch (IOException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}
//
//        stage.show();
//        stage.close();

    }

	private boolean saveImage(WritableImage img, String base, String fmt) throws IOException{
	    File f = new File(base + "test." + fmt);
	    return ImageIO.write(SwingFXUtils.fromFXImage(img, null), fmt, f);
	}
	public String alter() throws IOException{
	    File f = new File("D:\\pleiades\\workspace\\rest-api\\src\\main\\resources\\static\\images\\test.jpg");
        BufferedImage image = ImageIO.read(f);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(baos);
        image.flush();

        // 読み終わった画像をバイト出力へ。
        ImageIO.write(image, "png", bos);
        bos.flush();
        bos.close();
        byte[] bImage = baos.toByteArray();

        // バイト配列→BASE64へ変換する
        Base64 base64 = new Base64();
        byte[] encoded = base64.encode(bImage);
        String base64Image = new String(encoded);

        return base64Image;
	}


    public void create(Map<String, Long> countMap) {
//    	item.setCountMap(countMap);
    	launch();
    }

}
