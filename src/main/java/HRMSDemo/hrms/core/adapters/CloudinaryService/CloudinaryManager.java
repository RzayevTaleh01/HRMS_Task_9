package HRMSDemo.hrms.core.adapters.CloudinaryService;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.ErrorDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public class CloudinaryManager implements CloudinaryService{
    private Cloudinary cloudinary;

    @Autowired
    public CloudinaryManager(Cloudinary cloudinary) {
        super();
        this.cloudinary = cloudinary;
    }

    @Override
    public DataResult<?> upload(MultipartFile file) {
        try{
            Map uploadResult = cloudinary.uploader().upload(file.getBytes(),
                    ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(uploadResult);
        } catch (IOException e){
            e.printStackTrace();
        }
        return new ErrorDataResult<Map>();
    }
}

