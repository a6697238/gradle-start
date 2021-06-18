package start.es.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import start.es.model.AdUrl;

@Component
public interface AdurlRepository extends ElasticsearchRepository<AdUrl, String> {

}
