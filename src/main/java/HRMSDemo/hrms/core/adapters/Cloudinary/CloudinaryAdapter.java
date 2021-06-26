package HRMSDemo.hrms.core.adapters.Cloudinary;

import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public class CloudinaryAdapter {
    static Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "coder-group",
            "api_key", "778744187688522",
            "api_secret", "oeIxcWkvIxAl7Ey5PQeTCy5mD74"));

    public static SuccessDataResult<Map> upload(MultipartFile file) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
        return new SuccessDataResult<Map>(uploadResult);
    }

    public static Result delete(String id) throws IOException {
        Map result = cloudinary.uploader().destroy(id, ObjectUtils.emptyMap());
        return new SuccessResult(result.toString());
    }
}
