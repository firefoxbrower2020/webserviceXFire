package websvr.service;

import websvr.bean.OARequest;
import websvr.bean.OAResponse;
import websvr.bean.ReceiveRequest;

public interface OAService {
    

   // filename文件名 ，base64解码，md5编码前文件的MD5值，用于Base64解码后校验
   String test(String filename,String base64 ,String md5);
   // OAResponse sendFile(OARequest request);
   // OAResponse receiveFile(ReceiveRequest request);
 String sendFile(String id ,String prjID ,String prjName,String fileTypeID,String fileType ,
                 String submmitterID,String submmitterName,String fileID,String fileName,String fileObject ,String fileMD5 );
}
