package controller;

import com.sun.activation.registries.MailcapFile;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
//<%--提交表单，其实所有内容会被封装到request中, 解析request，就能获得数据--%>
public class UserController {
    /*
    *传统方式文件上传
     * */
    @RequestMapping("/fileupload1")
    public String fileupload1(HttpServletRequest request) throws Exception {
        System.out.println("文件上传");
        //使用fileupload组件完成文件上传
        //上传的位置
        String path = request.getSession().getServletContext().getRealPath("uploads");
        //判断该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();  //不存在则创建该文件夹
        }
        System.out.println(path);
        //解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解析request
        List<FileItem> items = upload.parseRequest(request);
        //遍历
        for (FileItem item : items) {
            //判断当前item对象是否是上传文件项
            if (item.isFormField()){
                //说明普通表单项
            }else {
                //说明上传文件项
                //获取上传文件的名称
                String filename = item.getName();

                //可以把文件名称设置唯一值，这样上传相同图片不会替换原图片 uuid
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                filename=uuid+"_"+filename;

                //完成文件上传
                item.write(new File(path,filename));
                //删除临时文件
                item.delete();
            }
        }
        return "success";
    }

    /*
     *springmvc文件上传
     * */
    @RequestMapping("/fileupload2")                  //和文件上传name必须相同 upload 文件上传的
    public String fileupload2(HttpServletRequest request, MultipartFile upload) throws Exception {// 选择文件：<input type="file" name="upload"><br>
        System.out.println("springmvc文件上传");
        //使用fileupload组件完成文件上传
        //上传的位置
        String path = request.getSession().getServletContext().getRealPath("uploads");
        //判断该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();  //不存在则创建该文件夹
        }
        System.out.println(path);
        //不需要传统方式的解析文件

                //说明上传文件项
                //获取上传文件的名称
                String filename = upload.getOriginalFilename();

            //可以把文件名称设置唯一值，这样上传相同图片不会替换原图片 uuid
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                filename=uuid+"_"+filename;

                //完成文件上传
                upload.transferTo(new File(path,filename));

        return "success";
    }
}
