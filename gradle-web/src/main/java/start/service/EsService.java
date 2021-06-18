package start.service;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import start.entity.UserEntity;
import start.es.model.AdUrl;
import start.es.repository.AdurlRepository;

@Service
public class EsService {

  @Autowired
  private AdurlRepository adurlRepository;

  public boolean putAdUrl() {
    AdUrl adUrl = new AdUrl();
    adUrl.setUuid(UUID.randomUUID().toString());
    long id = System.currentTimeMillis()%1000;

    adUrl.setUid(id);
    adUrl.setAid(id);
    adUrl.setAid(id);

    adUrl.setAdSource((int)id * 10);
    adUrl.setPartitionNo(1);

    adUrl.setIfIdentified(id%2==0);
    adUrl.setCreateTime(System.currentTimeMillis()/1000);

    adUrl.setDestUrl("http:www.baidu.com");
    adUrl.setDestUrlMd5("md5");

    List<String> pcCrawlUuids = Lists.newArrayList();
    pcCrawlUuids.add("pcCrawlUuids1");
    pcCrawlUuids.add("pcCrawlUuids2");
    pcCrawlUuids.add("pcCrawlUuids3");
    adUrl.setPcCrawlUuids(pcCrawlUuids);

    List<String> iosCrawlUuids = Lists.newArrayList();
    iosCrawlUuids.add("iosCrawlUuids1");
    iosCrawlUuids.add("iosCrawlUuids2");
    iosCrawlUuids.add("iosCrawlUuids3");
    adUrl.setIosCrawlUuids(iosCrawlUuids);


    List<String> androidCrawlUuids = Lists.newArrayList();
    androidCrawlUuids.add("androidCrawlUuids1");
    androidCrawlUuids.add("androidCrawlUuids2");
    androidCrawlUuids.add("androidCrawlUuids3");
    adUrl.setAndroidCrawlUuids(androidCrawlUuids);
    adurlRepository.save(adUrl);
    return true;
  }
}
