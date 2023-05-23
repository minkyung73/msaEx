package untitled.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "BoundedContext50", url = "${api.url.BoundedContext50}")
public interface HelloService {
    @RequestMapping(method = RequestMethod.POST, path = "/hellos")
    public void hello(@RequestBody Hello hello);
}