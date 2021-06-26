package HRMSDemo.hrms.core.adapters.Cloudinary;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public interface CloudinaryService {

    DataResult<?> save(MultipartFile file);
    DataResult<Map> delete (String id) throws IOException;

}
