package com.sabir.convertfile.service;

import com.sabir.convertfile.model.Text;
import com.sabir.convertfile.repository.TextUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@Service
public class TextUploadService {

    @Autowired
    private TextUploadRepository textUploadRepository;

    public void saveTextFile(MultipartFile fileFromUi) throws IOException {

        //TODO use your local directory
        File file = new File("C:\\Users\\USER\\Desktop\\savetxthere\\"+fileFromUi.getOriginalFilename());

        File f1 = new File("C:\\Users\\USER\\Desktop\\savetxthere\\"+fileFromUi.getOriginalFilename());
        fileFromUi.transferTo(f1);

        FileInputStream fstream = new FileInputStream(f1);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String read;

        while ((read = br.readLine()) != null) {
            String[] line = read.split("[|]");

            Text text = new Text(line);

            textUploadRepository.save(text);
        }

        f1.delete();
    }

    public List<Text> getAll(){

        return textUploadRepository.findAll();
    }
}
