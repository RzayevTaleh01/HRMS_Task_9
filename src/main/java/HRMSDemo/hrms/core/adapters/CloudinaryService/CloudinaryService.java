package HRMSDemo.hrms.core.adapters.CloudinaryService;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryService {
        DataResult<?> upload(MultipartFile file);
}
