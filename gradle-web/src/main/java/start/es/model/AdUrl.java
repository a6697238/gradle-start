package start.es.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "adurl",type = "type001")
@Data
public class AdUrl {

  @Id
  private String uuid;
  private long uid;
  private long aid;
  private long cid;
  private String destUrl;
  private String destUrlMd5;
  private int adSource;
  private List<String> pcCrawlUuids;
  private List<String> iosCrawlUuids;
  private List<String> androidCrawlUuids;
  private boolean ifIdentified;
  private long createTime;
  private int partitionNo;

}
